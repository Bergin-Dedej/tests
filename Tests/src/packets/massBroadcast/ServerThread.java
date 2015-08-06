package packets.massBroadcast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;

public class ServerThread extends Thread {

	protected DatagramSocket socket;
	private Server server = new Server();
	private ArrayList<InetAddress> addresses;
	private ArrayList<Integer> ports;
	
	public ServerThread(Server server) throws Exception{
		this.server = server;
		socket = new DatagramSocket(7777);
		addresses = new ArrayList<InetAddress>();
		ports = new ArrayList<Integer>();
	}


	public void run(){
		String serverString = "String from server";
		int counter = 0;

		InetAddress address = null;
		int port = 0;
		DatagramPacket packet = null;
		
		while(true){
			try{
			

			
			byte[] buf = new byte[512];
			

            // receive request
            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);

            
            address = packet.getAddress();
            port = packet.getPort();
            
            if(!(addresses.contains(address) && ports.contains(port))){
            	addresses.add(address);
            	ports.add(port);
            }
			
            
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Address: " + packet.getAddress() + " Port:" + packet.getPort());
            
            if(received.equals("newClient")) loadNewUser(packet,address,port);
            
            byte[] buf2 = new byte[512];
            buf2 = server.getMessenger().getBytes();
           // counter ++;
           // serverString = Integer.toString(counter);
            for(int i = 0; i< ports.size(); i ++){
            	packet = new DatagramPacket(buf2, buf2.length, addresses.get(i), ports.get(i));
            	socket.send(packet);
            }
            
            Thread.sleep(1000);
            
            
			}
			catch(Exception e){};
		}
		
		
	}
	
	public void loadNewUser(DatagramPacket packet, InetAddress address, int port) throws IOException{
		byte[] bigBuf = new byte[512];
		String bigBufString = "";
		for(int i = 0;i< server.getUsername().size(); i++){
			bigBufString += "0" + server.getUsername().get(i) + ",";
			bigBufString += "1" + server.getxCoordinate().get(i) + ",";
		}
        bigBuf = bigBufString.getBytes();
        
		packet = new DatagramPacket(bigBuf, bigBuf.length, address, port);
        socket.send(packet);
	}

}
