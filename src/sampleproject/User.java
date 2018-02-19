package sampleproject;

/**
 *
 * @author dubs
 */
public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public User(int Id, String FirstName, String LastName, int Age)
    {
        this.id = Id;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
}

