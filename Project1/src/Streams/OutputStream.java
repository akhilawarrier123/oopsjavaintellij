package Streams;

import java.io.*;

public class OutputStream {

    public static void main(String[] args) throws IOException {
        FileReader filereader =new FileReader("D:\\Trials Java\\File_1.txt");
        BufferedReader Bf=new BufferedReader(filereader);
        String line=Bf.readLine();
        FileWriter Fw=new FileWriter("D:\\Trials Java\\File_2.txt");

        while(line!=null) {
            Fw.write(line+"\n");
            System.out.println(line+"is added to File_2");
            line = Bf.readLine();
        }

Fw.close();
    }


}
