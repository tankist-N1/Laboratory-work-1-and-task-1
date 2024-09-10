public class ClassroomArrangement {
    public static void main(String[] args) {
        System.out.println(tables(5, 2)); // ➞ 1
        System.out.println(tables(31, 20)); // ➞ 0
        System.out.println(tables(123, 58)); // ➞ 4
    }

    public static int tables(int students, int tables) {
        int neededTables = (int) Math.ceil(students / 2.0);
        return Math.max(0, neededTables - tables);
    }
}