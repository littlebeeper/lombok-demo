package tr.com.kron.lombokdemo;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {
    private String firstName;
    private String lastname;
    private String email;

}

