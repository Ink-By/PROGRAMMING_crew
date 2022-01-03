package dongari;
import java.util.*;

public class Filterproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		String[] num = sc.nextLine().split("");
		for(int i = 0; i < num.length; i++) {
			list.add(Integer.parseInt(num[i]));
		}
		
		list.stream().filter(t -> t%2 != 0).forEach(a -> System.out.print(a));
		
		sc.close();

	}

}
