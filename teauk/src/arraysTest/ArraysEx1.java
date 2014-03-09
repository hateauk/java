package arraysTest;

import java.util.Arrays;

public class ArraysEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		String[] ar={"fill()","in","the","arrays"};
		
		Arrays.fill(ar, "teauk");
		
		for(String str: ar){
			
			System.out.print(str+",");
		}
			System.out.println("\n====================");
			Arrays.fill(ar, 1,3,"love");
			for(String str:ar){
				System.out.println(str+",");
			}
		}

	}


