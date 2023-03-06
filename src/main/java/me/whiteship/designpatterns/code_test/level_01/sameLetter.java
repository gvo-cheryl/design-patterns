package me.whiteship.designpatterns.code_test.level_01;

import java.util.HashMap;

public class sameLetter {

    public static void main(String[] args) {
        solution("banana"); // -1, -1, -1, 2, 2, 2
    }

    public static void solution(String s) {
        String[] letters = s.split("");
        int length = letters.length;
        int[] result = new int[length];

        // my answer
        for (int i = 0; i < length; i++) {
            result[i] = -1;
            for (int j = 0; j < length; j++) {
                if (i > j && letters[i].equals(letters[j])) {
                    int now = -(j - i);
                    result[i] = now;
                    if (result[i] < now) {
                        result[i] = now;
                    }
                }
            }
        }

        // others solution
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i =0; i<length; i++){
            char ch = s.charAt(i);
            int test = map.getOrDefault(ch, i+1);
            System.out.println("char = " + ch + " test = " + test);
            result[i] = i - test;
            map.put(ch,i);
        }
        System.out.println("map = " + map);
        print(result);
    }

    private static void print(int[] result) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= result.length; i++) {
            if (i == 0) {
                stringBuilder.append("[").append(result[i]);
            } else if (i == result.length) {
                stringBuilder.append("]");
            } else
                stringBuilder.append(" ,").append(result[i]);

        }
        System.out.println("result = " + stringBuilder);
    }
}
