package ua.lviv.iot.algo.part1.lab1;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BoardGame {
    private String title;
    private int minPlayers;
    private int maxPlayers;
    private int currentPlayers;

    public void addPlayer(){
        if (currentPlayers<maxPlayers){
            currentPlayers+=1;
        } else {System.out.println("Maximum number of players");};
    }
    public void removePlayer (){
        if (currentPlayers!=0){
            currentPlayers-=1;
        } else {System.out.println("There are no players in the game");}
    }
    public boolean canPlay(int currentPlayers) {
        if (currentPlayers > minPlayers && currentPlayers <= maxPlayers) {
            return true;
        } else {return false;}
    }
    private static BoardGame instance = new BoardGame();
    public static BoardGame getInstance() {
        return instance;
    }
    public static void main(String[] args) {
        BoardGame[] game = new BoardGame[4];
        game[0] = new BoardGame();
        game[1] = new BoardGame("Monopoly", 2, 8, 6);
        game[2] = BoardGame.getInstance();
        game[3] = BoardGame.getInstance();
        for(int i=0; i<4; i++)
        {
            System.out.println(game[i].toString());
        }
    }
}