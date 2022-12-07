
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
     myEmployee.setId(12345678912L);
     assertEquals(12345678912L , myEmployee.getId());
}
@Test
void testEmploymentType(){
     myEmployee.setEmploymentType("Full-time");
     assertEquals("Full-time", myEmployee.getEmploymentType());
}
@Test
     void testGender(){
     myEmployee.setGender("Man");
     assertEquals("Man", myEmployee.getGender());
}
@Test
     void testAge(){
     myEmployee.setAge(22);
     assertEquals(22, myEmployee.getAge());
}




}
