package arraysTest;

import java.util.Arrays;

public class ArraysEx2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ar1={"fill()","in","the","arrays"};
		
		String[] ar2={"fill()","in","","arrays"};
		
		if(!Arrays.equals(ar1, ar2)){
			System.out.println("�� �迭�� �ٸ��ϴ�");
			
		}
		
		System.out.println("=====================");
		
		
		Arrays.fill(ar2,2,3,"the");
		if(!Arrays.equals(ar1,ar2)){
			System.out.println("�� �迭�� �ٸ��ϴ�.");
			
		}
		else{
			System.out.println("�� �迭�� �����ϴ�.");
		}
	}

}
