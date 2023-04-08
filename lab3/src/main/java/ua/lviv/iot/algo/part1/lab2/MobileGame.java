package ua.lviv.iot.algo.part1.lab2;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class MobileGame extends Game{
    public MobileGame(String publisher, String title, int year, int minPlayers, int maxPlayers){
        super(publisher, title, year, minPlayers, maxPlayers);
    }
    @Override
    void connectPlayer() {}
    @Override
    void disconnectPlayer() {}
}
