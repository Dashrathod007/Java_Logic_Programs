package AssignmentPrograms;

public class SwapFirstAndLastWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Welcome to tp office";
        System.out.println("Before swapping first and last words in sentence: "+s);
        String[] str=s.split(" ");
        String temp=str[0];
        str[0]=str[str.length-1];
        str[str.length-1]=temp;
        System.out.println("----SWAPPED-----");
        System.out.println("After swapping first and last words in sentece: "+String.join(" ", str));
	}

}
