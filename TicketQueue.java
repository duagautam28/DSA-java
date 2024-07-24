public class TicketQueue {

    public static int timeTaken(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;
        
        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;  // Person buys one ticket
                    time++;  // Increment the time by 1 second
                }
                if (tickets[k] == 0) {
                    return time;  // If the person at position k has bought all tickets, return the time
                }
            }
        }
        
        return time;
    }
    
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        int k = 0;
        System.out.println("Time taken for person at position " + k + " to finish buying tickets: " + timeTaken(tickets, k));  // Output: 6
    }
}
