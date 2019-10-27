package com;

public class StudyUser extends User {
    String major;
    void rest(){
        System.out.println("我想要睡觉");
    }
    void study(){
        System.out.println("高数真香");
    }
    public static void main(String [] args){
        StudyUser stu =new StudyUser();
        stu.eat();
        stu.rest();
        stu.study();
        stu.getId();

    }

}
