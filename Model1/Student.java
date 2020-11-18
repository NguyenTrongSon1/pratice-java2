package Model1;

public class Student {
    private String StudentID;
    private String Name;
    private String Address;
    private String Phone;

    public Student(String studentID,String Name,String Address,String Phone){
        this.StudentID = studentID;
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
    }
    public Student(){
        StudentID = "";
        Name = "";
        Address ="";
        Phone="";
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID='" + StudentID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                '}';
    }
}
