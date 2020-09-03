package by.jrr.service;

import by.jrr.bean.User;

public class UserService {

    public boolean login(User user, String password){

        if (passwordVerification(user, password)){
            if (isUserBlocked(user)){
                dropNumberOfAttempts(user);
            }
            return true;
        }else {
            reduceNumberOfAttempts(user);
            if (ifNumberOfAttemptsIsDrop(user)){
                blockUser(user);
            }
            return false;
        }
    }
    public boolean passwordVerification(User user, String password){
        return user.getPassword().equals(password);
    }
    public int dropNumberOfAttempts(User user){
       return user.getNumberOfAttempts();
    }
    public boolean isUserBlocked(User user){
        return  user.isBlock();
    }

    public User reduceNumberOfAttempts(User user){
        int newNumberOfAttempt = user.getNumberOfAttempts() - 1;
        user.setNumberOfAttempts(newNumberOfAttempt);
        return user;
    }

    public  boolean ifNumberOfAttemptsIsDrop(User user){
        return user.getNumberOfAttempts() == 0;

    }

    public User blockUser(User user){
        user.setBlock(true);
        return user;
    }
}