public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int remainderKiloBytes = kiloBytes % 1024;

        int megaBytes = kiloBytes >= 1024 ? (kiloBytes - remainderKiloBytes)/ 1024  : 0;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");

        }  else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
}
