package PrinterEncapsulationExercise;

public class Printer {

    private static int printedSheets = 0;

    private int tonerLevel;

    private int sheets;

    //Check if it can print both sides of a page in one go.
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int sheets, boolean duplexPrinter) {
        this.tonerLevel = tonerLevel;
        this.sheets = sheets;
        this.duplexPrinter = duplexPrinter;
    }

    public Printer(int tonerLevel, int sheets) {
        this(tonerLevel, sheets, false);
    }

    public void printPaper(boolean doubleSided) {

        if(tonerLevel >= 10 && sheets > 0 && doubleSided && duplexPrinter){
            System.out.println("From " + this.sheets + "% tone to " + (this.tonerLevel - 10) + "% tone.");
            System.out.println("From " + this.sheets + " sheets to " + (this.sheets - 1) + " sheets.");
            this.tonerLevel -= 10;
            this.sheets -= 1;
            Printer.printedSheets++;
            System.out.println("Sheets has been printed both sides");

        }  else if (tonerLevel >= 5 && sheets > 0) {
            System.out.println("From " + this.tonerLevel + "% tone to " + (this.tonerLevel - 5) + "% tone.");
            System.out.println("From " + this.sheets + " sheets to " + (this.sheets - 1) + " sheets.");
            this.tonerLevel -= 5;
            this.sheets -= 1;
            Printer.printedSheets++;
            System.out.println("Sheets has been printed on one side");

        } else {
            System.out.println("Either not enough tone or sheets in the printer!");
        }
    }

    public void printPaper() {
        this.printPaper(false);
    }

    public void addSheets(int sheets) {
        if(sheets < 0) {
            System.out.println("Wrong Input!");

        } else {
            System.out.println("From " + this.sheets + " sheets to " + (this.sheets + sheets) + " sheets.");
            this.sheets += sheets;
        }

    }

    public void addTone(int tone) {
        if(tone < 0) {
            System.out.println("Wrong Input!");

        } else if (this.tonerLevel + tone >= 100){
            System.out.println("Tone is at 100%");
            this.tonerLevel = 100;

        } else {
            System.out.println("From " + this.sheets + "% tone to " + (this.sheets + sheets) + "% tone.");
            this.tonerLevel += tone;

        }

    }

    public int getTonerLevel() {
        System.out.println("Tone level at: " + tonerLevel);
        return tonerLevel;
    }

    public int getSheets() {
        System.out.println("There's " + sheets + " sheets.");
        return sheets;
    }

    public boolean isDuplexPrinter() {
        System.out.println("Is this a duplex printer: " + duplexPrinter);
        return duplexPrinter;
    }

    public void showAllPrintedSheets(){
        System.out.println("There's " + Printer.printedSheets + " printed sheets.");
    }

}