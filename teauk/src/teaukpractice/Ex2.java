package teaukpractice;

public class Ex2 {


	String color="red";
	
	int number=90;
	
	static String maker="ugi";
	
	
	public static void main(String[] args) {
		

		
		Ex2 a=new Ex2();
		
		Ex2 b=new Ex2();
		
		a.color="blue";
		
		b.color="black";
		
		System.out.println(a.maker);
		System.out.println(a.color);
		System.out.println(b.color);
		
		a.maker="bugi";
		
		System.out.println(b.maker);
	}

}
