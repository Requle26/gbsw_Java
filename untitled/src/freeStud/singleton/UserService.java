package freeStud.singleton;

public class UserService {
    private static final UserService instance = new UserService();

    private UserService() {}

    public static UserService getInstance() {
        return instance;
    }
}
