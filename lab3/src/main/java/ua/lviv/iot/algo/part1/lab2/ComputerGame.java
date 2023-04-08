package ua.lviv.iot.algo.part1.lab2;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class ComputerGame extends Game{
    int numberOfParts;
    public ComputerGame(String publisher, String title, int year, int numberOfParts, int minPlayers, int maxPlayers){
        super(publisher, title, year, minPlayers, maxPlayers);
        this.numberOfParts = numberOfParts;
    }
    @Override
    void connectPlayer() {}
    @Override
    void disconnectPlayer() {}
}