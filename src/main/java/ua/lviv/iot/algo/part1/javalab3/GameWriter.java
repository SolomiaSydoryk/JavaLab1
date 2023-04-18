package ua.lviv.iot.algo.part1.javalab3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GameWriter {
    private static final String FILENAME = "games.csv";
    public void writeToFile(List<Game> games) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(FILENAME);
            writer.append(games.get(0).getHeaders());
            for (Game game : games) {
                writer.append("\n");
                writer.append(game.toCSV());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                writer.flush();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}