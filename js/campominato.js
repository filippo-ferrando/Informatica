function Modulo(){
    // ### FORM ###

    var nickname = document.modulo.nickname.value;
    var dimensioni = document.modulo.dim.options[document.modulo.dim.selectedIndex].value;
    var diffBassa = document.getElementById("bassa")
    var diffAlta = document.getElementById("alta")
    var grid = document.getElementById("grid");
    var testMode = true; //Turn this variable to true to see where the mines are
    var diffScelta

    if ((nickname == "") || (nickname == "undefined")) {
        alert("Il campo Nickname è obbligatorio.");
        document.modulo.nickname.focus();
        return false;
    }

    if ((dimensioni == "") || (dimensioni == "undefined")) {
        alert("Il campo Dimensioni è obbligatorio.");
        document.modulo.citta.focus();
        return false;
        }

    if ((diffAlta.checked)) {
        diffScelta = 2
    }else{
        diffScelta = 1
    }

    console.log(nickname)
    console.log(dimensioni)
    console.log(diffScelta)

    // ### GAME ###

   // 
    
        
    generateGrid();

    function generateGrid() {
  
    grid.innerHTML="";
    for (var i=0; i<dimensioni; i++) {
        row = grid.insertRow(i);
        for (var j=0; j<dimensioni; j++) {
        cell = row.insertCell(j);
        cell.onclick = function() { clickCell(this); };
        var mine = document.createAttribute("data-mine");       
        mine.value = "false";             
        cell.setAttributeNode(mine);
        }
    }
    if(diffScelta == 1){
        addMinesFacile();
    }else{
        addMinesDifficile();
    }
    
    }

    function addMinesFacile() {
    //Add mines randomly
    for (var i=0; i<(dimensioni*2); i++) {
        var row = Math.floor(Math.random() * dimensioni);
        var col = Math.floor(Math.random() * dimensioni);
        var cell = grid.rows[row].cells[col];
        cell.setAttribute("data-mine","true");
        if (testMode) cell.innerHTML="X";
    }
    }

    function addMinesDifficile() {
        //Add mines randomly
        for (var i=0; i<(dimensioni*3); i++) {
            var row = Math.floor(Math.random() * dimensioni);
            var col = Math.floor(Math.random() * dimensioni);
            var cell = grid.rows[row].cells[col];
            cell.setAttribute("data-mine","true");
            if (testMode) cell.innerHTML="X";
        }
        }

    function revealMines() {
        //Highlight all mines in red
        for (var i=0; i<dimensioni; i++) {
        for(var j=0; j<dimensioni; j++) {
            var cell = grid.rows[i].cells[j];
            if (cell.getAttribute("data-mine")=="true") cell.className="mine";
        }
        }
    }

    function checkLevelCompletion() {
    var levelComplete = true;
        for (var i=0; i<dimensioni; i++) {
        for(var j=0; j<dimensioni; j++) {
            if ((grid.rows[i].cells[j].getAttribute("data-mine")=="false") && (grid.rows[i].cells[j].innerHTML=="")) levelComplete=false;
        }
    }
    if (levelComplete) {
        alert(nickname + " You Win!");
        revealMines();
        setTimeout(() => { generateGrid(); }, 2000)
    }
    }

    function clickCell(cell) {
    //Check if the end-user clicked on a mine
    if (cell.getAttribute("data-mine")=="true") {
        revealMines();
        alert(nickname + " Game Over");
        setTimeout(() => { generateGrid(); }, 2000)
    } else {
        cell.className="clicked";
        //Count and display the number of adjacent mines
        var mineCount=0;
        var cellRow = cell.parentNode.rowIndex;
        var cellCol = cell.cellIndex;
        //alert(cellRow + " " + cellCol);
        for (var i=Math.max(cellRow-1,0); i<=Math.min(cellRow+1,(dimensioni-1)); i++) {
        for(var j=Math.max(cellCol-1,0); j<=Math.min(cellCol+1,(dimensioni-1)); j++) {
            if (grid.rows[i].cells[j].getAttribute("data-mine")=="true") mineCount++;
        }
        }
        cell.innerHTML=mineCount;
        if (mineCount==0) { 
        //Reveal all adjacent cells as they do not have a mine
        for (var i=Math.max(cellRow-1,0); i<=Math.min(cellRow+1,(dimensioni-1)); i++) {
            for(var j=Math.max(cellCol-1,0); j<=Math.min(cellCol+1,(dimensioni-1)); j++) {
            //Recursive Call
            if (grid.rows[i].cells[j].innerHTML=="") clickCell(grid.rows[i].cells[j]);
            }
        }
        }
        checkLevelCompletion();
    }
    }


}