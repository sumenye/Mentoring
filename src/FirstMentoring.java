import java.util.Scanner;

public class FirstMentoring {

	public static void main(String[] args) {
	
//SUBSTRING
		//Repl.66---->Write a program that will print out first half of the word twice. 	
		//Example:input: Rabbit---->output: RabRab
		
				    //01234----->the last charater's index number is 4. the length of the string is 5.
		//String str = "Hello";
	//	System.out.println(str.substring(0,3)+str.substring(0,3));
		
	
	
//INDEXOF
				    //012345678901234567890123456789------>total length is 30, last char index is 29
	/*String myWords = "America runs in Dunkin Donuts!";
	int lengthOfSentence = myWords.length();
	 System.out.println(myWords.indexOf("in"));
    System.out.println(myWords.indexOf("in",14 ));	
    
    int indexOfSpace = myWords.indexOf(" ");
    System.out.println(indexOfSpace);
    System.out.println(myWords.indexOf(" ",14));//------>it will find the third space for me*/
    
   
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name:");
    String input = scan.nextLine();
 //Repl.60: Write a program that will verify if word contains in the sentence. Print out the result as boolean value. 
    boolean boo = input.contains("x");
    boolean boo2 = (input.toUpperCase().contains("x"));
    System.out.println(boo);
    
    //CODE FOR REPL 60: //WRITE YOUR CODE HERE
  // boolean availability = sentence.contains(word);
    //System.out.println(availability); 
    
    
    
    //charAt Method------> it gives you the character that you give the index number
    
    				 //01234567890123456
  //  String myObject = "Mentoring Session";
  //  System.out.println(myObject.charAt(7));

    
		
		
	}

}
