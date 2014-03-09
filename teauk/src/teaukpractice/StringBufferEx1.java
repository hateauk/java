package teaukpractice;

public class StringBufferEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var=0;
		StringBuffer sb=new StringBuffer("tea uk");
		var = sb.capacity();
		System.out.println("capacity="
				+var);
		
		var=sb.length();
		System.out.println("length="+var);
		
		
		StringBuffer sb1=new StringBuffer("tea uk");
		StringBuffer sb2=sb1.append(" chun jae");
		
		sb2.insert(7, "sama");
		
		String msg="";
		if(sb1==sb2){
			msg="둘은 같다";
		}
			else{
				msg="다르다";
			}
			
		System.out.println(msg);
		
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		
	}

}
