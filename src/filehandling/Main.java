package filehandling;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some letters");

            int letter = isr.read();

            while (isr.ready()){
                System.out.println((char) letter);
                letter = isr.read();
            }

            isr.close();
            System.out.println();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
