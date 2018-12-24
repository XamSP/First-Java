package VIPExercise;

public class VIPCustomer {

    private String name;
    private int credit;
    private String email;

    public VIPCustomer() {
        this("Unknown", 0, "unknown");
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getEmail() {
        return email;
    }

    public VIPCustomer(String name, int credit) {
        this(name, credit, "unknown");
    }

    public VIPCustomer(String name, int credit, String email) {
        this.name = name;
        this.credit = credit;
        this.email = email;
    }

    public static void main(String[] args) {

        VIPCustomer myAccount = new VIPCustomer("Max", 700);
        System.out.println(myAccount.getName());
        System.out.println(myAccount.getEmail());
    }
}
