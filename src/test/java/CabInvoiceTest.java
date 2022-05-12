import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
    // UC-1 test method to check the fare returned through the method
    @Test
    public void givenDistanceAndTime_ShouldReturnFare() {
        double distance = 2.0;
        int time = 5;
        double result = invoiceGenerator.calculateFare(distance, time);
        Assert.assertEquals(25, result,0);
    }
}

