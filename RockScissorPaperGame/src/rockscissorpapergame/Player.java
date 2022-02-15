
package rockscissorpapergamehafta6;

import java.util.Scanner;

enum HandSign{
    PAPER, SCISSOR , ROCK
}

class Player {
    String name;
    HandSign sign;
    int wins;
    static int draws;
    static int trials;
    

    public Player(String name) {
        this.name = name;
    }
      
    void move(){
        if(GameArena.isGameOver) return;
        boolean inputInvalid = false;
        Scanner input = new Scanner(System.in);        
        
        do {
            char userChoice = input.next().charAt(0);
            inputInvalid = false;
            switch (userChoice) {
            case 's':
                this.sign = HandSign.SCISSOR;        
                break;
            case 'r':
                this.sign = HandSign.ROCK;
                break;
            case 'p':
                this.sign = HandSign.PAPER;
            case 'q':
                GameArena.isGameOver = true;
                break;
            default:
                inputInvalid = true;
                break;
        }
            
        } while (inputInvalid);
            System.out.println(this.name + "'s " + sign);
        
    }
}
