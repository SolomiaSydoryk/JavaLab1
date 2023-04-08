package ua.lviv.iot.algo.part1.lab2;

import java.util.List;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameManager {
    private final List<Game> games = new LinkedList<>();

    public void addGame(final Game game) {
        this.games.add(game);
    }

    public List<Game> findAllWithHigherYearOfReleaseThan(int year) {
        Stream<Game> gameStream = games.stream()
                .filter(game -> game.getYear() > year);
        return gameStream
                .collect(Collectors.toList());
    }

    public List<Game> findAllWithPublisher(String publisher) {
        return games.stream().filter(game -> game.getPublisher() == publisher).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.addGame(new ComputerGame("Rockstar Games", "GTA ", 2001, 5, 1, 30));
        gameManager.addGame(new ComputerGame("Focus Entertainment", "SnowRunner", 2021, 1, 1, 4));
        gameManager.addGame(new BoardGame("Parker Brothers", "Monopoly", 1935, 2, 8));
        gameManager.addGame(new BoardGame("Hasbro", "Jenga", 1970, 2, 4));
        gameManager.addGame(new MobileGame("Krafton", "Pubg Mobile", 2018, 1, 4));
        gameManager.addGame(new MobileGame("Supercell", "Clash of Clans", 2012, 1, 50));
        gameManager.addGame(new VideoGame("GSC Game World", "S.T.A.L.K.E.R.", 2007, 4, 1, 1));
        gameManager.addGame(new VideoGame("GSC Game World", "Cossacks", 2001, 6, 1, 1));

        for (Game game : gameManager.games) {
            System.out.println(game);
        }

        System.out.println("\n");

        var gamesWithYearOfRelease = gameManager.findAllWithHigherYearOfReleaseThan(2005);

        System.out.println("Games with year of release higher than 2005: \n");
        for (Game game : gamesWithYearOfRelease) {
            System.out.println(game);
        }

        System.out.println("\n");

        var gamesWithSpecificPublisher = gameManager.findAllWithPublisher("GSC Game World");

        System.out.println("Games with a publisher GSC Game World: \n");
        for (Game game : gamesWithSpecificPublisher) {
            System.out.println(game);
        }
    }
}