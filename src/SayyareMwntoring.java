
public class SayyareMwntoring {

	public static void main(String[] args) {
		String str="404 Error, @  505 Error";

		System.out.println("The number are "+str.replaceAll("[^0-9]", ""));
		System.out.println("The letter are "+str.replaceAll("[^A-z]", ""));
		System.out.println("The charecter is "+str.replaceAll("[^@]", ""));
	}

}
