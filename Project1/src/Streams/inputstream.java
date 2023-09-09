package Streams;

import java.io.FileWriter;
import java.io.IOException;

public class inputstream {
    public static void main(String[] args) throws IOException {
        FileWriter filewriter = new FileWriter("D:\\Trials Java\\Untitiled.txt");
        filewriter.write("Java is simple");
        filewriter.close();
    }
}