import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTestFail {
    @BeforeEach
    void setUp() {

    }

    @Test
    void testNameFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("Ja", 12345678912L, "Full-Time", "Man", 22));
        assertEquals("Name must be a minimum of 3 and a maximum of 25 characters.", exMessage);
    }

    @Test
    void testIdFail() {
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> new Employee("James", 12345L, "Full-Time", "Man", 22));
        assertEquals("PPS ID must be an eleven digit number.", exMessage);
    }






}
