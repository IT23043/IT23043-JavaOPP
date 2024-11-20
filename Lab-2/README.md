# Math Puzzle Game: RahiForKids

## Description
Welcome to the **Math Puzzle Game**! This is a simple console-based game where users can attempt math problems, track their scores, and save the results. The game pulls math expressions from an `Input.txt` file, prompts the user to solve them, and records the player's results to an `Output.txt` file.

## Features
- **Questionnaire**: The game displays math expressions (addition, subtraction, multiplication, and division) from a file.
- **User Interaction**: Players can input their answers or choose to stop or skip questions.
- **Score Tracking**: The game tracks the score based on correct answers and displays the current score after each answer.
- **Results Logging**: The player's name, score, and timestamp are saved to an output file for later reference.

## Requirements
- **Java 8+** or higher.
- The game relies on two text files:
  - `Input.txt`: Contains math expressions, one per line, separated by commas.
  - `Output.txt`: A log file where game results are stored.

## Setup Instructions
1. **Clone the repository** or download the source code.
2. **Prepare Input.txt**:
   - Create an `Input.txt` file in the `src` directory. Each line should contain math expressions separated by commas (e.g., `3+5, 10-2, 8*3`).
   - Each expression should contain two integers and an operator.
   
3. **Prepare Output.txt**:
   - This file will be generated automatically after the game runs. It will store the player's name, total questions, score, and timestamp.
   
4. **Compile and Run the Program**:
   - Compile the Java code using the following command:
     ```bash
     javac RahiForKids.java
     ```
   - Run the compiled code:
     ```bash
     java RahiForKids
     ```

## How to Play
1. Run the program, and the game will greet you with a welcome message.
2. Choose the option to **start the game** or **exit**.
3. Enter your name when prompted.
4. The game will show a series of math questions (expressions).
   - You can **stop** anytime by typing "stop".
   - You can **skip** a question by typing "skip".
   - Enter your answer to continue.
5. After completing the game, your score will be displayed, and your results will be saved in the `Output.txt` file.

## Example Input File (Input.txt)
```txt
1+2, 3-1, 4*5, 6/2, 7+8, 9-3, 10*2, 12/3
```
## Example Output File(Output.txt)
```txt
User-Name            Total Score          Obtained Score       Date                 Time
hello                100                  8                    2024-11-20           22:24:39
hiii                 100                  6                    2024-11-20           23:14:29
abcdef               100                  11                   2024-11-20           23:28:59
edghifglmne          100                  2                    2024-11-20           23:40:19
```
