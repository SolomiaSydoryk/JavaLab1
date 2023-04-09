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
    int currentPlayers ;
    public BoardGame(String publisher, String title, int year, int minPlayers, int maxPlayers) {
        super(publisher, title, year, minPlayers, maxPlayers);
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