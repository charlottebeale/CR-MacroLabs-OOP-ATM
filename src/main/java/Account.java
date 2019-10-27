public class Account {

    private String firstName;
    private String lastName;
    private Double checkingBalance;
    private Double savingBalance;
    private Double investBalance;


    public Account(){

        this.firstName = firstName;
        this.lastName = lastName;
        this.checkingBalance = 0.00;
        this.savingBalance = 0.00;
        this.investBalance = 0.00;
    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getCheckingBalance() {
        return checkingBalance;
    }

    public void depositChecking(Double deposit) {
        this.checkingBalance += deposit;
    }

    public void withdrawChecking(Double withdraw) {
        this.checkingBalance -= withdraw;
    }

    public Double getSavingBalance() {
        return savingBalance;
    }

    public void depositSaving(Double deposit) {
        this.savingBalance += deposit;
    }

    public void withdrawSaving(Double withdraw) {
        this.savingBalance -= withdraw;
    }

    public Double getInvestBalance() {
        return investBalance;
    }

    public void depositInvest(Double deposit) {
        this.investBalance += deposit;
    }

    public void withdrawInvest(Double withdraw) {
        this.investBalance -= withdraw;
    }
}
