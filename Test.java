import java.util.*;

public class Test{
	public static void main(String[] args){
		List<Integer> solution = new ArrayList<>();
		for (int i = 1; i <= 6; i++)
		{
			solution.add(i);
		}
		Collections.shuffle(solution);
		for(int i: solution)
			System.out.println(i);
	}
}