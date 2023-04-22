package ua.lviv.iot.algo.part1.javalab3.models;

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
    protected int numberOfParts;

    public abstract int connectPlayer();

    public abstract int disconnectPlayer();

    public abstract String getHeaders();

    public abstract String toCSV();
}