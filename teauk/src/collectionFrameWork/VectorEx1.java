package collectionFrameWork;

import java.util.Vector;

public class VectorEx1 {

	
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>(2,5);

		System.out.println("==============벡터 생성시============");
		System.out.println("capacity: "+v.capacity());
		
		System.out.println("size:"+ v.size());
		
		
		//자원추가
		v.add("박지성");
		v.add("ronaldo");
		v.addElement("r.messi");
		
		System.out.println("===========요소추가후============");
		
	System.out.println("capacity: "+v.capacity());
		
		System.out.println("size:"+ v.size());
		
	}

}
