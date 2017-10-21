class Stu {
    private int student;
    private String name;
    private String school;
    private String room;
    public void setStudent(int s){
        student = s;
    }
    public void setName(String n){
        name = n;
    }
    public void setSchool(String sc){
        school = sc;
    }
    public void setRoom(String r){
        room = r;
    }
    public int getStudent(){
        return student;
    }
    public String getName() {
        return name;
    }
    public String getSchool() {
        return school;
    }
    public String getRoom() {
        return room;
    }
public void getInfo() {
    System.out.println("学生学号：" + student + "\n" +
            "学生姓名:" + name + "\n" +
            "学生学院:" + school + "\n" +
            "学生宿舍" + room);
}
}
public class Emp{
    public static void main(String args[]){
        Stu wyx = new Stu();
        wyx.setStudent(2017211615);
        wyx.setName("王寅霄");
        wyx.setRoom("东16 724");
        wyx.setSchool("计算机系");
        wyx.getInfo();

    }
}
