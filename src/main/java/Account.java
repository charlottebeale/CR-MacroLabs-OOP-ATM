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

    public void transfer(Integer account, Integer account2, Double money){
        switch(account) {
            case 1:
                switch (account2) {
                    case 1:
                        this.checkingBalance -= money;
                        this.savingBalance += money;
                        break;
                    case 2:
                        this.checkingBalance -= money;
                        this.investBalance += money;
                        break;
                }
            case 2:
                switch (account2) {
                    case 1:
                        this.savingBalance -= money;
                        this.checkingBalance += money;
                        break;
                    case 2:
                        this.savingBalance -= money;
                        this.investBalance += money;
                        break;
                }
            case 3:
                switch (account2) {
                    case 1:
                        this.investBalance -= money;
                        this.checkingBalance += money;
                        break;
                    case 2:
                        this.investBalance -= money;
                        this.savingBalance += money;
                        break;
                }
        }
    }
}
