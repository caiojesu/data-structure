public class Main {
    public static void main(String[] args) {
        Vector vector = new Vector(1);
        vector.add("b");
        vector.add("c");
        vector.add("d");
        vector.add("e");
        vector.add("f");



        System.out.println(vector);
        vector.remove(1);
        System.out.println(vector);

    }
}