import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Bunnell_Module9_Program2 {

    public static void main(String[] args) {
        Path path = Paths.get("data.file");
        Random rng = new Random();

        try {
            // Ensure file exists
            if (!Files.exists(path)) {
                Files.createFile(path);
                System.out.println("Created new file: " + path.toAbsolutePath());
            } else {
                System.out.println("Using existing file: " + path.toAbsolutePath());
            }

            // Append 10 random integers, space-separated
            boolean append = true;
            try (FileWriter fw = new FileWriter(path.toFile(), append)) {
                // If file already has content, ensure a separating space first
                if (Files.size(path) > 0) {
                    fw.write(" ");
                }
                for (int i = 0; i < 10; i++) {
                    int n = rng.nextInt(100); // 0..99
                    fw.write(Integer.toString(n));
                    if (i < 9) fw.write(" ");
                }
            }

            // Read and display the data
            String content = Files.readString(path).trim();
            System.out.println("Contents of data.file:");
            System.out.println(content);

        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
