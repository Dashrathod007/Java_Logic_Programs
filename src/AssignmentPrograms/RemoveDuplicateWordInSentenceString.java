package AssignmentPrograms;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordInSentenceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nature is very very is nature beautiful";
		String[] str = s.split(" ");
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			hs.add(str[i]);

		}
		for (String hSet : hs) {
			System.out.print(hSet + " ");
		}

	}
}
