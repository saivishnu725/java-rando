import java.util.*;
class ArrList {
		public static void main(String[] args) {
				ArrayList<String> s = new ArrayList<String>();
				s.add("Hello, ");
				s.add("World!!");
				//System.out.println(s[0] + s[1]);
				System.out.println(s.get(0) + s.get(1));
				ArrayList<Integer> i = new ArrayList<Integer>();
				i.add(1);
				i.add(2);
				Iterator<Integer> ii = i.iterator();
				while(ii.hasNext())
						System.out.print(ii.next() + " " );
				System.out.println();
				Iterator<String> si = s.iterator();
				while(si.hasNext())
						System.out.print(si.next());
				System.out.println();
		}
}
