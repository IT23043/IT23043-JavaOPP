# Math Puzzle Game: RahiForKids

**RahiForKids** is a console-based Java application that provides an engaging Math Puzzle Game for children. The game offers three difficulty levels and tracks user progress with a history feature.

---

## Features

- **Game Levels**: Easy, Medium, and Hard difficulty levels with math expressions to solve.
- **Scoring System**: Tracks and displays the user’s score for each session.
- **History Tracking**: Saves game history, including username, level, scores, and date-time.
- **Flexible Input**: Users can provide answers or use commands like `stop` to end the game or `skip` to skip a question.

---

## How It Works

1. **Menu Options**:
    - `Start Game`: Begin a new game session.
    - `History`: View a list of past game results stored in `Output.txt`.
    - `Exit`: Exit the application.

2. **Difficulty Levels**:
    - **Easy**: Simple math problems.
    - **Medium**: Moderately challenging problems.
    - **Hard**: Complex problems.

3. **Input File**:
    - Math problems are read from `Input.txt` in the format of expressions (e.g., `2 + 3, 5 * 6`).
    - Problems are categorized into levels based on their position in the file.

4. **Output File**:
    - Game history is saved in `Output.txt`, including:
      - Username
      - Level
      - Total Score
      - Obtained Score
      - Date
      - Time

---

## Requirements

- **Java Version**: OpenJDK 17 or later.
- **Input File**: `Input.txt` containing comma-separated math expressions.
- **Output File**: `Output.txt` (automatically created if not present).

---

## File Format

### Input File (`Input.txt`):
```text
2 + 3, 5 * 6, 8 - 4, 12 / 3
```
### Output File (`Output.txt`)
```text
User-Name            Level                Total Score          Obtained Score       Date                 Time                 
anirbanrahi          Easy                 30                   5                    2024-11-21           19:27:24             
akib jawad           Medium               30                   7                    2024-11-21           19:28:17
```
