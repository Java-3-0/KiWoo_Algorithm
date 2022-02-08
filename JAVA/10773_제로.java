
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

//메모리 : 94,844kb
//시간 : 724ms

public class Main {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int num = k;
		
		for(int i = 0; i<k; i++) {
			int n = in.nextInt();
			if(n==0) {
				if(list.size() <= 0) continue;
				else {
					list.remove(list.size()-1);
					
				}
			}
			else {
				list.add(n);
			}
			
		}
		
		int sum = 0;
		for(int i : list) {
			sum = sum + i;
		}
		
		System.out.println(sum);
		
	}
}
