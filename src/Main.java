public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(7);
        vector.add("1");
        vector.add("2");
        vector.add("3");
        vector.add("4");
        vector.add("5");

        System.out.println(vector.length());
        System.out.println(vector.toString());
        System.out.println(vector.find(3));
        System.out.println(vector.find("1"));
        System.out.println(vector.find("a"));
    }
}