package labs;

public class PersonData {
    private Person[] persons;
    private int size;
    public PersonData(int size ){
        this.size = size;
        persons = new Person[size];
    }

    public void addPerson(Person addsom){
    
    persons[size] = addsom;
        size ++;
    }
    
}
