package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * This is a class to handle multi clients for Server.
 * In this class we implements Runnable for using multiThread
 * In run method we get data of user and append it to last data and send it again
 *
 * @author Mahdi rahmani
 * @version 1.0
 */
class Handler implements Runnable
{
    //connection socket
    private Socket connectionSocket;
    //client number
    private int clientNum;

    /**
     * This is the constructor of this class.
     * Create a Handler with a given information.
     *
     * @param connectionSocket connection socket
     * @param clientNum client number
     */
    public Handler(Socket connectionSocket, int clientNum)
    {
        this.connectionSocket = connectionSocket;
        this.clientNum = clientNum;
    }

    /**
     * An override method for handle multi threading.
     *
     */
    @Override
    public void run() {
        try {
            System.out.println("Client" + clientNum + " accepted.");
            OutputStream out = connectionSocket.getOutputStream();
            InputStream in = connectionSocket.getInputStream();
            byte[] buffer = new byte[2048];
            StringBuilder output = new StringBuilder();
            while (true)
            {
                try {
                    int read = in.read(buffer);
                    System.out.println( "- From Client" + clientNum + ": " + new String(buffer, 0, read));
                    output.append(" ").append(new String(buffer, 0, read));
                    System.out.println("+ To Client" + clientNum + ": " + output);
                    out.write(output.toString().getBytes());
                }
                catch (Exception exception)
                {
                    break;
                }
            }
            System.out.print("Closing connection for Client" + clientNum + ".\n");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connectionSocket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}