import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TestTransactions {

    User user = new User();

    SavingsAccount savings = new SavingsAccount();

    private Transaction generateTestLog() {
        user.addAccount(savings);
        user.depositFunds(100.0d, savings);
        ArrayList transactions = user.getAllTransactions();
        Transaction transaction = (Transaction)transactions.get(0);;
        return transaction;
    }
    @Test
    public void testGetTransactionHistory_WithdrawDeposit() {
        Transaction transaction = generateTestLog();
        String expected = transaction.getTransactionHiatory();
        String output = transaction.getTransactionHiatory();
        //output = null; // Uncomment to fail

        Assert.assertEquals(expected, output);
        //Assert.assertNotNull(output);
    }


}