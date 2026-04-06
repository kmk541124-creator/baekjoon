import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();

            char[][] board = new char[N][M];
            for (int i = 0; i < N; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < M; j++) {
                    board[i][j] = line.charAt(j);
                }
            }

            int minResult = 64;

            for (int i = 0; i <= N - 8; i++) {
                for (int j = 0; j <= M - 8; j++) {
                    minResult = Math.min(minResult, checkBoard(i, j, board));
                }
            }

            System.out.println(minResult);
        }
    }

    public static int checkBoard(int startRow, int startCol, char[][] board) {
        int count = 0;
        char color = board[startRow][startCol];

        for (int i = startRow; i < startRow + 8; i++) {
            for (int j = startCol; j < startCol + 8; j++) {
                if (board[i][j] != color) {
                    count++;
                }
                
                color = (color == 'W') ? 'B' : 'W';
            }
            color = (color == 'W') ? 'B' : 'W';
        }

        return Math.min(count, 64 - count);
    }
}