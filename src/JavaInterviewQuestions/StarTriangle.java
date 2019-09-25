package JavaInterviewQuestions;

public class StarTriangle {
	 //Develope a code that prints triangle with stars.
    //num is the number of lines
    public static void main(String[] args) {
        int num=5;
  for(int i=1; i<=num;i++ )
  {
      for(int j=num-1;j>=i;j--)
      {
          System.out.print(" ");
      }
      for (int k=1;k<=2*(i-1)+1;k++)
      {
          System.out.print("*");
      }
      System.out.println();
  }
  }
}
