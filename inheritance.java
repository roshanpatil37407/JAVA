//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class car {
    public String brand = "ford";
    protected String modlename;

    public void honk() {
        System.out.println("RR, THAR");
    }
}
class vehicle extends car {
    private String modlename = "BMW";


    public static void main(String[] args) {
    car obj=new car();
    obj.honk();
    System.out.println(obj.brand +""+ obj.modlename);
    }
}








