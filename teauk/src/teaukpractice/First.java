package teaukpractice;

public class First {

		public static void test(Object ...args){//vararge
			
			
			for (Object n: args){
				System.out.println(n+",");
			}
			System.out.println();
			
			
			
		}
	

	
	
	public static void main(String[] args) {
	
		
		
		String  [] ar={"a","b","c"};
		
		for(String n:ar)
		{
			System.out.println(n);
		}
		
		System.out.printf("%s %5d%n","����:",500);

		
		test("java5");
		test("varage","test!","java5");
		test(new Integer(1000), new Float(3.14));
		
		int su=5;
		String str="java plus";
		
		do{
			System.out.println(str);
		}while(su-->10);
		
		
		label1:
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(j==3){
					
					
					System.out.println("i��:"+i+", j��:"+j);
					
					break label1;
				}
				System.out.println("j�ݺ���");
			}
			
			System.out.println("i�ݺ���");
		}//end for 1
		
		System.out.println("end label");
		
	}

}
