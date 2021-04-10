package labs;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age; 
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLasName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String firsN){
        firsN = this.firstName;
    }
    public void setLastName(String lastN){
        lastN = this.lastName;
    }
    public void setAge(int age){
        age = this.age;
    }

    public void display(){
        System.out.println("Your name is:" +getFirstName() + getLasName());
        System.out.println("You're: "+ getAge() + " years old");
    }

}
