package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import javax.xml.crypto.Data;

public class Client {
    
    public static void main(String[] args){
        try {
            Socket client = new Socket("localhost", 1337);
            DataOutputStream output = new DataOutputStream(client.getOutputStream());
            output.writeUTF("Hello I am: " + client.getLocalSocketAddress());

            DataInputStream input = new DataInputStream(client.getInputStream());
            System.out.println(input.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
