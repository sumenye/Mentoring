package JavaInterviewQuestions;

public class PalindromeString {
	 public static void main(String[] args) {
	        String str="Ana";
	        String rev="";
	        for(int i=str.length()-1;i>=0;i--)
	        {
	            rev+=str.charAt(i);
	        }
	        System.out.println(rev);
	        if(str.equalsIgnoreCase(rev)) System.out.println("Palindrome");
	            else System.out.println("Not a Palindrome");
	    }

}
