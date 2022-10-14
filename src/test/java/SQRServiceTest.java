import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.Hwpackage.service.SQRService;

public class SQRServiceTest {
    @Test
    public void shouldCalc() {
        SQRService service = new SQRService();
        int expected = 8;
        int actual = service.calcSQR(200, 500);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcIfMinBorder() {
        SQRService service = new SQRService();
        int expected = 23;
        int actual = service.calcSQR(0, 500);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldCalcIfMinOtherBorder() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calcSQR(200, 0);
        Assertions.assertEquals(expected, actual);
    }


}
