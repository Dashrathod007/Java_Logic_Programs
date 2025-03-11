package StringPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Welcome to tp office";
        String[] str=s.split(" ");
        for(int i=0; i<str.length; i++) {
        String s1=str[i];
        StringBuilder sb=new StringBuilder(s1).reverse();
        System.out.print(sb+" ");
	}

}
}

//Without using StringBuilder class
// String rev="";
//for(){
// rev=rev=rev+s1.charAt(j)
//}
//System.out.print(sb+" ");
