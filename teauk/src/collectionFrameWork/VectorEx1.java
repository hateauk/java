package collectionFrameWork;

import java.util.Vector;

public class VectorEx1 {

	
	public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>(2,5);

		System.out.println("==============���� ������============");
		System.out.println("capacity: "+v.capacity());
		
		System.out.println("size:"+ v.size());
		
		
		//�ڿ��߰�
		v.add("������");
		v.add("ronaldo");
		v.addElement("r.messi");
		
		System.out.println("===========����߰���============");
		
	System.out.println("capacity: "+v.capacity());
		
		System.out.println("size:"+ v.size());
		
	}

}
