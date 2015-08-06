package packets.massBroadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
	private ArrayList<String> username = new ArrayList<String>();
	private ArrayList<Integer> xCoordinate = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		Client client = new Client();
		DatagramSocket socket = new DatagramSocket();
		byte[] buf = new byte[512];
		String clientString = "newClient";
		buf = clientString.getBytes();

		byte[] buf2 = new byte[512];
		while (true) {
			InetAddress address = InetAddress.getByName("localhost");
			DatagramPacket packet = new DatagramPacket(buf, buf.length,address, 7777);
			socket.send(packet);

			packet = new DatagramPacket(buf2, buf2.length);
			socket.receive(packet);
			
			// String to be scanned to find the pattern.
			String recieved = new String(packet.getData(), 0,
					packet.getLength());
			
			buf = "notNew".getBytes();
			
			
		      String pattern = "(\\d)(.*?),";

		      // Create a Pattern object
		      Pattern r = Pattern.compile(pattern);

		      // Now create matcher object.
		      Matcher m = r.matcher(recieved);
		      String user;
		      int xIndex = 0;
		      while(m.find( )) {
		    	  
		    	 if(m.group(1).equals("0")){
		    		 user = m.group(2);
		    		 if(!client.username.contains(m.group(2))) client.username.add(m.group(2));
		    		 xIndex = client.username.indexOf(m.group(2));

		    	 }
		    	 
		    	 if(m.group(1).equals("1")){
		    		 if(xIndex < client.xCoordinate.size()) client.xCoordinate.set(xIndex,Integer.parseInt(m.group(2)));
		    		 else client.xCoordinate.add(xIndex,Integer.parseInt(m.group(2)));
		    	 }
		    	 
		        /* System.out.println("");
		         System.out.println("Found value: " + m.group(1) );
		         System.out.println("Found value: " + m.group(2) );
*/
		
		      } 
			
			//System.out.println(recieved);
		    System.out.println("");
		    System.out.println("");
		    System.out.println("");
		    System.out.println("");  
		    System.out.println("");        
			System.out.println(client.username);
			System.out.println(client.xCoordinate);
		}

	}
}
