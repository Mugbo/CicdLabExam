
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTestSuccess {

     @BeforeEach
     void setUp(){

     }
     Employee myEmployee = new Employee("James", 12345678912L, "Full-Time", "Man", 22 );

@Test
void testName(){
     myEmployee.setName("James");
     assertEquals("James", myEmployee.getName());

}
@Test
     void testId(){
     myEmployee.setId(12345678912L);
     assertEquals(12345678912L , myEmployee.getId());
}




}
