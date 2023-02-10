public interface BankInterface {
    int getBalance();
    String depositmoney(int money);
    String withdraw(String savedPassward, int money);

     double calculateIntrest(int time);

    int checkBalance();

    String addMoney(int money);

    String withDrawMoney(int money, String enteredPassword);

    float calculateInterest(int years);
}
