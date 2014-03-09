package interfaceTest;


class Product {
	private String name;
	private int price;
	
	public Product(String name,Integer price){
		
		this.name=name;
		this.price=price;
	}
	//객체 비교  equals 와 변수및 상수비교 == 를 구분할것 
public boolean equals(Object obj){
	boolean result=false;
	if((obj!=null)&&(obj instanceof Product)){
		Product p=(Product)obj;
		if((name.equals(p.name))&&(price==(p.price))){
			result=true;
		}
		
	}
	return result;
}
	
	public int hashCode(){
		
		return ((name.hashCode())^(new Integer(price).hashCode()));
	}
	
	public String tostString(){
		return name;
		
	}
}









public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Product p1=new Product("en, ca",7080);
		Product p2=new Product("en, ca",7080);
		
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println("p1 hashcode: "+p1.hashCode()+",p1" +p1);
		System.out.println("p2 hashcode: "+p2.hashCode()+",p2" +p2);
		
	}

}
