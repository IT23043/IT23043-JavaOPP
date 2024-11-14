import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/Input.txt");
            Scanner sn = new Scanner(inputFile);
            PrintWriter pw = new PrintWriter("src/Output.txt");
            while (sn.hasNextLine()) {
                String row = sn.nextLine();
                String[] clm = row.split(",");
                for (int i = 0; i < clm.length; i++) {
                    int value = Integer.parseInt(clm[i].trim());
                    int sum = (value * (value + 1)) / 2;
                    pw.print(sum);
                    if (i != clm.length-1) {
                        pw.print(",");
                    }
                }
                pw.println("");
            }
            sn.close();
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        }
    }
}