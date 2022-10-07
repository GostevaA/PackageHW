import ru.netology.sqr.Hwpackage.service.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int t = service.calcSQR(90, 200);
        System.out.println(t);

    }

}
