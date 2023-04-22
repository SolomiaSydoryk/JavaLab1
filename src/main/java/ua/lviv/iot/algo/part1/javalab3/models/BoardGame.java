package ua.lviv.iot.algo.part1.javalab3.models;

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

    public BoardGame(String publisher, String title, int year, int minPlayers, int maxPlayers, int numberOfParts, int currentPlayers) {
        super(publisher, title, year, minPlayers, maxPlayers, numberOfParts);
        this.currentPlayers = currentPlayers;
    }

    @Override
    public String getHeaders() {
        return "Publisher,Title,Year,MinPlayers,MaxPlayers,NumberOfParts,CurrentPlayers";
    }

    @Override
    public String toCSV() {
        return publisher + "," + title + "," + year + "," + minPlayers + "," + maxPlayers + "," + numberOfParts +","+ currentPlayers;
    }

    @Override
    public int connectPlayer() {
        if (currentPlayers < maxPlayers) {
            return this.currentPlayers++;
        } else {
            return 0;
        }
    }

    @Override
    public int disconnectPlayer() {
        if (currentPlayers > 0 && currentPlayers <= maxPlayers) {
            return this.currentPlayers--;
        } else {
            return 0;
        }
    }
}