/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import java.util.Scanner;

public class Project3 {

    // Create the board
    private static char[][] board = {   {' ', ' ', ' '}, 
                                        {' ', ' ', ' '}, 
                                        {' ', ' ', ' '}
                                    };
    private static char currentPlayer = 'O';

    // Clear screen
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Print the board
    private static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    // Validate inputs    
    private static boolean Validate(int row, int column) {
        if (row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ') {
            return true;
        } else {
            return false;
        }
    }

    // Switch player
    private static void switchPlayer() {
        if(currentPlayer == 'O') {
            currentPlayer = 'X';
        } else if (currentPlayer == 'X') {
            currentPlayer = 'O';
        }
    }

    // Check to see if anyone won
    private static boolean checkWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true; 
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true; 
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true; 
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    // Check if board is full
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Loop for getting inputs and printing
        while (true) {
            clearScreen();
            printBoard();

            System.out.println("Player " + currentPlayer + ", enter your move (row, column): ");
            int row = scanner.nextInt();
            int column = scanner.nextInt();

            if (Validate(row, column)) {
                board[row][column] = currentPlayer;
                if (checkWin()) {
                    clearScreen();
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                    break;
                } else if (isBoardFull()) {
                    clearScreen();
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }

                switchPlayer();
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

    }
}
