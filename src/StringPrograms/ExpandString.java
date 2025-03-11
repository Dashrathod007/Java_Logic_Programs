package StringPrograms;

public class ExpandString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a2b2a1b1c1";
		for (int i = 0; i < s.length(); i = i + 2) {
			char ch = s.charAt(i);

			int count = s.charAt(i + 1) - 48;// Asci value(50-48=2)

			for (int j = 1; j <= count; j++) {
				System.out.print(ch);
			}
		}
	}

}
