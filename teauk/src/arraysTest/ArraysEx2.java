package arraysTest;

import java.util.Arrays;

public class ArraysEx2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ar1={"fill()","in","the","arrays"};
		
		String[] ar2={"fill()","in","","arrays"};
		
		if(!Arrays.equals(ar1, ar2)){
			System.out.println("두 배열이 다릅니다");
			
		}
		
		System.out.println("=====================");
		
		
		Arrays.fill(ar2,2,3,"the");
		if(!Arrays.equals(ar1,ar2)){
			System.out.println("두 배열이 다릅니다.");
			
		}
		else{
			System.out.println("두 배열이 같습니다.");
		}
	}

}
