
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTestSuccess {

     @BeforeEach
     void setUp(){

     }
     Employee myEmployee = new Employee("James", 12345678912L, "Full-Time", "Man", 22 );

@Test
void testName(){
     assertEquals("James", myEmployee.getName());

}
@Test
     void testId(){

     assertEquals(12345678912L , myEmployee.getId());
}
@Test
void testEmploymentType(){
     assertEquals("Full-time", myEmployee.getEmploymentType());
}
@Test
     void testGender(){
     assertEquals("Man", myEmployee.getGender());
}
@Test
     void testAge(){
     assertEquals(22, myEmployee.getAge());
}




}
