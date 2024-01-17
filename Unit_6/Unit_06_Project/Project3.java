/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

import java.util.Scanner;

public class Project3 {
    // Create the board
    private static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char currentPlayer = 'O';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printBoard();
    }
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
    private static void getPlayerMove(Scanner scanner) {
        int row, col;
        do {
            System.out.print("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!Validate(row, col));

    }
    private static boolean Validate(int row, int col) {
        if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
            return true;
        } else {
            return false;
        }
    }







}












