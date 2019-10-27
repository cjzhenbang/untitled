

class Computer{
    String brand;
}



public class Sxtsu {
    int id;
    String name;
    int age;
    Computer comp;
    void study(){
        System.out.println("我在认真学习，使用电脑" );
    }
    void play(){

        System.out.println("我在玩游戏");
    }
    public static void main(String[] args){
        Sxtsu stu = new Sxtsu();
        stu.play();
        stu.study();
        Computer comp = new Computer();
        comp.brand ="惠普";
        System.out.println(stu.id);
        System.out.println(comp.brand);

    }

}
