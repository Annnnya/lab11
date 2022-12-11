package task2;

public class GiftMail implements MailCode {
    private static String TEMPLATE = "Happy holidays %NAME";
    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
