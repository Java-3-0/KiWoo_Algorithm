import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

//메모리 : 17,504kb
//시간 : 452

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < k; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			if (s.equals("push")) {
				int num = Integer.parseInt(st.nextToken());
				list.add(num);
			} else if (s.equals("pop")) {
				if (list.size() != 0) {
					System.out.println(list.get(list.size() - 1));
					list.remove(list.size() - 1);
				} else
					System.out.println(-1);
			} else if (s.equals("top")) {
				if (list.size() == 0)
					System.out.println(-1);
				else {
					System.out.println(list.get(list.size() - 1));
				}
			} else if (s.equals("size")) {
				System.out.println(list.size());
			} else if (s.equals("empty")) {
				if (list.size() == 0)
					System.out.println(1);
				else
					System.out.println(0);
			}

		}
	}
}
