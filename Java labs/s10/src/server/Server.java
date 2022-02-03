package server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This is a class for server.
 * It receives data from user and with Handler class append it
 * to last data and send it to user again
 * this process is done until user write "over"
 *
 * @author Mahdi Rahmani
 * @version 1.0
 * @since 2020-12-29
 */
public class Server {
    //Run Server
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        int count = 0;
        try (ServerSocket welcomingSocket = new ServerSocket(7000)) {
            System.out.println("Server started.\nWaiting for a client ... ");
            while (count < 100)
            {
                Socket connectionSocket = welcomingSocket.accept();
                count++;
                pool.execute(new Handler(connectionSocket, count));
            }
            System.out.print("done.\nClosing server ... ");
            pool.shutdown();
        } catch (IOException ex) {
            System.err.println("Error: "+ex.getMessage());
        }
        System.out.println("done.");
    }
}