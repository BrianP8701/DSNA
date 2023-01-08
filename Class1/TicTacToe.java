package Class1;

import java.util.Scanner;

public class TicTacToe {
    
    public static void main(String[] args) {

        String[] tiles = {" ", " ", " ", " ", " ", " ", " ", " ", " "};

        printBoard(tiles);
        Scanner scan = new Scanner(System.in);
        
        boolean b = true;

        while(!gameEnd(tiles)){
            printBoard(tiles);
            int newTile = scan.nextInt();

            if(b){
                tiles[newTile] = "X";
            } else{
                tiles[newTile] = "O";
            }
            b = !b;
        }
    }

    public static void printBoard(String[] s){
        System.out.println(" " + s[0] + "|" + s[1] + " |" + s[2] + "  ");
        System.out.println("--------");
        System.out.println(" " + s[3] + "|" + s[4] + " |" + s[5] + "  ");
        System.out.println("--------");
        System.out.println(" " + s[6] + "|" + s[7] + " |" + s[8] + "  ");
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
