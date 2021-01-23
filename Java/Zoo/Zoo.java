public class Zoo {
	private String nome;
	private Animale[] gabbie;
	private final int DIM;
	private int nAnimali;

	public Zoo(String nome, int dim) {
		DIM = dim>0 ? dim : 100;
		this.nome = nome;
		this.gabbie = new Animale[DIM];
		nAnimali = 0;
	}

	public void add(Animale a){
		if (nAnimali < DIM)
			gabbie [nAnimali++] = a;
	}
	public void presentatevi(){
		for (int k = 0; k < gabbie.length; k++) {
			gabbie[k].verso();










				}


	}
}
