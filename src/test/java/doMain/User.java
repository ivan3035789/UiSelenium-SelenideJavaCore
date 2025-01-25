package doMain;

import lombok.Value;

@Value
public class User {
    String name = "Петя";
    String password = "123";

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
