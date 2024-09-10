public class WarehouseInventory {
    public static void main(String[] args) {
        System.out.println(containers(3, 4, 2)); // ➞ 460
        System.out.println(containers(5, 0, 2)); // ➞ 300
        System.out.println(containers(4, 1, 4)); // ➞ 530
    }

    public static int containers(int boxes, int bags, int barrels) {
        return boxes * 20 + bags * 50 + barrels * 100;
    }
}