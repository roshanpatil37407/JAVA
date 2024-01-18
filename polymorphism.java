//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
 class animal {
     public void animalsound() {
         System.out.println("the animal make sound");
     }
 }
 class cat extends animal{
     public void animalsound() {
         System.out.println("maww maww");
     }
 }
 class dog extends animal{
     public void animalsound() {
         System.out.println("boww boww");
     }
 }
 class Main{
     public static void main(String[] args) {
       animal obj=new animal();
       cat obj1=new cat();
       dog obj2=new dog();

       obj.animalsound();
       obj1.animalsound();
       obj2.animalsound();

     }

 }




