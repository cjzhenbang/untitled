public class Studyname {
    public static void main(String[] args){
        System.out.println(factorial(10));
    }
    static long factorial(int n){
        if(n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }

    }
}
