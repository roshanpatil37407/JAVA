 abstract class animal{
    public abstract void animaslsound();
    public void sleep(){
        System.out.println("zzzz");
    }
 }
  class cat extends animal{
    public  void animalsound(){
        System.out.println("cat syes : MAWW MAWW");
    }

      @Override
      public void animaslsound() {

      }
  }
 class Main{
    public static void main (String[]args) {
    cat obj=new cat();
    obj.animalsound();
    obj.sleep();
    }
}