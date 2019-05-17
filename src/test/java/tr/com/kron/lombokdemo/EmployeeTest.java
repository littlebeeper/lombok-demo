package tr.com.kron.lombokdemo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private static Employee employee;

    @BeforeAll
    static void setup() {
        employee = new Employee("Cuneyt", "Ozen", "cuneyt.ozen@kron.com.tr");
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
        var sameEmployee = new Employee("Cuneyt", "Ozen", "cuneyt.ozen@kron.com.tr");
        assertEquals(employee.hashCode(), sameEmployee.hashCode());
        assertTrue(employee.equals(sameEmployee));
    }

}