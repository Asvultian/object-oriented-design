
package assignOne;

import java.util.Scanner;
import java.util.random.*;

/**
 * assignOne
 * Author: Steven Nguyen
 * Program: Tic Tac Toe Game
 */
public class assignOne {
    static char[][] game_board = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
    static String winnerName = "none";
    public static void main(String[] args) {
        boolean game_end = false;
        int which_space;
        String user="player", bot="bot", choice = "player";
        

        while (!game_end) {
            printgameBoard(game_board);
            Scanner input = new Scanner(System.in);
            if(choice == "player"){
                System.out.println("What Square do you chose");
                which_space = input.nextInt();
                placeInputPosition(game_board, which_space, choice);
                choice = bot;
            }
            else if (choice == "bot"){
                which_space=Math.random();
                placeInputPosition(game_board, , choice);
            }
            
            if (checkWinner() != "none")
                
                game_end = true;
        }
    }

    public static void printgameBoard(char[][] gameBoard) {
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.printf("[%c] ", gameBoard[x][y]);
            }
            System.out.println();
        }
        //System.out.printf("[%c] [%c] [%c]\n[%c] [%c] [%c] \n[%c] [%c] [%c]", gameBoard[0][0]); trash code

    }

    public static void placeInputPosition(char[][] gameBoard, int pos, String user) {
        boolean chosen = true;
        char sym;
        if(user == "player"){
            sym = 'X';
        }
        else{
            sym = 'O';
            //bot stuff
        }
        while(chosen){
        switch(pos){
            case 1: 
                if(gameBoard[0][0] == '1'){
                    gameBoard[0][0] = sym;
                    chosen = false;
                    break;
                }
            case 2:
            if(gameBoard[0][1] == '2'){
                gameBoard[0][1] = sym;
                chosen = false;
                break;
            }
            case 3:
            if(gameBoard[0][2] == '3'){
                gameBoard[0][2] = sym;
                chosen = false;
                break;
            }
            case 4:
            if(gameBoard[1][0] == '4'){
                gameBoard[1][0] = sym;
                chosen = false;
                break;
            }
            case 5:
            if(gameBoard[1][1] == '5'){
                gameBoard[1][1] = sym;
                chosen = false;
                break;
            }
            case 6:
            if(gameBoard[1][2] == '6'){
                gameBoard[1][2] = sym;
                chosen = false;
                break;
            }
            case 7:
            if(gameBoard[2][0] == '7'){
                gameBoard[2][0] = sym;
                chosen = false;
                break;
            }
            case 8:
            if(gameBoard[2][1] == '8'){
                gameBoard[2][1] = sym;
                chosen = false;
                break;
            }
            case 9:
            if(gameBoard[2][2] == '9'){
                gameBoard[2][2] = sym;
                chosen = false;
                break;
            }
        }
        
    }
    }

    public static String checkWinner() {
        
        return null;

    }
}
