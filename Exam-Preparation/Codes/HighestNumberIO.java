import java.io.*;
import java.util.Scanner;

public class HighestNumberIO {
    public static void main(String[] args) throws FileNotFoundException {
        String inputfile = "src/input.txt";
        String outputfile = "src/output.txt";
        Scanner scanner = new Scanner(new File(inputfile));
        PrintWriter writer = new PrintWriter(outputfile);
        while (scanner.hasNextLine()) {
            StringBuilder result = new StringBuilder();
            String row = scanner.nextLine();
            String[] column = row.split(",");
            for (String s : column) {
                String strim = s.trim();
                if (!strim.isEmpty()) {
                    int number = Integer.parseInt(strim);
                    int sum = number * (number + 1) / 2;
                    result.append(sum);
                    result.append(", ");
                }
            }
            String answer="";
            if (!result.isEmpty()) {
                answer = result.substring(0, result.length() - 2);
                writer.println(String.valueOf(answer));
            }
        }
        scanner.close();
        writer.close();
    }
}
