package com.upgrade.utilities;

import java.util.Random;

public class RandomGen {

    private static Random rand = new Random();

    public static String randomInteger() {
        return String.format("%04d", rand.nextInt(9999));
    }

    public static String randomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] text = new char[5];
        for (int i = 0; i < 5; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        return new String(text);
    }
}
