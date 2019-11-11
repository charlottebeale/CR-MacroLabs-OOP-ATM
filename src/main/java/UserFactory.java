public class UserFactory {

    public UserFactory() {}

    public User generateUser(String name, String password) {
        User user = new User();
        user.setUserName(name);
        user.setPassword(password);
        return user;
    }
}
