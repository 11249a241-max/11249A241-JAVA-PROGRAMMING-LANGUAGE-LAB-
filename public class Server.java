import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int port = 5000;

        try {
            // Create server socket
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected.");

            // Receive message from client
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String message = input.readLine();
            System.out.println("Client says: " + message);

            // Send response to client
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello Client! Message received by server.");

            // Close connections
            input.close();
            output.close();
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

