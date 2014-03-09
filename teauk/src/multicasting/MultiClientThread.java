package multicasting;


public class MultiClientThread  extends Thread{

	private MultiClient mc;
	public MultiClientThread(MultiClient mc){
		this.mc=mc;
	}
	

	
	
	@Override
	public void run() {
	
		String message=null;
		String[] receiveMsg=null;
		boolean isStop= false;
		while(!isStop){
			try{
				message =(String)mc.getOis().readObject();
				receiveMsg=message.split("#");
			}catch(Exception e){
				e.printStackTrace();
				isStop=true;
			}
			
			System.out.println(receiveMsg[0]+","+receiveMsg[1]);
			if(receiveMsg[1].equals("exit")){
				if(receiveMsg[0].equals(mc.getId())){
					mc.exit();
				}else{
					mc.getJta().append(receiveMsg[0]+"¥‘¿Ã ¡æ∑·«œºÃΩ¿¥œ¥Ÿ."+System.getProperty("line.separator"));
					mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
				}
			}else{
				mc.getJta().append(receiveMsg[0]+" : " + receiveMsg[1]+System.getProperty("line.separator"));
				mc.getJta().setCaretPosition(mc.getJta().getDocument().getLength());
			}
			
			
		}
		
	}


}


