import java.io.*;

public class ReadAndWrite {

    public static void main(String[] args) throws IOException {

    //write
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello, world!");
            writer.write("\n!!!!!!!!!!!!!!");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //read

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    }
