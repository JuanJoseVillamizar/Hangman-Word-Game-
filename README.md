# HANGMAN WORD  GAME!  IN JAVA

This project is a simple implementation of the classic Hangman game in Java. The player tries to guess a secret word by suggesting letters within a certain number of attempts.

# Features
- Word guessing game with a maximum number of attempts. 
-  Displays the current state of the guessed word with underscores and correctly guessed letters. 
-  Provides feedback on whether the guessed letter is correct or incorrect. 
-  Announces the result of the game (win or lose) based on the player's performance.
- 
## Getting Started 
### Prerequisites 
To run this project, you'll need: 
- Java Development Kit (JDK) 8 or higher installed on your system. 
- A Java Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or any other Java IDE (optional). 
### Running the Game
 1. **Clone the Repository**
   ```sh 
		git clone https://github.com/JuanJoseVillamizar/Hangman-Word Game-.git
		cd hangman-java 
```
				
 2. **Copile the code**

Navigate to the project directory and compile the code using the following command:
```sh 
		javac App.java
```
 3. **Run the game**

Execute the compiled Java class using:
```sh 
		java App
```

 3. **Playing the game**
-  Follow the on-screen instructions to guess letters.
-  You have a limited number of attempts to guess the word.
-   The game will display the current state of the word and how many attempts you have left.

## Code Structure

-   `App.java`: Contains the main game logic, including:
    -   Initializing the game setup.
    -   Handling user input.
    -   Checking guessed letters.
    -   Displaying the game status and final results.

## Example Output
```sh 
		Welcome to Hangman!
Word to guess: _ _ _ _ _ _ _ _ _ _ _ (12 letters)
Enter a letter: 
a
Word to guess: _ _ _ _ _ _ _ _ _ _ a _ (12 letters)
Enter a letter: 
i
Word to guess: _ i _ _ _ i _ _ _ _ a _ (12 letters)
...
Congratulations! You guessed the secret word: inteligencia!

```