package tr.com.kron.lombokdemo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Employee {
    private String firstName;
    private String lastname;
    @EqualsAndHashCode.Include private final String email;
    @ToString.Exclude private final String password;

}

