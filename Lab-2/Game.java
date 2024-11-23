import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        System.out.println("*Welcome To Math Puzzle Game!!!*");
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("1. Start Game: ");
            System.out.println("2. History");
            System.out.println("3. Exit: ");
            System.out.println("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 3) {
                break;
            } else if (choice == 2) {
                File history = new File("Output.txt");
                List<String> users = new ArrayList<>();

                Scanner fs = new Scanner(history);
                while (fs.hasNextLine()) {
                    String line = fs.nextLine();
                    users.add(line);
                }
                fs.close();

                System.out.println("\n***History***");
                for (int i = 0; i < users.size(); i++) {
                    System.out.println(users.get(i));
                }
                System.out.println(" ");

                continue;
            }
            System.out.println("Enter Your Name:");
            String user_name = input.nextLine();

            File inputFile = new File("Input.txt");
            File outputFile = new File("Output.txt");

            //Store expressions in to a List
            Scanner fc = new Scanner(inputFile);
            List<String> expressions = new ArrayList<>();
            String expression;
            while (fc.hasNextLine()) {
                String line = fc.nextLine();
                String[] temp = (line.split(","));
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = temp[i].trim();
                }
                for (int i = 0; i < temp.length; i++) {
                    expressions.add(temp[i]);
                }
            }
            fc.close();


            /*for (int i = 0; i < expressions.size(); i++) {
                System.out.println((i+1)+"--->"+expressions.get(i));
            }*/

            System.out.println("1: Easy");
            System.out.println("2: Medium");
            System.out.println("3: Hard");

            System.out.println("Choose difficulty level: ");
            int level = input.nextInt();
            input.nextLine();

            int max_ques = 0;
            String lvl = "";
            if (level == 1) {max_ques = 10;lvl="Easy";}
            else if (level == 2) {max_ques = 20;lvl="Medium";}
            else if (level == 3) {max_ques = 30;lvl="Hard";}


            int score = 0;
            for (int i = 0; i < max_ques; i++) {
                System.out.println("#Question No-" + (i + 1) + ": " + expressions.get(i));
                int result = result(expressions.get(i));
                System.out.println("Enter answer or stop or skip");
                String user_result = input.nextLine();
                user_result = user_result.trim();
                if (user_result.equals("stop")) break;
                else if (user_result.equals("skip")) continue;

                else {
                    if (result == Integer.parseInt(user_result)) {
                        score++;
                        System.out.println("Correct Answer. Current Score: " + score);
                    } else {
                        System.out.println("Wrong answer. Correct answer: " + result);
                    }
                }
                System.out.println(" ");

            }
            if (score == max_ques) System.out.println("Congratulation! You achieved Full Score!!!");
            String line = String.format("%-20s %-20s %-20d %-20d %n",
                    user_name, lvl, max_ques, score);
            writeResult(line, outputFile);
        }
    }


    private static int result(String s) {
        int result = 0, index = 0;
        char c = '0';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') {
                c = s.charAt(i);
                index = i;
                break;
            }
        }
        int number1 = Integer.parseInt(s.substring(0, index));
        int number2 = Integer.parseInt(s.substring(index + 1));
        switch (c) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                if (number2 != 0)
                    result = number1 / number2;
                break;
        }
        return result;
    }

    private static void writeResult(String line, File outputFile) throws IOException {
        FileWriter writer = new FileWriter(outputFile, true);
        writer.write(line);
        writer.close();
    }
}
