package AssignmentPrograms;

public class FetchDuplicatesInChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabbabacecdf";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (s.indexOf(ch) != s.lastIndexOf(ch) && i == s.indexOf(ch)) {
				System.out.print(ch + " ");
			}
		}
          
	}

}
