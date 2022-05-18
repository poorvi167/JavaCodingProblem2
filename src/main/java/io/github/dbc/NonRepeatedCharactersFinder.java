package io.github.dbc;

import java.util.HashMap;

public class NonRepeatedCharactersFinder {
    private static final int EXTENDED_ASCII_CODES = 256;

    /**
     * Finds the non-repeated character in a string.
     *
     * @param string String to find non-repeated characters in.
     * @return the first non-repeated character in the string.
     */
    public char findFirstNonRepeatedCharacter(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        char firstNonRepeatedCharacter = Character.MIN_VALUE;
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : string.toCharArray()) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }
        for (Character character : string.toCharArray()) {
            if (map.get(character) == 1) {
                firstNonRepeatedCharacter = character;
                break;
            }
        }
        return firstNonRepeatedCharacter;
    }
}
