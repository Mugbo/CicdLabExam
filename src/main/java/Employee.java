public class Employee {

    private String name;
    private long id;
    private String employmentType;
    private String gender;
    private int age;

    public Employee(String name, long id, String employmentType, String gender, int age){
    setName(name);
    setId(id);
    setEmploymentType(employmentType);
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
    public long getId(){
        return id;
    }
    public void setId(long id){
        if(String.valueOf(id).length() == 11){
            this.id = id;
        }
        else{
            throw new IllegalArgumentException("PPS ID must be an eleven digit number.");
        }
    }
    public String getEmploymentType(){
        return employmentType;
    }
    public void setEmploymentType(String employmentType) {
        if("Full-time".equalsIgnoreCase(employmentType) || "Part-time".equalsIgnoreCase(employmentType) || "Contract".equalsIgnoreCase(employmentType)){
            this.employmentType = employmentType;
        }
        else{
            throw new IllegalArgumentException("Employment type must be 'Full-time', 'Part-time' or 'Contract'");
        }
    }
    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        if("Man".equalsIgnoreCase(gender) || "Woman".equalsIgnoreCase(gender) || "Non-Binary".equalsIgnoreCase(gender)){
            this.gender = gender;
        }
        else{
            throw new IllegalArgumentException("Gender must be 'Man', 'Woman' or 'Non-Binary'");
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 16 && age < 66){
            this.age = age;
        }
        else {
            throw new IllegalArgumentException("Age must be greater than 16 and less than 66");

        }
    }



}
