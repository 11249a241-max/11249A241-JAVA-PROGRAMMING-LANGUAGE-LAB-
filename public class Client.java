import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 5000;

        try {
            // Connect to server
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to server.");

            // Send message to server
            PrintWriter output = new PrintWriter(
                    socket.getOutputStream(), true);

            output.println("Hello Server! This is the client.");

            // Receive response from server
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            String response = input.readLine();
            System.out.println("Server says: " + response);

            // Close connection
            output.close();
            input.close();
            socket.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

