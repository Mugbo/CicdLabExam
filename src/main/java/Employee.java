public class Employee {

    private String name;
    private long id;
    private String employmentType;
    private String gender;
    private int age;

    public Employee(String name, long id, String employmentType, String gender, int age){
    setName(name);
    setId(id);
    setEmployment(employmentType);
    setGender(gender);
    setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name.length() <= 25 && name.length() >=3 ){
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Name must be a minimum of 3 and a maximum of 25 characters.");
        }
    }




}
