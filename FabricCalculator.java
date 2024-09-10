public class FabricCalculator {
    public static void main(String[] args) {
        System.out.println(howManyItems(22, 1.4, 2)); // ➞ 3
        System.out.println(howManyItems(45, 1.8, 1.9)); // ➞ 6
        System.out.println(howManyItems(100, 2, 2)); // ➞ 12
    }

    public static int howManyItems(double fabricLength, double width, double height) {
        double areaPerItem = width * height;
        return (int) (fabricLength / areaPerItem);
    }
}