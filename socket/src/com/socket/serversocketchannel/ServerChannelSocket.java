package com.socket.serversocketchannel;

import java.io.ByteArrayInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;



public class ServerChannelSocket {

	
	public static void main(String[] args) {
		int port=9090;
		
		try (
				
				ServerSocketChannel server =ServerSocketChannel.open();
				)
		{
		server.bind(new InetSocketAddress(port));
		System.out.println("server start at: "+port);
		
		while (true) {
			try(
					SocketChannel client =server.accept();
					){
					System.out.println("client connect: "+client.getRemoteAddress());
					
					ByteBuffer  buffer= ByteBuffer.allocate(1024);
					int charVal=client.read(buffer);
					
					if (charVal!= -1) {
						buffer.flip();
						byte[] byteArray=new byte [buffer.remaining()];
						buffer.get(byteArray);
						
						try(
								ByteArrayInputStream bais =
								new ByteArrayInputStream(byteArray);
								
								ObjectInputStream ois= 
										new ObjectInputStream(bais);
								
								)
						{
							
						}
					}
		}
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
	}
}
