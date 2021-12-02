import java.util.Scanner;

public class Person {
    private String   name;


    public Person(String initialName)
    {
        this.name= initialName;
    }

    public Person()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a name");
        this.name=in.nextLine();
    }


    public void setName( String fullName) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the new name:");
        this.name=in.nextLine();
    }

    public String getName() {
        return (name);
    }

    public String toString() {
        return (name)

    }
}
