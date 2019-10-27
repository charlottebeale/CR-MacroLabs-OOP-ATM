

public class LogIn {

    public boolean checkUsername(String username){
        Account newAcc = new Account();

            if(newAcc.getUsername(username) == 0)
                return true;

                return false;
    }


    public boolean checkPassword(String password){
        Account newAcc = new Account();

            if(newAcc.getPassword(password) == 0)
                return true;

                return false;

    }

}

