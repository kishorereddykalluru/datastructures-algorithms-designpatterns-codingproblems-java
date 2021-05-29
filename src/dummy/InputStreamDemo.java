package dummy;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class InputStreamDemo {

    public static void main(String[] args) {
        InputStream in = null;
        int i;

        try {
             in = new FileInputStream("E:\\KishWorkspace\\DataStructuresAndAlgorithms\\src\\dummy\\input.txt");

            System.out.println("in = " + in);

             String s = IOUtils.toString(in, StandardCharsets.UTF_8);

            System.out.println("s = " + s);

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
