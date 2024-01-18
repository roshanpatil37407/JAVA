//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     String modelname;
     int modleage;
     public Main(String name ,int age){
         modelname=name;
         modleage=age;

     }
    public static void main(String[] args) {
       Main obj=new Main("ram",26);
       System.out.println(obj.modelname + "is" + obj.modleage);
    }
}