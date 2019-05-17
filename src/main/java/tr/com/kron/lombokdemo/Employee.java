package tr.com.kron.lombokdemo;

import lombok.*;

@Value
public class Employee {
    private String firstName;
    private String lastname;
    private String email;
    private String password;

}

