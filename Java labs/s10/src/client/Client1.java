package client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * This is a class for Client.
 * Until user write "over" we get message and send for server
 *
 * @author Mahdi Rahmani
 * @version 1.0
 */
public class Client1 {
    //Run Client
    public static void main(String[] args) {
        try (Socket client = new Socket("127.0.0.1", 7000)) {
            System.out.println("Connected to server.");
            OutputStream out = client.getOutputStream();
            InputStream in = client.getInputStream();
            byte[] buffer = new byte[2048];
            Scanner scanner = new Scanner(System.in);
            while (true)
            {
                System.out.print("- To Server: ");
                String massage = scanner.nextLine();
                if (massage.equals("over"))
                {
                    break;
                }
                out.write(massage.getBytes());
                int read = in.read(buffer);
                System.out.println("+ From Server: " + new String(buffer,0, read));
            }
            System.out.print("Closing ... ");
        } catch (IOException ex) {
            System.err.println(ex);
        }
        System.out.println("done.");
    }
}