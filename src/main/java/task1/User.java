package task1;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@ToString
@Setter@Getter
public class User{
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular
    public List<String> occupations;

}