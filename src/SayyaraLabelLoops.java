
public class SayyaraLabelLoops {

	public static void main(String[] args) {
		int i;
		outer:	for ( i = 1; i < 5; i++) {//outer
			inner:	for (int j = 1; j < 5; j++) {//inner
					
					if(i==2) {
						continue outer;
					}
					System.out.println("i="+i+" and j="+j);//break 
				}
		}
	}
}

