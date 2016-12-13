import java.util.*;
public class Mazzo{
	private List<Carta> mazzo = new ArrayList<Carta>();
	
	
	public Mazzo(){
		for(int i=0;i<4;i++)
			for(int j=0;j<10;j++)
				mazzo.add(new Carta(i,j));
		Collections.shuffle(mazzo);
	}
	private ArrayListStack<Carta> mazzoShuffle = new ArrayListStack<Carta>();
	mazzoShuffle.copia(mazzo);
	
	public static void main (String[] args){
		Mazzo a = new Mazzo();
		System.out.println(a);
	}
}