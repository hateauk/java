package interfaceTest;
 class Ugi{
	int age=30;
	String name="���¿�";
	
	public int  getage(){
		
		return age;
	}
	
}
public class EnumEX2 {


	private enum Item{
		add,del,search,cancel
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ugi ugi=new Ugi();
		
		int age=ugi.age;
		System.out.println(age);
		
		System.out.println(ugi.name);
		
		Item a1=Item.search;
		
		if (a1 instanceof Object){
			
			
			System.out.println("a1.tostring����?:"+a1.toString());
			System.out.println("ok! instanceof object");
			System.out.println("����� ���� ������: "+a1.ordinal());//ordinal:���� enumeration:��,���,���� ,���,�϶�ǥ 
			
			
		}
		
		
		
		
		Item[] items=Item.values();
		System.out.println("item.length: "+items.length);
		
		for(Item n:Item.values())

			System.out.println(n+":"+n.ordinal());
		
		
	}

}
