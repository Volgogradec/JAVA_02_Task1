public class Main {
    public static void main(String[] args) {
        int clientBalance = 2_000_000_000;
        int transfer = 500_000_000;
        int totalBalance = clientBalance + transfer;
        System.out.println(totalBalance);
    }
}