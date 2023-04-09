package ua.lviv.iot.algo.part1.javalab3;

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

public abstract class Game {
    protected String publisher;
    protected String title;
    protected int year;
    protected int minPlayers;
    protected int maxPlayers;
    public abstract int connectPlayer(int currentPlayers);
    public abstract int disconnectPlayer(int currentPlayers);
}