package casting;

public class testCasting {
	String caughtMessenger;
	
	public void catchMessenger(String messenger){
		caughtMessenger = messenger.substring(1);
		
	}
	
	public String getTranslated(String messenger){
		return messenger.substring(0, 1);
	}
	
	String getString(){
		return caughtMessenger;
	}
	
	int getInt(){
		return Integer.parseInt(caughtMessenger);
		
	}
	
	Boolean getBoolean(){
		return Boolean.parseBoolean(caughtMessenger);
		
	}
	
	
	
}
