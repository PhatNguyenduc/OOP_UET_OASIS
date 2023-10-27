public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai bao cac phuong thuc getter, setter cho Student
    public String getName(){return name;}
    public void setName(String name){
        this.name = name;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Constructor 1
     */
    Student() {
        // TODO:
       this.name = "Student";
       this.id="000";
       this.group="K62CB";
       this.email = "uet@vnu.edu.vn";
    }

    /**
     * Constructor 2
     * @param intial name
     * @param init
     * @param init value for object
     */
    Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.email = email;
        this.group = "K62CB";
    }

    /**
     * Constructor 3
     * @param copy
     */
    Student(Student s) {
        // TODO:
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getInfo() {
        // TODO:
        return (name + " - " + id + " - " + group + " - " + email); // xoa dong nay sau khi cai dat
    }
}