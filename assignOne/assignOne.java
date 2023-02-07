
package assignOne;

/**
 * assignOne
 * Author: Steven Nguyen
 * Program: Tic Tac Toe Game
 */
public class assignOne {

    public static void main(String[] args) {
        boolean winner = true;

        char[][] userInputs = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

        while (winner) {
            printgameBoard(userInputs);

            if (checkWinner() != "")
                winner = false;

        }
    }

    public static void printgameBoard(char[][] gameBoard) {
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.printf("[%c] ", gameBoard[x][y]);
            }
            System.out.println();
        }
        //System.out.printf("[%c] [%c] [%c]\n[%c] [%c] [%c] \n[%c] [%c] [%c]", gameBoard[0][0]);

    }

    public static void placeInputPosition(char[][] gameBoard, int pos, String user) {

    }

    public static String checkWinner() {

        return null;

    }
}
