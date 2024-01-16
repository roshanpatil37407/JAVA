import java.util.Arrays;

public class Main{
    public static void main(String[]args){
        String[]cars={"RR","THAR","BMW","FORD"};
       cars[0]="VOLVO";
       System.out.println(cars[3]);
        System.out.println(cars.length);
        System.out.println(Arrays.stream(cars).count());
    }
}