package interfaceTest;

public class EnumEX1 {


	public enum Lesson{
		JAVA,XML,EJB
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lesson le=Lesson.JAVA;
		
		System.out.println(le);
		System.out.println(Lesson.XML);
	}

}
