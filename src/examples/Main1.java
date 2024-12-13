package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        String filePath = "src/examples/text_file.txt";

        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            long count = lines.flatMap(s -> Arrays.stream(s.split("\\W+")))
                    .filter(word -> !word.isEmpty())
                    .map(String::toLowerCase)
                    .distinct()
                    .count();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
