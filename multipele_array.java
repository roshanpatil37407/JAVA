import java.util.Arrays;

public class Main{
    public static void main(String[]args){
       int [][]num={{1,2,3},{5,7,8}};
       num[1][2]=9;
       System.out.println(num[1][2]);
       for(int i=0;i<num.length;i++){
           for(int j=0;j<num[i].length;j++){
               System.out.println(num[i][j]);
           }

       }

    }
}