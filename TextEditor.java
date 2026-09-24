import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor {
    public static void main(String[] args) {
        String fileName = "content.txt";

        // Content to write
        String content = "Welcome to Java Programming!\n"
                       + "This content is written using FileWriter.\n"
                       + "It is then read using FileReader.";

        // Writing content to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written successfully.");
        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        // Reading content from the file
        try (FileReader reader = new FileReader(fileName)) {
            int ch;

            System.out.println("\nContent of the file:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}

