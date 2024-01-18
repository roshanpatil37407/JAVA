interface  animal{
    public  void animaslsound();
    public void sleep();
}
class cat implements animal{
    public  void animalsound(){
        System.out.println("cat syes : MAWW MAWW");
    }

   public void slepp(){
       {
           System.out.println("zzzz");
       }
   }

    @Override
    public void animaslsound() {

    }

    @Override
    public void sleep() {

    }
}
class Main{
    public static void main (String[]args) {
        cat obj=new cat();
        obj.animalsound();
        obj.sleep();
    }
}