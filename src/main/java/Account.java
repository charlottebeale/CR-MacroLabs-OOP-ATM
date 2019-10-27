public class Account {

    String accoutHolder[][] = new String [5][4];
    private Double checkingBalance;
    private Double savingBalance;
    private Double investBalance;


    public Account(){

        //Username and password of client that already exists
        accoutHolder[0][0] = "JaneDoe";
        accoutHolder[0][1] = "p123";

        //Username and password of client that already exists
        accoutHolder[1][0] = "JohnS";
        accoutHolder[1][1] = "MK67";

    }

   public Integer getUsername(String username){

        for (int index = 0; index < 5; index ++){

            if ( username.equals(accoutHolder[index][0])){
                return 0;
            }
        }

        return 1;
    }

    public Integer getPassword(String password){

        for (int index = 0; index < 5; index ++){

            if (password.equals(accoutHolder[index][1])){
                return 0;
            }
        }

        return 1;
    }

  /*  public void setFirstName() {
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
    }*/
}
