import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Reads integers from input.txt one line at a time and writes their sum.
 */
public final class FileIO {

    /**
     * Prevents this program class from being instantiated.
     */
    private FileIO() {
    }

    /**
     * Reads and sums integer lines in input.txt.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        try (Scanner scanner =
                        new Scanner(new File("input.txt"));
                PrintWriter writer =
                        new PrintWriter(new FileWriter("output.txt"))) {
            int sum = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException e) {
                    writer.println("Error: invalid input");
                }
            }
            writer.println(sum);
        } catch (IOException e) {
            System.err.println(
                    "Error reading or writing a file: " + e.getMessage());
        }
    }
}
