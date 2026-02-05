# Tic Tac Toe (Command Line – Java) ❌ ⭕

A simple two-player Tic Tac Toe game played in the command line, written in Java. Players take turns entering moves using numbers **1–9**, and the game automatically checks for wins, draws, and invalid moves.

---

## ✨Features

- Two-player gameplay  
  - Player 1: **X**  
  - Player 2: **O**
- Command-line interface
- Input validation for invalid or occupied moves
- Win detection (rows, columns, diagonals)
- Draw detection
- Option to replay the game
- Clear board display

---

## 📖 Code Overview

- The program is implemented in a single class:

- TicTacToe

- Handles:

  - Board initialization

  - Displaying the board

  - Validating moves

  - Detecting wins and draws

  - Managing player turns

  - Handling replay logic

- Key Methods

  - initializeBoard() – Sets up the board with numbers 1–9
  
  - printBoard() – Displays the current board
  
  - checkMove(int move) – Validates player input
  
  - makeMove(int move, String player) – Places X or O on the board
  
  - checkWin() – Checks for a winning condition
  
  - checkDraw() – Checks if the board is full

---

## 📦 Requirements

- Java JDK 8 or later
- Command-line terminal

---

## 🎛️ How to Run

1. Save the file as `TicTacToe.java`
2. Open a terminal in the project directory
3. Compile the program:
   ```bash
   javac TicTacToe.java
   java TicTacToe
OR
  ```bash
   java TicTacToe.java

