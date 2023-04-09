package ua.lviv.iot.algo.part1.javalab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VideoGameTest {
    @Test
    void testPublisher(){
    MobileGame mobileGame = new MobileGame("Krafton", "Pubg Mobile", 2018, 1, 4);
    assertEquals("Krafton", mobileGame.getPublisher());
    }
    @Test
    void testTitle(){
        VideoGame videoGame = new VideoGame("GSC Game World", "S.T.A.L.K.E.R.", 2007, 4, 1, 1);
        assertEquals("S.T.A.L.K.E.R.", videoGame.getTitle());
    }
    @Test
    void testYear(){
        ComputerGame computerGame = new ComputerGame("Focus Entertainment", "SnowRunner", 2021, 1, 1, 4);
        assertEquals(2021, computerGame.getYear());
    }
    @Test
    void testMinPlayer(){
        BoardGame boardGame = new BoardGame("Parker Brothers", "Monopoly", 1935, 2, 8);
        assertEquals(2, boardGame.getMinPlayers());
    }
    @Test
    void testMaxPlayer(){
        BoardGame boardGame = new BoardGame("Hasbro", "Jenga", 1970, 2, 4);
        assertEquals(4 , boardGame.getMaxPlayers());
    }
    @Test
    void testNumberOfParts(){
        VideoGame videoGame = new VideoGame("GSC Game World", "Cossacks", 2001, 6, 1, 1);
        assertEquals(6, videoGame.getNumberOfParts());
    }
}