import java.util.*;

public class Mazzo{
	private ArrayListStack<Carta> mazzo = new ArrayListStack<Carta>();
	
	public Mazzo() {
		//Dichiaro un array dove temporaneamente disponiamo le carte in ordine
		List<Carta> tempMazzo = new ArrayList<Carta>();
		for(int i=0;i<4;i++)
			for(int j=1;j<11;j++)
				tempMazzo.add(new Carta(i,j));
		System.out.println(tempMazzo+"\n-----Arrimino-----");
		//Dispongo casualmente le carte nell'array..
		Collections.shuffle(tempMazzo);
		System.out.println(tempMazzo);
		//..e trasformo l'array in pila
		for (int i=0; i<40; i++) 
			this.mazzo.push(tempMazzo.get(i)); 
	}

	public static void main (String[] args){
		Mazzo a = new Mazzo();
		System.out.println("--------------------------------------\nA briscola:");
		System.out.println(a.mazzo.top());
	}
}
