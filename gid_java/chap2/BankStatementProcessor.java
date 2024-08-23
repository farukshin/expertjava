import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankTransactionAnalyzer {

    private static final String RESOURCES = "resource/";
    private static final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
    
    public static void main(final String... args) throws IOException {
        
        final BankStatementCSVParser bankStatementParser = new BankStatementCSVParser();
        final Path path = Paths.get(RESOURCES + args[0]);
        final List<String> lines = Files.readAllLines(path);

        final List<BankTransaction> bankTransactions = bankStatementParser.parseLinesFromCSV(lines);

        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(bankTransactions);

        collectSummary(bankStatementProcessor);
               
    }

    private static void collectSummary(BankStatementProcessor bankStatementProcessor){
        System.out.println("The total for all transaction is " + bankStatementProcessor.calculateTotalAmmount());
        System.out.println("Transaction in JANUARY " + bankStatementProcessor.calculateTotalInMonth(Month.JANUARY));
        System.out.println("Transaction in FEBRUARY " + bankStatementProcessor.calculateTotalInMonth(Month.FEBRUARY));
    }
}


public class BankStatementProcessor {
    private final List<BankTransaction> bankTransactions;
    public BankStatementProcessor(final List<BankTransaction> bankTransactions){
        this.bankTransactions = bankTransactions;
    }

    public double calculateTotalAmmount() {
        double total = 0d;
        for(BankTransaction tran : bankTransactions){
            total += tran.getAmmount();
        }
        return total;
    }

    public double calculateTotalInMonth(Month month) {
        double total = 0d;
        for(BankTransaction tran : bankTransactions){
            if (tran.getDate().getMonth() == month){
                
            }            
        }
        return total;
    }
}