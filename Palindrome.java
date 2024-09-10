public class Palindrome {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();

        boolean isPalindrome = true;
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Введенная строка является палиндромом.");
        } else {
            System.out.println("Введенная строка не является палиндромом.");
        }

        scanner.close();
    }
}
