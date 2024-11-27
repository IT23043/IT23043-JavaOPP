import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        String[] questions = {"1618 + 3141", "7034 - 3483", "92 * 29", "25482 / 3", "6174 + 4937"};
        int[] answers = {4759, 3551, 2668, 8494, 11111};

        int score = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("#Question-"+(i+1)+": " + questions[i]);

            int[] options = new int[5];

            for(int j=0;j<5;j++){
                options[j]=((int)(Math.random()*10000));
            }

            int index= (int)((Math.random()*5));

            options[index]=answers[i];

            for (int j=0;j<5;j++){
                System.out.println("Option "+(j+1)+": "+options[j]);
            }

            System.out.println("Enter answer option: ");
            int ans_choice = new Scanner(System.in).nextInt();
            if (ans_choice-1 == index && (options[index]==answers[i])) {
                System.out.println("Answer Correct.");
                score = score + 5;
            } else {
                System.out.println("Answer Wrong.");
                if (score > 0) score--;
            }
            System.out.println(" ");
        }
        if(score==25) System.out.println("Congratulations. Your score: "+score);
        else System.out.println("Your score: "+score);
    }
}