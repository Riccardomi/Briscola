import java.util.*;

public class Mazzo{
	public ArrayListStack<Carta> mazzo = new ArrayListStack<Carta>();
	
	public Mazzo() {
		//Dichiaro un array dove temporaneamente disponiamo le carte in ordine
		List<Carta> tempMazzo = new ArrayList<Carta>();
		for(int i=0;i<4;i++)
			for(int j=1;j<11;j++)
				tempMazzo.add(new Carta(i,j));
		//System.out.println(tempMazzo+"\n-----Arrimino-----");
		//Dispongo casualmente le carte nell'array..
		Collections.shuffle(tempMazzo);
		//System.out.println(tempMazzo);
		//..e trasformo l'array in pila
		for (int i=0; i<40; i++) 
			this.mazzo.push(tempMazzo.get(i)); 
	}

	public void setBriscole(int seme) {
		for (int i=0; i<39; i++) {
			if (this.mazzo.get(i).getSeme() == seme)
				this.mazzo.get(i).setBriscola();
		}
	}
}
