package me.whiteship.designpatterns._03_behavioral_patterns._23_visitor._03_java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

@RequiredArgsConstructor
@Slf4j



    public class LetMeIntroduce {

        public static void main(String[] args) {
            Me me = new Me("Heesun Choi", Set.of("Positive", "Concentration", "Self development"));
            me.selfIntroduce();
        }
    }





@Data
@AllArgsConstructor
class Me {

    private String name;
    private Set<String> strength;

    protected void selfIntroduce() {
        System.out.println("" +
                "Hello, my new team! \n" +
                "I'm " + name + ". \n" +
                "My major strengths are " + getStrength() + ". \n" +
                "Glad to meet you. \n" +
                "I can't wait to work with you :)");

    }

    protected String getStrength() {
        StringBuilder strengths = new StringBuilder();
        for (String s : strength) {
            strengths.append(s).append(", ");
        }
        return strengths.toString();
    }
}
