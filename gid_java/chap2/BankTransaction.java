import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser {

    private static final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    private BankTransaction parseFromCSV(final String line){
        String[] columns = line.split(",");

        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double ammount = Double.parseDouble(columns[1]);
        final String description = columns[2];

        return new BankTransaction(date, ammount, description);
    }

    public List<BankTransaction> parseLinesFromCSV(final List<String> lines){
        final List<BankTransaction> bankTransactions = new ArrayList<>();
        for(final String line : lines){
            bankTransactions.add(parseFromCSV(line));
        }
    return bankTransactions;
    }
}

public class BankTransaction {
    private final LocalDate date;
    private final double ammount;
    private final String description;

    public BankTransaction(final LocalDate date, final double ammount, final String description){
        this.date = date;
        this.ammount = ammount;
        this.description = description;
    }

    public LocalDate getDate(){
        return date;
    }
    public double getAmmount(){
        return ammount;
    }
    public String getDescription(){
        return description;
    }

    @Override
    public String toString(){
        return "BankTransaction{" +
            "date = " + date +
            ", ammount = " + ammount + 
            ", description = '" + description + 
            "'}";
    }

    @Override
    public boolean equalse(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.ammount, ammount) == 0 &&
            date.equals(that.date) &&
            description.equals(that.description);
    }

    @Override
    public int hashCode(){
        return Object.hash(date, ammount, description);
    }
}