package AssignmentPrograms;

public class ReverseSentenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Welcome to tp office";
		String[] str = s.split(" ");

		for (int i = str.length - 1; i >= 0; i--) {
			String s1 = str[i];
			System.out.print(s1 + " ");
		}

	}

}
