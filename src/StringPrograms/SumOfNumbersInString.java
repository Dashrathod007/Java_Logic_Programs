package StringPrograms;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="a1b34%c5";
         int sum=0;
         for(int i=0; i<s.length(); i++) {
        	char ch=s.charAt(i);
        	if(ch>=48 && ch<=57) {
        		sum= sum+ch-48;
        	}
         }
         System.out.println(sum);
	}

}
