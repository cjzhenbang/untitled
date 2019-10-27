package com;

public class User {
  static private int id =2019214010;
    String name ;
    static String home ="四川德阳";

    void study(){
        System.out.println("认真学习java");
    }
    void eat(){
        System.out.println("太爱吃了，上辈子应该是一个饭桶");
    }
    public static void play(){
        System.out.println(home);

    }
    public void User(int id, String name){
        this.id = id;
        this.name =name;
    }

    public int getId(){
        return this.id;
    }

    public static void main(String[] args) {
        User A = new User();
        User.play();
       A.name = "陈瑾";
        A.eat();
        A.study();
        System.out.println(A.name + A.id);

    }


}
