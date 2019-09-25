package JavaInterviewQuestions;

public class PalindromeNumber {
		// Develop a code that takes a number and prints if it is a Palindrome or Not a Palindrome
		    public static void main(String[] args) {
		    int num=101;
		    int r=0;
		    int rev=0;
		    int temp=num;
		   while(num>0){
		       r=num%10;
		       rev=(rev*10)+r;
		       num=num/10;
		       System.out.println(rev);
		       //System.out.println(num);
		   }
		   if(temp==rev) System.out.println("Palindrome");
		   else System.out.println("Not a Palindrome");
		    }
}
