package me.whiteship.designpatterns.code_test.level_01;

import java.util.ArrayList;
import java.util.List;

public class SeparateLetter {

    public static void main(String[] args) {
        solution("abracadabra"); // ab - ra - ca - da - br - a
    }

    public static void solution(String s) {
        String[] letters = s.split("");
        int count = 0;
        String rest = "";
        List<String> result = new ArrayList<>();
        for (int i =0; i<letters.length; i++){

            for(int j=i+1; j<letters.length; j++){

            }
        }
    }

}
