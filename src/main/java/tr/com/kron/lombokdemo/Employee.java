package tr.com.kron.lombokdemo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Employee {
    private String firstName;
    private String lastname;
    private final String email;
    @ToString.Exclude private final String password;

}

