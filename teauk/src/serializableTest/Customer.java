package serializableTest;

import java.io.Serializable;

public class Customer implements Serializable {

		private String name;
		public Customer(String name){
			this.name=name;
		}

		public void setName(String name){
			this.name=name;
		}
		
		public String getName(){
			
			return name;
		}
		
		public String toString(){
			
			return "����� �̸� : " + name; 
		}
		
		
}