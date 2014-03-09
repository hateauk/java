package genericTest;

public class GenericExMain {

	
	public static void main(String[] args) {
	
		GenericEx1<String> t =new GenericEx1<String>();
		
		String[] ss={"го","еб","©М"};
		t.set(ss);
		t.print();
		

	}

}
