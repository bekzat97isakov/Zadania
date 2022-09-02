public abstract class People {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String sity;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public People(long id, String firstName, String lastName, int age, String email, String sity){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.sity = sity;
        if (age > 0){
            this.age = age;
        }else{

        }


    }

    public abstract void work();
    public abstract void ToRelax();
    public abstract void comunications();
    public abstract void timetable();
}
