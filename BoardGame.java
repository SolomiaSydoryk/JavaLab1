package ua.lviv.iot.algo.part1.lab2;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class BoardGame extends Game{
    public BoardGame(String publisher, String title, int year, int minPlayers, int maxPlayers){
        super(publisher, title, year, minPlayers, maxPlayers);
    }
    public void connectPlayer(int currentPlayers){
        if (currentPlayers<maxPlayers){
            currentPlayers+=1;
        } else {System.out.println("Maximum number of players!");}
    }
    public void disconnectPlayer(int currentPlayers){
        if (currentPlayers!=0){
            currentPlayers-=1;
        } else {System.out.println("There are no players in the game");}
    }
    @Override
    void connectPlayer() {}
    @Override
    void disconnectPlayer() {}
}