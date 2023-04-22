package ua.lviv.iot.algo.part1.javalab3.writer;

import ua.lviv.iot.algo.part1.javalab3.models.Game;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GameWriter {
    private static final String FILENAME = "games.csv";

    public void writeToFile(final List<Game> games) {

        try (FileWriter writer = new FileWriter(FILENAME);) {
            for (Game game : games) {
                writer.append(game.getHeaders());
                writer.append("\n");
                writer.append(game.toCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}