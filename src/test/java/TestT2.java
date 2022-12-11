import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task1.Gender;
import task2.Client;
import task2.GiftMail;
import task2.MailInfo;

public class TestT2 {
    @Test
    public void testT2() {
        MailInfo mailInf = new MailInfo(new Client("Ya", Gender.FEMALE, 20),
                new GiftMail(),"anna.polova@ucu.edu.ua");
        Assertions.assertEquals("Happy holidays Ya", mailInf.generate());
    }
}
