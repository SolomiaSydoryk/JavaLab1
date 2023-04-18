package ua.lviv.iot.algo.part1.javalab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardGameTest {

    @Test
    void testConnectPlayer(){
        BoardGame boardGame =  new BoardGame("Hasbro", "Jenga", 1970, 2, 4);
        assertEquals(4, boardGame.connectPlayer(3));
    }
    @Test
    void testDisconnectPlayer(){
        BoardGame boardGame = new BoardGame("Hasbro", "Jenga", 1970, 2, 4);
        assertEquals(0, boardGame.connectPlayer(5));
    }
}