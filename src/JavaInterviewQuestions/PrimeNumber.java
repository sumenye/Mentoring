package JavaInterviewQuestions;

public class PrimeNumber {

    // We need to limit our scope as greater than 1
    // We need to check if the number can be divided by any number other than the number itself
    public static void main(String[] args) {
        int num=18;
        String prime="Prime Number";
        if (num<=1) {
           prime="Not a Prime Number";
        }
            else {
                for(int i=2; i<=num/2;i++){
                    if(num%i==0) prime="Not a Prime Number";
                }
            }
        System.out.println(prime);
        }

}
