public class OverLoadingClass {
    static int OverClass(int x, int y) {
        return x + y;
    }
    static double OverClass(double x, double y) {
    return x + y;
    }
    public static void main(String[] args) {
        int Number1 = OverClass(4,5);
        double Number2 = OverClass(6.9,8.8);
        System.out.println("int: " + Number1);
        System.out.println("double: " + Number2);
    }
}
