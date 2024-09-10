public class TicketRevenue {
    public static void main(String[] args) {
        System.out.println(ticketSaler(70, 1500)); // ➞ 75600
        System.out.println(ticketSaler(24, 950)); // ➞ 16416
        System.out.println(ticketSaler(53, 1250)); // ➞ 47700
    }

    public static int ticketSaler(int tickets, int price) {
        return tickets * price;
    }
}