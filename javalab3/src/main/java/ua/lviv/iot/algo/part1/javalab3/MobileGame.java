package ua.lviv.iot.algo.part1.javalab3;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)

public class MobileGame extends Game{
    int currentPlayers;
    public MobileGame(String publisher, String title, int year, int minPlayers, int maxPlayers){
        super(publisher, title, year, minPlayers, maxPlayers);
    }

    @Override
    public int connectPlayer(int currentPlayers) {return 0;}
    @Override
    public int disconnectPlayer(int currentPlayers) {return 0;}
}