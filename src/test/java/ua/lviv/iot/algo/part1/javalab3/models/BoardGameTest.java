package ua.lviv.iot.algo.part1.javalab3.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardGameTest {
    @Test
    void testConnectPlayer() {
        BoardGame boardGame = new BoardGame("Hasbro", "Jenga", 1970, 2, 4, 1, 3);
        assertEquals(4, boardGame.connectPlayer());
    }

    @Test
    void testDisconnectPlayer() {
        BoardGame boardGame = new BoardGame("Hasbro", "Jenga", 1970, 2, 4, 1, 3);
        assertEquals(2, boardGame.connectPlayer());
    }
}
