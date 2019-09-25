
public class SayyareChessBoard {

	public static void main(String[] args) {
		String[][] chessBoard = new String[8][8];
		for (int i = 1; i < 9; i++) {
			System.out.println("I am outer loop and my value is" + i);
			int j = 0;
			for (char x = 'a', j1 = 0; x <= 'h'; x++, j++) {
				
				System.out.println("outer"+i+" inner is " + x);
				
				chessBoard[i - 1][j] = "" + i + x;
				//System.out.print("" + i + x);

			}
			System.out.println();

		}
	}

}
