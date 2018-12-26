package PrinterEncapsulationExercise;

public class Computer {

    public int printer;

    public static void main(String[] args) {
        Printer printer = new Printer(100, 15);

        printer.isDuplexPrinter();

        printer.printPaper();

        printer.printPaper();

        printer.addTone(5);

        printer.addSheets(1);

        printer.getSheets();

        printer.getTonerLevel();

        printer.getTonerLevel();

        printer.showAllPrintedSheets();

    }

}
