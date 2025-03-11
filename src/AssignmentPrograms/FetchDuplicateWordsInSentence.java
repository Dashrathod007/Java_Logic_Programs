package AssignmentPrograms;

import java.util.Arrays;
import java.util.List;

public class FetchDuplicateWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "My name is Priam is name Priam";
		String[] str = s.split(" ");

		List<String> lw = Arrays.asList(str);

		for (int i = 0; i < lw.size(); i++) {
			String word = lw.get(i);
			if (lw.indexOf(word) != lw.lastIndexOf(word) && i == lw.indexOf(word)) {
				System.out.println(word);
			}
		}

	}

}
