package examples.caseclass;

/**
 * Created by alex on 11/20/17.
 */
public class PersonJava {
    private String firstName;
    private int age;
    private String maidenName;

    public PersonJava(String firstName, int age, String maidenName) {
        this.firstName = firstName;
        this.age = age;
        this.maidenName = maidenName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }

    public String getMaidenName() {
        return maidenName;
    }
}
