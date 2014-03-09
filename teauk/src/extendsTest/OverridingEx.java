package extendsTest;




 class Parent {

	
	String msg="부모 클래스";
	
	
	
	
	public String getMsg() {
		return msg;
	}




	public void setMsg(String msg) {
		this.msg = msg;
	}

}


class Child extends Parent{
	
	String msg="자식 클래스";
	public String getMsg(){
		return msg;
		
	}
	
}



public class OverridingEx {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Child cd=new Child();
		System.out.println("cd: "+cd.getMsg());
		
		Parent pt=new Child();
		System.out.println("pt: "+pt.getMsg());
		
	}

}
