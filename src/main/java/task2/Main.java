package task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import task1.Gender;

public class Main {
    public static void main(String[] args) throws MailjetSocketTimeoutException, MailjetException {
        MailInfo mailInf = new MailInfo(new Client("Ya", Gender.FEMALE, 20),
                new GiftMail(),"anna.polova@ucu.edu.ua");
        MailSender.sendMail(mailInf);
    }
}
