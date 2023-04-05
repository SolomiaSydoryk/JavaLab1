package ua.lviv.iot.algo.part1.lab2;
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
    abstract void connectPlayer();
    abstract void disconnectPlayer();
}