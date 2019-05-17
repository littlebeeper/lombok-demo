package tr.com.kron.lombokdemo;

import lombok.*;
import lombok.experimental.Wither;

@Value
public class Employee {
    private String firstName;
    private String lastname;
    private String email;
    @Wither(AccessLevel.PROTECTED) @NonNull private String password;

}

