public class Carta implements Comparable<Carta>{
	private static int count = 0;
	private final int i;
	private int seme;
	private int valore;
	private int punteggio; 
	private boolean b;
	
	public Carta(int seme, int valore){
		this.seme=seme;
		this.valore=valore;
		this.i=++count;
		
		switch(valore){
			case 1: this.punteggio=11;
					break;
			case 3: this.punteggio=10;
					break;
			case 10: this.punteggio=4;
					break;
			case 9: this.punteggio=3;
					break;
			case 8: this.punteggio=2;
					break;
			default: this.punteggio=valore;
					break;
		}
	}
	
	public int getValore(){
		return this.valore;
	}
	
	public int getSeme(){
		return this.seme;
	}	
	
	public boolean getBriscola(){
		return this.b;
	}
	
	public int getPunteggio(){
		return this.punteggio;
	}
	
	public void setBriscola(){
		this.b=true;
	}
	
	@Override
	public String toString() {
		if (this.getSeme() == 0) 
			return (this.getValore()+ "B " + this.getBriscola());
		if (this.getSeme() == 1) 
			return (this.getValore()+ "S " + this.getBriscola());
		if (this.getSeme() == 2) 
			return (this.getValore()+ "D " + this.getBriscola());
		else 
			return (this.getValore()+ "C " + this.getBriscola());
	}
	
	@Override
	public int compareTo(Carta a){		
		if(a.getBriscola() && !this.getBriscola())
			return -1;
		else if(!a.getBriscola() && this.getBriscola())
				return 1;
			else if(this.getSeme()!=a.getSeme())
					return 1;
				else if(this.getPunteggio()>a.getPunteggio())
					return 1;
					else return -1;
	}
}

