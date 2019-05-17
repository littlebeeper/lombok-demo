package tr.com.kron.lombokdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private static Employee employee;

    @BeforeAll
    static void setup() {
        employee = new Employee("Cuneyt", "Ozen", "cuneyt.ozen@kron.com.tr", "myS3cr3t");
    }

    @Test
    @DisplayName("Should get correct property values")
    void shouldGetCorrectPropertyValues() {
        assertEquals("Cuneyt", employee.getFirstName());
        assertEquals("Ozen", employee.getLastname());
        assertEquals("cuneyt.ozen@kron.com.tr", employee.getEmail());
    }

    @Test
    @DisplayName("should be equal to same object")
    void shouldBeEqualToSameObject() {
        var sameEmployee = new Employee("Cuneyt", "Ozen", "cuneyt.ozen@kron.com.tr", "myS3cr3t");
        assertEquals(employee.hashCode(), sameEmployee.hashCode());
        assertEquals(employee, sameEmployee);
    }

    @Test
    @DisplayName("Should not included password field on ToString")
    void shouldShowOutputOfToStringMethod() {

        assertTrue(employee.toString().contains("password"));
        System.out.printf("%n ToString Output: %s %n", employee);
    }

    @Test
    @DisplayName("Should clone immutable object with new value of property")
    void shouldCloneImmutableObjectWithNewValueOfProperty() {
        var encrypted = String.valueOf(employee.getPassword().hashCode());
        final var beforeSaving = employee.withPassword(encrypted);

        assertEquals("-867059140", beforeSaving.getPassword());

    }

    @Test
    @DisplayName("Should fail for null password")
    void shouldFailForNullPassword() {
        assertThrows(
                NullPointerException.class,
                () ->
                        new Employee("Cuneyt", "Ozen", "cuneyt.ozen@kron.com.tr", null)

        );
    }
}