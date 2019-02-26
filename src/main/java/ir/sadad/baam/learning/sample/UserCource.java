package ir.sadad.baam.learning.sample;

import java.util.List;
import java.util.Map;


public class UserCource {
    public UserCource() {
    }

    public UserCource(Map<User, List<String>> userCource) {
        this.userCource = userCource;
    }

    private Map<User, List<String>> userCource;

    public Map<User, List<String>> getUserCource() {
        return userCource;
    }

    public void setUserCource(Map<User, List<String>> userCource) {
        this.userCource = userCource;
    }

    @Override
    public String toString() {
        return "UserCource{" +
                 userCource +
                '}';
    }
}
