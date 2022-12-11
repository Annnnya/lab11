package task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MailInfo {
    private Client client;
    private MailCode mailCode;
    private String gmail;
    public String generate() {
        return mailCode.generate(client);
    }
}