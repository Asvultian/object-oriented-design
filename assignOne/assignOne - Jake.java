
package assignOne;

import java.util.Scanner;

/**
 * assignOne
 * Author: Steven Nguyen
 * Program: Tic Tac Toe Game
 */
public class assignOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game gb = new Game();
        int pos;
        String winner = gb.checkWinner();

        while(winner == null){
            gb.printgameBoard(gb.getBoard());

            boolean taken = true;
            char[][] board = gb.getBoard();

            //player choosing
            do{
                System.out.print("Enter a position : ");
                pos = input.nextInt();
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        if(board[i][j] == Character.forDigit(pos, 10)){
                            taken = false;
                            i=4;
                            j=4;
                        }
                    }
                }
            }while(taken);
            gb.placeInputPosition(board, pos, "player");
            
            //computer choosing
            if(gb.checkWinner() == null){
                taken = true;
                int botPos;
                do{
                    botPos = (int)(Math.random()*8+1);
                    for(int i=0; i<3; i++){
                        for(int j=0; j<3; j++){
                            if(board[i][j] == Character.forDigit(botPos, 10)){
                                taken = false;
                                i=4;
                                j=4;
                            }
                        }
                    }
                }while(taken);
                gb.placeInputPosition(board, botPos, "computer");
            }

            //check for winner
            winner = gb.checkWinner();
        }
        if(winner.equalsIgnoreCase("draw")){ System.out.println("It is a Draw"); }
        else{ System.out.println("The winner is the " + winner); }

        input.close();
    }

    
}


class Game {
    static char[][] gameboard = {{'1','2','3'},{'4','5','6'},{'7','8','9'}};

    Game(){}

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
        return;
    } 

    public static String checkWinner(){
        char winning_user = 'o';
        //check board
        if(gameboard[0][0] == gameboard[0][1] && gameboard[0][1] == gameboard[0][2]){ winning_user = gameboard[0][0]; }
        else if(gameboard[0][0] == gameboard[1][0] && gameboard[1][0] == gameboard[2][0]){ winning_user = gameboard[0][0]; }
        else if(gameboard[0][0] == gameboard[1][1] && gameboard[1][1] == gameboard[2][2]){ winning_user = gameboard[0][0]; }
        else if(gameboard[0][1] == gameboard[1][1] && gameboard[1][1] == gameboard[2][1]){ winning_user = gameboard[1][1]; }
        else if(gameboard[1][0] == gameboard[1][1] && gameboard[1][1] == gameboard[1][2]){ winning_user = gameboard[1][1]; }
        else if(gameboard[0][2] == gameboard[1][2] && gameboard[1][2] == gameboard[2][2]){ winning_user = gameboard[2][2]; }
        else if(gameboard[2][0] == gameboard[2][1] && gameboard[2][1] == gameboard[2][2]){ winning_user = gameboard[2][2]; }
        else{   //check if draw
            int notPicked = 0;
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(!(gameboard[i][j] == 'X' || gameboard[i][j] == 'O')){
                        notPicked++;
                        i=4;
                        j=4;
                    }
                }
            }
            if(notPicked == 0) { winning_user = 'C'; }
        }

        //returns
        if(winning_user == 'X'){ return "Player"; }
        else if (winning_user == 'O'){ return "Computer"; }
        else if (winning_user == 'C'){ return "Draw"; }
        else{ return null; }
    }

    //returns the game array
    public static char[][] getBoard(){
        return gameboard;
    }
}