public class Main{
    static int fun(int x, int y){
        return x+y;
    }
    static double fun(double x, double y){
        return  x+y;
    }
    public static void main(String[]args){
        int num1=fun(7,8);
        double num2=fun(5.6,7.2);
        System.out.println("int:"+num1);
        System.out.println("double:"+num2);
    }
}