package icu.insomniac.service;

public interface UserService {
    boolean signIn(String username, String password);

    boolean checkAccount(String username);
}
