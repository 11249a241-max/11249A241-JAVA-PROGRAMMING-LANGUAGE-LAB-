import java.io.*;

class FitnessProfile {
    public static void main(String[] args) throws IOException {
        String data = "Name: Rahul\nAge: 22\nWeight: 68 kg";

        FileOutputStream out = new FileOutputStream("profile.txt");
        out.write(data.getBytes());
        out.close();

        FileInputStream in = new FileInputStream("profile.txt");
        int ch;

        while ((ch = in.read()) != -1)
            System.out.print((char) ch);

        in.close();
    }
}
