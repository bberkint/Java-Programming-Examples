
package rockscissorpapergamehafta6;


public class Main {

    
    public static void main(String[] args) {
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        
        GameArena arena = new GameArena();
        arena.addPlayers(player1,player2);
        arena.startGame();
    }
    
}
