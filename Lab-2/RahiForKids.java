import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class RahiForKids {
    public static void main(String[] args) {
        System.out.println("Welcome To Math Puzzle Game!!!");
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("1. Start Game: ");
            System.out.println("2. Exit: ");
            int choice = input.nextInt();
            input.nextLine();
            if (choice == 2) {
                break;
            }
            System.out.println("Enter Your Name:");
            String user_name = input.nextLine();
            File inputFile = new File("Input.txt");
            File outputFile = new File("Output.txt");

            //Create Output file if it doesn't exist
            if (!outputFile.exists()) {
                try {
                    // Create the file if it doesn't exist
                    if (outputFile.createNewFile()) {
                        //System.out.println("File created: " + outputFile.getName());
                    } else {
                        //System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred while creating the file.");
                    e.printStackTrace();
                }
            } else {
                //System.out.println("File already exists.");
            }

            //Write Header if it doesn't exist
            if (checkifheaderexists(outputFile)) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));
                    String line = String.format(
                            "%-20s %-20s %-20s %-20s %-20s %n",
                            "User-Name", "Total Score", "Obtained Score", "Date", "Time");
                    writer.write(line);
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            //Store expressions in to a List
            List<String> expressions = new ArrayList<>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                String expression;
                while ((expression = reader.readLine()) != null) {
                    String[] temp = (expression.split(","));
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = temp[i].trim();
                    }
                    for (int i = 0; i < temp.length; i++) {
                        expressions.add(temp[i]);
                    }
                }
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            /*for (int i = 0; i < expressions.size(); i++) {
                System.out.println((i+1)+"---"+expressions.get(i));
            }*/
            int total_ques = 100;
            int score = 0;

            //Question and answer block
            for (int i = 0; i < total_ques; i++) {
                //Display Question
                System.out.println("Question No-" + (i + 1) + ": " + expressions.get(i));
                //Get result for "result" method
                int result = result(expressions.get(i));
                //User Prompt
                System.out.println("Enter answer or stop or skip");
                //Get user_result input
                String user_result = input.nextLine();
                //Remove all leading and tailing whitespace
                user_result = user_result.trim();
                //Conditions
                if (Objects.equals(user_result, "stop")) break;
                else if (Objects.equals(user_result, "skip")) continue;
                else if (result == Integer.parseInt(user_result)) {
                    score++;
                    System.out.println("Correct Answer. Current Score: " + score);
                }
            }
            if (score == total_ques) System.out.println("Congratulation! You achieved Full Score!!!");
            else {
                System.out.println("Obtained Score: " + score);
            }
            try {
                LocalTime time = LocalTime.now();
                LocalDate date = LocalDate.now();
                DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

                String Date = date.format(dateFormatter);
                String Time = time.format(timeFormatter);

                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));
                String line = String.format("%-20s %-20d %-20d %-20s %-20s %n",
                        user_name, total_ques, score, Date, Time);
                writer.write(line);
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //Checks if the file is empty
    private static boolean checkifheaderexists(File file) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String firstline = reader.readLine();
            return firstline == null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Returns the result according to expression
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
                if (number1 != 0)
                    result = number1 / number2;
                break;
        }
        return result;
    }
}
