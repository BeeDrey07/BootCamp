package Chapter5;

public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        tickets = addTickets(tickets);
        guests = addGuests(guests);
        System.out.println(tickets + guests);
    }

    public static int addTickets(int tickets) {
        return ++tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}
