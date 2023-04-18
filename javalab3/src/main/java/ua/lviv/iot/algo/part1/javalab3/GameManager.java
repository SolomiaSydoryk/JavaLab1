package ua.lviv.iot.algo.part1.javalab3;

import java.util.List;
import java.util.LinkedList;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GameManager {
    private final List<Game> games = new LinkedList<>();

    public void addGame(final Game game) {
        this.games.add(game);
    }

    public List<Game> findAllWithHigherYearOfReleaseThan(int year) {
        return games.stream()
                .filter(game -> game.getYear() > year)
                .collect(Collectors.toList());
    }

    public List<Game> findAllWithPublisher(String publisher) {
        return games.stream()
                .filter(game -> Objects.equals(game.getPublisher(), publisher))
                .collect(Collectors.toList());
    }
}