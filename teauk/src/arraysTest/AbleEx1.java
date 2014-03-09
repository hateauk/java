package arraysTest;

import java.util.Arrays;
import java.util.Vector;

public class AbleEx1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vector<Able> v =new Vector<Able>(2,5);
		
		
		//able 객체 생성 및 vector 추가 
		Able a1=new Able("b123",90,75,70);
		Able a2=new Able("t723",60,90,80);
		Able a3=new Able("a427",85,80,80);
		Able a4=new Able("g533",90,90,60);
		
		v.addElement(a1);
		v.addElement(a2);
		v.addElement(a3);
		v.addElement(a4);
		
		System.out.println("===========before sorting============= ");
		for(Able n:v){
			System.out.println(n.empno+","+n.getTotal());
		}
		
		Able[] a=new Able[v.size()];
		v.copyInto(a);
		
		AbleComp comp=new AbleComp();
		
		Arrays.sort(a,comp);
		
		System.out.println("=============after sorting==========");
		
		//v=new Vector<Able>(Arrays.asList(a));
		for(Able n:a){
			
			System.out.println(n.empno+","+ n.total);
		}
		
		
		int index=Arrays.binarySearch(a, new Able(240),comp);
		System.out.println("240이 검색된 index:"+index);
		
		
		
		
	}

}
