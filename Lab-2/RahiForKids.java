import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class RahiForKids {
    public static void main(String[] args) {
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
            }
            else if(choice==2){
                File history=new File("Output.txt");
                List<String> users= new ArrayList<>();
                try{
                    BufferedReader br= new BufferedReader(new FileReader(history));
                    String line;
                    while((line=br.readLine()) != null){
                        users.add(line);
                    }
                }catch (IOException e) {
                    System.out.println("An error occurred while getting the file.");
                }
                System.out.println("\nHistory");
                for(int i=0;i<users.size();i++){
                    System.out.println(users.get(i));
                }
                System.out.println(" ");
                continue;
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
                }
            }

            //Write Header if it doesn't exist
            if (checkifheaderexists(outputFile)) {
                String line = String.format(
                        "%-20s %-20s %-20s %-20s %-20s %-20s %n",
                        "User-Name", "Level", "Total Score", "Obtained Score", "Date", "Time");
                writeResult(line, outputFile);
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

            System.out.println("1: Easy");
            System.out.println("2: Medium");
            System.out.println("3: Hard");

            System.out.println("Choose difficulty level: ");
            int level = input.nextInt();
            input.nextLine();

            int total_ques = 100;
            int score = 0;
            int max_ques = 30;

            //Level Selection
            if (level == 1) {
                //Question and answer block
                for (int i = 0; i < 29; i++) {
                    //Display Question
                    System.out.println("#Question No-" + (i + 1) + ": " + expressions.get(i));

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
                else System.out.println("Obtained Score: " + score);

                String Time = DOT("time");
                String Date = DOT("date");
                String line = String.format("%-20s %-20s %-20d %-20d %-20s %-20s %n",
                        user_name, "Easy", max_ques, score, Date, Time);
                writeResult(line, outputFile);
            } else if (level == 2) {
                //Question and answer block
                for (int i = 30; i < 59; i++) {
                    //Display Question
                    System.out.println("#Question No-" + (i + 1) + ": " + expressions.get(i));

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
                else System.out.println("Obtained Score: " + score);

                String Time = DOT("time");
                String Date = DOT("date");
                String line = String.format("%-20s %-20s %-20d %-20d %-20s %-20s %n",
                        user_name, "Medium", max_ques, score, Date, Time);
                writeResult(line, outputFile);

            } else if (level == 3) {
                //Question and answer block
                for (int i = 60; i < 89; i++) {
                    //Display Question
                    System.out.println("#Question No-" + (i + 1) + ": " + expressions.get(i));

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
                else System.out.println("Obtained Score: " + score);

                String Time = DOT("time");
                String Date = DOT("date");
                String line = String.format("%-20s %-20s %-20d %-20d %-20s %-20s %n",
                        user_name, "Hard", max_ques, score, Date, Time);
                writeResult(line, outputFile);
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
                if (number2 != 0)
                    result = number1 / number2;
                break;
        }
        return result;
    }

    private static String DOT(String s) {
        if (s.equals("time")) {
            LocalTime time = LocalTime.now();
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String Time = time.format(timeFormatter);
            return Time;
        } else {
            LocalDate date = LocalDate.now();
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String Date = date.format(dateFormatter);
            return Date;
        }
    }

    private static void writeResult(String line, File outputFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true));
            writer.write(line);
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to the output file: ");
        }
    }
}
