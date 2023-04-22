package ua.lviv.iot.algo.part1.javalab3.managers;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.javalab3.models.*;

import static org.junit.jupiter.api.Assertions.*;

class GameManagerTest {
    GameManager gameManager = new GameManager();
    @Test
    public void testAddGame(){
        gameManager.addGame(new ComputerGame("Rockstar Games", "GTA ", 2001, 5, 1, 30, 3));
        gameManager.addGame(new ComputerGame("Focus Entertainment", "SnowRunner", 2021, 1, 1, 4, 3));
        gameManager.addGame(new BoardGame("Parker Brothers", "Monopoly", 1935, 2, 8, 1, 3));
        gameManager.addGame(new BoardGame("Hasbro", "Jenga", 1970, 2, 4, 1, 3));
        gameManager.addGame(new MobileGame("Krafton", "Pubg Mobile", 2018, 1, 4, 1, 3));
        gameManager.addGame(new MobileGame("Supercell", "Clash of Clans", 2012, 1, 50, 1, 3));
        gameManager.addGame(new VideoGame("GSC Game World", "S.T.A.L.K.E.R.", 2007, 4, 1, 1, 0));
        gameManager.addGame(new VideoGame("GSC Game World", "Cossacks", 2001, 6, 1, 1, 0));
    }
    @Test
    void testFindAllWithHigherYearOfReleaseThan2005(){
        gameManager.addGame(new ComputerGame("Rockstar Games", "GTA ", 2001, 5, 1, 30, 3));
        gameManager.addGame(new ComputerGame("Focus Entertainment", "SnowRunner", 2021, 1, 1, 4, 3));
        gameManager.addGame(new BoardGame("Parker Brothers", "Monopoly", 1935, 2, 8, 1, 3));
        gameManager.addGame(new BoardGame("Hasbro", "Jenga", 1970, 2, 4, 1, 3));
        gameManager.addGame(new MobileGame("Krafton", "Pubg Mobile", 2018, 1, 4, 1, 3));
        gameManager.addGame(new MobileGame("Supercell", "Clash of Clans", 2012, 1, 50, 1, 3));
        gameManager.addGame(new VideoGame("GSC Game World", "S.T.A.L.K.E.R.", 2007, 4, 1, 1, 0));
        gameManager.addGame(new VideoGame("GSC Game World", "Cossacks", 2001, 6, 1, 1, 0));
        assertEquals(4, gameManager.findAllWithHigherYearOfReleaseThan(2005).size());
    }
    @Test
    void testFindAllWithPublisherGSCGameWorld(){
        gameManager.addGame(new ComputerGame("Rockstar Games", "GTA ", 2001, 5, 1, 30, 3));
        gameManager.addGame(new ComputerGame("Focus Entertainment", "SnowRunner", 2021, 1, 1, 4, 3));
        gameManager.addGame(new BoardGame("Parker Brothers", "Monopoly", 1935, 2, 8, 1, 3));
        gameManager.addGame(new BoardGame("Hasbro", "Jenga", 1970, 2, 4, 1, 3));
        gameManager.addGame(new MobileGame("Krafton", "Pubg Mobile", 2018, 1, 4, 1, 3));
        gameManager.addGame(new MobileGame("Supercell", "Clash of Clans", 2012, 1, 50, 1, 3));
        gameManager.addGame(new VideoGame("GSC Game World", "S.T.A.L.K.E.R.", 2007, 4, 1, 1, 0));
        gameManager.addGame(new VideoGame("GSC Game World", "Cossacks", 2001, 6, 1, 1, 0));
        assertEquals(2, gameManager.findAllWithPublisher("GSC Game World").size());
    }
}