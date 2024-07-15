package com.sockets;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.nio.channels.SocketChannel;

public class ClientChannelSocket1 {

	
	public static void main(String[] args) {
		int port=9090;
		 String hoString="localhost";
		 try(
				 
				 SocketChannel client=SocketChannel.open();
				 ByteArrayOutputStream baos=new ByteArrayOutputStream();
				 ObjectOutputStream oos=new ObjectOutputStream(baos);
				 ){
		  clin
		 
		 
		 }
		 }
	}
}
