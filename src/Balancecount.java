public class Balancecount {
    public static void main(String[] args) {
        double initialBalance = 1000.0;
        double interestRate = 0.05;

        double balanceAfterFirstYear = initialBalance + (initialBalance * interestRate);
        double balanceAfterSecondYear = balanceAfterFirstYear + (balanceAfterFirstYear * interestRate);
        double balanceAfterThirdYear = balanceAfterSecondYear + (balanceAfterSecondYear * interestRate);

        System.out.println("Balance after the first year: $" + balanceAfterFirstYear);
        System.out.println("Balance after the second year: $" + balanceAfterSecondYear);
        System.out.println("Balance after the third year: $" + balanceAfterThirdYear);
    }
}
