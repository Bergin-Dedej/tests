package packets.teleportation;

import java.io.IOException;
import java.util.ArrayList;

public class Server {
	private ArrayList<String> username = new ArrayList<String>();
	

	private ArrayList<Integer> xCoordinate = new ArrayList<Integer>();
	private String messenger = "";
	
	public static void main(String[] args) throws Exception{
		Server server = new Server();
		new ServerThread(server).start();
		server.mainProgram();
	}
	
	public void mainProgram() throws Exception{
		//init
		username.add("dude");
		username.add("eyo");
		username.add("playe2");
		username.add("yoyoyo");
		username.add("yoyoyo3");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("dud4e");
		username.add("ey4o");
		username.add("playe42");
		username.add("yoyo4yo");
		username.add("yoy4oyo3");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("du5de");
		username.add("e5yo");
		username.add("play5e2");
		username.add("yoy5oyo");
		username.add("yo5yoyo3");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("d5ude");
		username.add("eyo5");
		username.add("playe25");
		username.add("yoyoy5o");
		username.add("yoyo5yo3");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("dud6e");
		username.add("eyo6");
		username.add("playe62");
		username.add("yoyoyo6");
		username.add("yoyoy6o3");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("dude7");
		username.add("eyo7");
		username.add("playe7");
		username.add("yoyoy7");
		username.add("yoyoyo7");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("dude8");
		username.add("eyo8");
		username.add("playe8");
		username.add("yoyoy8");
		username.add("yoyoyo8");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		username.add("dud9");
		username.add("eyo9");
		username.add("playe9");
		username.add("yoyoy9");
		username.add("yoyoyo9");
		xCoordinate.add(12);
		xCoordinate.add(0);
		xCoordinate.add(423);
		xCoordinate.add(553);
		xCoordinate.add(553);
		
		
		while(true){
			for(int i = 0; i < username.size(); i++){
				if(username.get(i).equals("eyo")){
					xCoordinate.set(i, xCoordinate.get(i) + 1);
					messenger += "0" + username.get(i) + ",1" + xCoordinate.get(i) + ",";
				}
				if(username.get(i).equals("dude")){
					xCoordinate.set(i, xCoordinate.get(i) + 2);
					messenger += "0" + username.get(i) + ",1" + xCoordinate.get(i) + ",";
				}
			}
			
			Thread.sleep(1000);
			messenger = "";
		}
	}
	
	public String getMessenger(){
		return messenger;
	}
	
	public ArrayList<String> getUsername() {
		return username;
	}

	public ArrayList<Integer> getxCoordinate() {
		return xCoordinate;
	}

}
