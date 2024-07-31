public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(7);
        vector.add("b");
        vector.add("c");
        vector.add("d");
        vector.add("e");
        vector.add("f");

        System.out.println(vector.length());
        System.out.println(vector);
        System.out.println(vector.find(3));
        System.out.println(vector.find("1"));
        System.out.println(vector.find("a"));
        vector.add(0,"a");
        System.out.println(vector);
    }
}