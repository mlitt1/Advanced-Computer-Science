import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class StudentTicket extends StandardTicket{

    public StudentTicket(Date eventDate, int ticketCount) {
        super(eventDate, ticketCount);
    }

    private static final double STUDENT_DISCOUNT = 0.50;

    public double getTotalPrice() {
        return ((super.getTax() + super.getBasePrice()) * super.getTicketCount()) * STUDENT_DISCOUNT;
    }

    @Override
    public void printTicketType() {
        System.out.println("Ticket Type: Student (Must Show ID)");
    }
    
}
