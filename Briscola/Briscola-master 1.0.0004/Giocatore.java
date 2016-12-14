public class Giocatore{
	public Carta[] mano = new Carta[3];
	public ArrayList<Carta> mazzetto = new ArrayList<>();
	 
	public Giocatore(Carta a, Carta b, Carta c){
		mano[0]=a;
		mano[1]=b;
		mano[2]=c;
	}

	public Carta scarta(int i){
		Carta tmp = mano[i];
		mano[i]=null;
		return tmp;
	}
	
	public void pesca(Carta a){
		for(int i=0;i<3;i++)
			if(mano[i]==null)
				mano[i]=a;
	}
	
	public void presa(Carta a, Carta b){
		mazzetto.add(a);
		mazzetto.add(b);
	}
	
	@Override
	public String toString(){
		return this.mano[0]+" " +this.mano[1]+" "+ this.mano[2];
	}
}
