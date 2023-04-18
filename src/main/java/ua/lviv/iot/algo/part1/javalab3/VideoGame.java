package ua.lviv.iot.algo.part1.javalab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class VideoGame extends Game{
    int currentPlayers = 3;
    public VideoGame(String publisher, String title, int year, int minPlayers, int maxPlayers, int numberOfParts){
        super(publisher, title, year, minPlayers, maxPlayers, numberOfParts);
    }
    @Override
    public String getHeaders(){
        return "Publisher,Title,Year,MinPlayers,MaxPlayers,NumberOfParts";
    }
    @Override
    public String toCSV(){
        return publisher +","+ title +","+ year +","+  minPlayers +","+ maxPlayers +","+ numberOfParts;
    }
    @Override
    public int connectPlayer(int currentPlayers) {return 0;}
    @Override
    public int disconnectPlayer(int currentPlayers) {return 0;}
}