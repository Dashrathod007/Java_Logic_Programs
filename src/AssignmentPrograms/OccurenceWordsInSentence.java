package AssignmentPrograms;

import java.util.LinkedHashMap;

public class OccurenceWordsInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nature nature is very very beautiful";
		String[] str = s.split(" ");
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < str.length; i++) {
			String temp = str[i];
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
			} else {
				hm.put(temp, 1);
			}
		}
		System.out.println(hm);

	}

}
