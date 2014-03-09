package interfaceTest;

public class EnumEX3 {

	public enum Item{
		
		add(5), del(11),search(2),cancel(22);
		private final int var;
		
		Item(int v){
			var=v;
		}
		
		public int getVar(){
			return var;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(Item n:Item.values()){		 
			
			System.out.println(n+ ":"+n.getVar());
		}
		
	}

}
