package ua.lviv.iot.algo.part1.javalab3;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class ComputerGame extends Game{
    int currentPlayers = 3;
    public ComputerGame(String publisher, String title, int year, int minPlayers, int maxPlayers, int numberOfParts){
        super(publisher, title, year, minPlayers, maxPlayers, numberOfParts);
    }
    @Override
    public String getHeaders(){
        return "Publisher,Title,Year,MinPlayers,MaxPlayers,NumberOfParts";
    }
    @Override
    public String toCSV(){
        return publisher +","+ title +","+ year +","+ minPlayers +","+ maxPlayers +","+ numberOfParts ;
    }
    @Override
    public int connectPlayer(int currentPlayers) {return 0;}
    @Override
    public int disconnectPlayer(int currentPlayers) {return 0;}
}