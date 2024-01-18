import  java.util.HashMap;
public class Main {
    public static void main(String[]args) {
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        names.put("ram", 30);
        names.put("heena", 20);
        names.put("riya", 31);
        names.put("sham", 39);

        for (String i : names.keySet()) {
            System.out.println("key: " + i + " value: " + names.get(i));
        }
    }
}