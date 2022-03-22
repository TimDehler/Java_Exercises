public class Task12 {
    public static void main(String[] args) {
        int[][] chessField = new int[8][8];
        Task12 damenproblem = new Task12();
        damenproblem.printQueens(chessField);

        damenproblem.setQueen(chessField, 0);
        System.out.println("\n");
        damenproblem.printQueens(chessField);
    }

    private void printQueens(int[][] chessField) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessField[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n \n");
    }

    private boolean setQueen(int[][] chessField, int reihe) {
        if (reihe >= 8) {
            return true;
        }

        for (int spalte = 0; spalte < 8; spalte++) {
            if (isSafe(chessField, reihe, spalte)) {
                chessField[reihe][spalte] = 1;
                printQueens(chessField);

                if (setQueen(chessField, reihe + 1)) {
                    return true;
                }
                // if all other queens could not be placed correctly, remove this queen and test the next field
                chessField[reihe][spalte] = 0;
            }
        }
        return false;
    }

    private boolean isSafe(int[][] chessField, int reihe, int spalte) {

        int i, j;

        // check vertical
        for (i = 0; i < reihe; i++) {
            if (chessField[i][spalte] == 1) {
                return false;
            }
        }

        // check upper diagonal on left side
        for (i = reihe, j = spalte; i >= 0 && j >= 0; i--, j--) {
            if (chessField[i][j] == 1) {
                return false;
            }
        }

        // check upper diagonal on right side
        for (i = reihe, j = spalte; i >= 0 && j < 8; i--, j++) {
            if (chessField[i/*reihe*/][j/*spalte*/] == 1) {
                return false;
            }
        }
        return true;
    }
}
