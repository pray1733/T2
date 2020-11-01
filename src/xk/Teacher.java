package xk;

public class Teacher {
    private int id;
    private String teacherName;
    private Course[] course;
    public Teacher() {
        super();
        course= new Course[3];
    }
    public Teacher(int id,String teacherName){
        this.id=id;
        this.teacherName=teacherName;
        course = new Course[3];
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


}

