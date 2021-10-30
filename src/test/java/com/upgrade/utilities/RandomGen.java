package com.upgrade.utilities;

import java.util.Random;

public class RandomGen {

    private static Random rand = new Random();

    /**
     * Generates random integer of 4-digit length < 9999
     * @return
     */
    public static String randomInteger() {
        return String.format("%04d", rand.nextInt(9999));
    }

    /**
     * Generates random alphabet string of 5 character length
     * @return
     */
    public static String randomString() {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        char[] text = new char[5];
        for (int i = 0; i < 5; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        return new String(text);
    }
}
