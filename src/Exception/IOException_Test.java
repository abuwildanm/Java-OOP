package Exception;

import java.io.*;

public class IOException_Test {

    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("/home/box/a.txt");
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "/home/box/a.txt"
        for(int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
         
        fileInput.close();
    }
    
}
