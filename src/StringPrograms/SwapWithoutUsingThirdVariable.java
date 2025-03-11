package StringPrograms;

public class SwapWithoutUsingThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="java";
          String s1="api";
          s=s+s1;
          s1=s.substring(0, s.length()-s1.length());
          s=s.substring(s1.length());
          System.out.println(s);
          System.out.println(s1);
	}

}
