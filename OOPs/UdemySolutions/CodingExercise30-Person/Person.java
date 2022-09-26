public class Person {
    // write your code here
    private String firstName;
    private String lastName;
    private int age;
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    
    
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
    public boolean isTeen(){
        if((this.age <= 12) || (this.age >= 20)){
            return false;
        }else{
            return true;
        }
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        if(lastName.isEmpty()){
            return firstName;
        }
        if(firstName.isEmpty()) {
            return lastName;
        }
        return firstName +" "+ lastName;
    }
}