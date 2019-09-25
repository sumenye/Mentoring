package JavaInterviewQuestions;

public class BubbleSort {
	    //Develop a code that sorts array with numbers
	    public static void main(String[] args) {
	        int [] numbers=new int[] { 20, 12, 45, 19, 91, 55 };
	        int temp=0;
	        for (int i = 0; i < numbers.length; i++)
	        {
	            for (int j = numbers.length -1; j > i; j--)
	            {
	                if (numbers[j] < numbers[j - 1])
	                {
	                    temp=numbers[j-1];
	                    numbers[j-1]=numbers[j];
	                    numbers[j]=temp;
	                }
	            }
	            System.out.println();
	        }
	        // Print sorted numbers
	        for (int num:numbers)
	        {
	            System.out.print(num+" ");
	        }
	       }
	}

