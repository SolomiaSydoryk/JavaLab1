package ua.lviv.iot.algo.part1.javalab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class BoardGame extends Game {
    int currentPlayers = 3;
        public BoardGame(String publisher, String title, int year, int minPlayers, int maxPlayers, int numberOfParts){
            super(publisher, title, year, minPlayers, maxPlayers, numberOfParts);
        }
    @Override
    public String getHeaders(){
        return "Publisher,Title,Year,MinPlayers,MaxPlayers";
    }
    @Override
    public String toCSV(){
        return publisher +","+ title +","+ year +","+ minPlayers +","+ maxPlayers +","+ numberOfParts;
    }
    @Override
    public int connectPlayer(int currentPlayers) {
        if (currentPlayers < maxPlayers) {
            return this.currentPlayers = currentPlayers + 1;
        } else {
            return 0;
        }
    }
    @Override
    public int disconnectPlayer(int currentPlayers) {
        if (currentPlayers > 0 && currentPlayers<=maxPlayers) {
            return this.currentPlayers = currentPlayers - 1;
        } else {
            return 0;
        }
    }
}