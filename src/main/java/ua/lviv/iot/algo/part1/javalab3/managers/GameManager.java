package ua.lviv.iot.algo.part1.javalab3.managers;

import ua.lviv.iot.algo.part1.javalab3.writer.GameWriter;
import ua.lviv.iot.algo.part1.javalab3.models.*;

import java.util.List;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;

public class GameManager {
    private final List<Game> games = new LinkedList<>();

    public void addGame(final Game game) {
        this.games.add(game);
    }
    public List<Game> findAllWithHigherYearOfReleaseThan (int year) {
        return games.stream().filter(game -> game.getYear()> year).collect(Collectors.toList());
    }
    public List<Game> findAllWithPublisher(String publisher) {
        return games.stream()
                .filter(game -> Objects.equals(game.getPublisher(), publisher))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Game> gameManager = new LinkedList<>();
        gameManager.add(new BoardGame("Parker Brothers", "Monopoly", 1935, 2, 8, 1, 3));
        gameManager.add(new BoardGame("Hasbro", "Jenga", 1970, 2, 4, 1, 3));
        gameManager.add(new ComputerGame("Rockstar Games", "GTA", 2001, 1, 30, 5, 3));
        gameManager.add(new ComputerGame("Focus Entertainment", "SnowRunner", 2021, 1, 4, 1, 3));
        gameManager.add(new MobileGame("Krafton", "Pubg Mobile", 2018, 1, 4, 1, 3));
        gameManager.add(new MobileGame("Supercell", "Clash of Clans", 2012, 1, 50, 1, 3));
        gameManager.add(new VideoGame("GSC Game World", "S.T.A.L.K.E.R.", 2007, 1, 4, 1, 0));
        gameManager.add(new VideoGame("GSC Game World", "Cossacks", 2001, 1, 1, 6, 0));
        GameWriter gameWriter = new GameWriter();
        gameWriter.writeToFile(gameManager);
    }
}