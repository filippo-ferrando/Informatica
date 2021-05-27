function Modulo() {
    // ### FORM ###

    var nickname = document.modulo.nickname.value; //campo nickname
    var dimensioni = document.modulo.dim.options[document.modulo.dim.selectedIndex].value; //spinner scelta dimensione
    var diffBassa = document.getElementById("bassa") //difficoltà bassa
    var diffAlta = document.getElementById("alta") //difficoltà alta
    var grid = document.getElementById("grid"); //griglia per gioco
    var debugButton = document.getElementById("debug"); //debug checkbox
    var testMode = debugButton.checked; //selettore testMode
    var diffScelta

    if ((nickname == "") || (nickname == "undefined")) {    //Controllo dell'input sul nickname
        alert("Il campo Nickname è obbligatorio.");
        document.modulo.nickname.focus();
        return false;
    }

    if ((dimensioni == "") || (dimensioni == "undefined")) {    //Controllo dell'input sul campo dimensioni
        alert("Il campo Dimensioni è obbligatorio.");
        document.modulo.citta.focus();
        return false;
    }

    if ((diffAlta.checked)) {   //Controlla la difficoltà scelta
        diffScelta = 2
    } else {
        diffScelta = 1
    }

    //console.log(nickname)     //debug options
    //console.log(dimensioni)
    //console.log(diffScelta)

    // ### GAME ###


    generateGrid();

    function generateGrid() {       //crea la tabella girando con 2 cicli for per la dimensione scelta (dimensioni.value)

        grid.innerHTML = "";
        for (var i = 0; i < dimensioni; i++) {
            row = grid.insertRow(i);
            for (var j = 0; j < dimensioni; j++) {
                cell = row.insertCell(j);
                cell.onclick = function () { clickCell(this); };
                var mine = document.createAttribute("data-mine");
                mine.value = "false";
                cell.setAttributeNode(mine);
            }
        }
        if (diffScelta == 1) {  //chiamo la funzione per generare le mine in base alla difficoltà
            addMinesFacile();
        } else {
            addMinesDifficile();
        }

    }

    function addMinesFacile() { //aggiungo mine in modo randomico per la dimensione della tabella
        for (var i = 0; i < (dimensioni * 2); i++) {
            var row = Math.floor(Math.random() * dimensioni);
            var col = Math.floor(Math.random() * dimensioni);
            var cell = grid.rows[row].cells[col];
            cell.setAttribute("data-mine", "true");
            if (testMode) cell.innerHTML = "X";
        }
    }

    function addMinesDifficile() {  //aggiungo mine in modo randomico per 3 volte il lato della tabella
        for (var i = 0; i < (dimensioni * 3); i++) {
            var row = Math.floor(Math.random() * dimensioni);
            var col = Math.floor(Math.random() * dimensioni);
            var cell = grid.rows[row].cells[col];
            cell.setAttribute("data-mine", "true");
            if (testMode) cell.innerHTML = "X";
        }
    }

    function revealMines() {    //funzione per ricercare le mine inserite nel campo e "marcarle" (fine gioco)
        for (var i = 0; i < dimensioni; i++) {
            for (var j = 0; j < dimensioni; j++) {
                var cell = grid.rows[i].cells[j];
                if (cell.getAttribute("data-mine") == "true") cell.className = "mine";
            }
        }
    }

    function checkLevelCompletion() {   //controlla se tutte le caselle sono state "toccate" dall'utente e se si vinci, dopo 2 secondi ricreerà la tabella con gli stessi settaggi della precedente
        var levelComplete = true;
        for (var i = 0; i < dimensioni; i++) {
            for (var j = 0; j < dimensioni; j++) {
                if ((grid.rows[i].cells[j].getAttribute("data-mine") == "false") && (grid.rows[i].cells[j].innerHTML == "")) levelComplete = false;
            }
        }
        if (levelComplete) {
            alert(nickname + " - Hai Vinto :)");
            revealMines();
            setTimeout(() => { generateGrid(); }, 2000)
        }
    }

    function clickCell(cell) {      //funzione per controllare se il giocatore ha toccato una bomba (e farlo perdere quindi) e cliccare le caselle per segnarle
        if (cell.getAttribute("data-mine") == "true") {
            revealMines();
            alert(nickname + " - Hai Perso :(");
            setTimeout(() => { generateGrid(); }, 2000)
        } else {
            cell.className = "clicked";
            var mineCount = 0;
            var cellRow = cell.parentNode.rowIndex;
            var cellCol = cell.cellIndex;
            for (var i = Math.max(cellRow - 1, 0); i <= Math.min(cellRow + 1, (dimensioni - 1)); i++) {
                for (var j = Math.max(cellCol - 1, 0); j <= Math.min(cellCol + 1, (dimensioni - 1)); j++) {
                    if (grid.rows[i].cells[j].getAttribute("data-mine") == "true") mineCount++;
                }
            }
            cell.innerHTML = mineCount;
            if (mineCount == 0) {
                for (var i = Math.max(cellRow - 1, 0); i <= Math.min(cellRow + 1, (dimensioni - 1)); i++) {
                    for (var j = Math.max(cellCol - 1, 0); j <= Math.min(cellCol + 1, (dimensioni - 1)); j++) {
                        //Recursive Call
                        if (grid.rows[i].cells[j].innerHTML == "") clickCell(grid.rows[i].cells[j]);
                    }
                }
            }
            checkLevelCompletion();
        }
    }


}