import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListArrayErdem {

	public static void main(String[] args) {
		
		int count =0;
	
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = {1,2,2,3,4,5,3,7,8};
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i-1]==arr[i]) {
				count++;
				if(count>=1) {
					list.add(arr[i]);
				
				}
				}
		}
		
		
//		for (int i = 0; i < arr.length; i++) { // 2
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//			}
//
//			if (count>1) {
//				list.add(arr[i]);
//			}
//			count = 0;
//		}
		System.out.println(list);
	}

}
