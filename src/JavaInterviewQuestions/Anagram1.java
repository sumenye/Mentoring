package JavaInterviewQuestions;

public class Anagram1 {

	// Develop a code that prints true if two String has same characters
	    public static void main(String[] args) {
	        String str1="aabaa";
	        String str2="aaaab";
	        boolean isAnagram=true;
	        boolean letterCheck=false;
	        if(str1.length()!=str2.length()) isAnagram=false;
	            else {
	                for(int i=0;i<str1.length();i++){
	                    for(int j=0;j<str2.length();j++ ){
	                        letterCheck=false;
	                        if(str1.charAt(i)==str2.charAt(j)) {
	                            letterCheck=true;
	                           //I added this part for iteration of characters if there is any
	                            str2=str2.substring(0,j)+str2.substring(j+1);
	                            //str2=str2.replace(""+str2.charAt(j),"");
	                            break;
	                        }
	                    }
	                    if (letterCheck==false ){ isAnagram=false; break;}
	                }
	        }
	        System.out.println(isAnagram);
	    }
}
