package task1;

import task1.Gender;
import task1.User;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().
                name("Anya").age(19).
                occupation("student").gender(Gender.FEMALE)
                .build();
        System.out.println(user);
    }
}