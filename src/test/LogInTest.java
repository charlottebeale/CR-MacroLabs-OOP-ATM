import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogInTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCheckUsername() {

        LogIn newLogIn = new LogIn();
        boolean actual = newLogIn.checkUsername("JaneDoe");

        Assert.assertEquals(true, actual);
    }

    @Test
    public void testCheckUsername2() {

        LogIn newLogIn = new LogIn();
        boolean actual = newLogIn.checkUsername("Mi");

        Assert.assertEquals(false, actual);
    }

    @Test
    public void testCheckPassword(){
        LogIn newLogIn = new LogIn();
        boolean actual = newLogIn.checkPassword("MK67");

        Assert.assertEquals(true, actual);
    }

    @Test
    public void testCheckPassword2(){
        LogIn newLogIn = new LogIn();
        boolean actual = newLogIn.checkPassword("556");

        Assert.assertEquals(false, actual);
    }
}
