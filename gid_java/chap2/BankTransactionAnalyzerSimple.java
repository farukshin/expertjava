import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES = "resource/";

    public static void main(String[] args) throws IOException {
        
        final Path path = Paths.get(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for(final String line : lines){
            final String[] columns = line.split(",");
            final double ammount = Double.parseDouble(columns[1]);
            total += ammount;
        }

        System.out.println("The total for all transaction is " + total);
    }
}
