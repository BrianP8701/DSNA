package Class1;

import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {
        // Keeps track of tiles in tic-tac-toe board
        String[] tiles = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

        // Takes input from you in terminal
        Scanner scan = new Scanner(System.in);
        
        // True for X turn, false for O turn
        boolean b = true;

        // Loops until game ends.
        while(!gameEnd(tiles)){
            printBoard(tiles);
            boolean gettingInput = true;
            int newTile = -1;
            // Loops until player chooses a tile that is empty. Because a player can't choose a tile that already has an O or X
            while(gettingInput){
                newTile = scan.nextInt();
                if(tiles[newTile] == " ") gettingInput = false;
            }
            // Places O or X in tile
            if(b){
                tiles[newTile] = "X";
            } else{
                tiles[newTile] = "O";
            }
            b = !b;
        }
        printBoard(tiles);

        // Whoever's move the game finishes on, is the winner
        if(!b){
            System.out.println("\n\n X Won!");
        } else{
            System.out.println("\n\n O Won!");
        }
        scan.close();
    }

    public static void printBoard(String[] s){
        System.out.println(s[0] + " | " + s[1] + " | " + s[2]);
        System.out.println("---------");
        System.out.println(s[3] + " | " + s[4] + " | " + s[5]);
        System.out.println("---------");
        System.out.println(s[6] + " | " + s[7] + " | " + s[8]);
    }

    // Return true if the game ended
    // Return false if the game is still going
    public static boolean gameEnd(String[] s){
        // Check Horizontal
        if(s[0] != " "){
            if(s[0] == s[1] && s[1] == s[2]) return true;
        }
        if(s[3] != " "){
            if(s[3] == s[4] && s[4] == s[5]) return true;
        }
        if(s[6] != " "){
            if(s[6] == s[7] && s[7] == s[8]) return true;
        }
        
        // Check Vertical
        if(s[0] != " "){
            if(s[0] == s[3] && s[3] == s[6]) return true;
        }
        if(s[1] != " "){
            if(s[1] == s[4] && s[4] == s[7]) return true;
        }
        if(s[2] != " "){
            if(s[2] == s[5] && s[5] == s[8]) return true;
        }

        // Check Diagonal
        if(s[0] != " "){
            if(s[0] == s[4] && s[4] == s[8]) return true;
        }
        if(s[2] != " "){
            if(s[2] == s[4] && s[4] == s[6]) return true;
        }
        return false;
    }
}
