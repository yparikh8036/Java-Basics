import java.io.Console;

public class FormattedTable {

    void line(Console console) {
        console.printf("---------------------------------------------------------\n");
    }

    void printHeader(Console console) {
        console.printf("%-15s \t %s \t %s \t %s \n", "Player", "Matches", "Goals", "Goals per Match");
    }

    void printRow(Console console, String player, int matches, int goals) {
        console.printf("%-15s \t %5d \t\t %d \t\t %.1f \n", player, matches, goals, ((float)goals/(float)matches));
    }

    public static void main(String[] args) {
        FormattedTable formattedTable = new FormattedTable();
        Console console = System.console();
        if (console != null) {
            formattedTable.line(console);
            formattedTable.printHeader(console);
            formattedTable.line(console);
            formattedTable.printRow(console, "yash", 100, 122);
            formattedTable.printRow(console, "yash", 100, 122);
            formattedTable.printRow(console, "yash", 100, 122);
            formattedTable.line(console);
        }
    }
}