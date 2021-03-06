import java.util.Vector;

public class Student extends Person{
    private String id;
    private String name;
    private Vector courses; // contains all courses the student is registered in


    public Student(String stdName, String stdId) {
        this.id=stdId;
        this.name=stdName;
    }


    public String getName() {
        return(name);
    }

    public String getId() {
        return(id);
    }




    public String toString() {
        // return a string representation of a student using the following format:
        // 100234546 John McDonald
        // Registered courses: ELEE 2110, ELEE 2790, SOFE 2710, SOFE 2800, SOFE 2850
        String temp = "";
        temp+=id+" "+name+"\nRegistered courses: ";
        for(int x =0;x<courses.size();x++)
        {
            temp+=courses.get(x)+" ";
        }
        return (temp);
    }
}
