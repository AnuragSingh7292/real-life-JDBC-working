package MyStudent;

// this class is for student entities

public class Student {
    private final int sid;
    private final String name;
    private final String email;
    private final String phone;

//    here two option to set the value 1. using construct and 2. setter method

    public Student(int sid, String name, String email, String phone) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public int getSid() {return sid;}

    public String getName() {return name;}

    public String getEmail() {return email;}

    public String getPhone() {return phone;}

    @Override
    public String toString() {
        return "Student[id = " + sid + ", name = " + name + ", phone = " + phone + "]";
    }

}
