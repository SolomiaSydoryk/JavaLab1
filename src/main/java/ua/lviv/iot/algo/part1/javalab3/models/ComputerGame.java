package ua.lviv.iot.algo.part1.javalab3.models;

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

public class ComputerGame extends Game {
    private int currentPlayers = 3;

    public ComputerGame(String publisher, String title, int year, int minPlayers, int maxPlayers, int numberOfParts, int currentPlayers) {
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
        return currentPlayers++;
    }

    @Override
    public int disconnectPlayer() {
        return currentPlayers--;
    }
}