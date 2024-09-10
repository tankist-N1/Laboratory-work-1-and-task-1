public class TriangleIdentifier {
    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5)); // ➞ equilateral
        System.out.println(triangleType(5, 4, 5)); // ➞ isosceles
        System.out.println(triangleType(3, 4, 5)); // ➞ different-sided
        System.out.println(triangleType(5, 1, 1)); // ➞ not a triangle
    }

    public static String triangleType(int x, int y, int z) {
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "not a triangle";
        } else if (x == y && y == z) {
            return "equilateral";
        } else if (x == y || x == z || y == z) {
            return "isosceles";
        } else {
            return "different-sided";
        }
    }
}