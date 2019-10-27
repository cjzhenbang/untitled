import java.net.StandardSocketOptions;

public class FiveClass {
    int id;
    String name;

    public void sportsmeeting(){
        System.out.println("五班最棒");
    }

    public static void main (String [] args){
        FiveClass student = new FiveClass();
        student.id = 13001905;
        student.name = "大类五班";
        System.out.println(student.id);
        System.out.println(student.name);
        student.sportsmeeting();

    }

}
