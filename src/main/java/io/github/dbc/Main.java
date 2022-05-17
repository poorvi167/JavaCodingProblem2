package io.github.dbc;

public class Main {
    public static void main(String[] args) {
        NonRepeatedCharactersFinder finder = new NonRepeatedCharactersFinder();
        char firstNonRepeatedCharacter = finder.findFirstNonRepeatedCharacter("aabbcc");
        System.out.println(firstNonRepeatedCharacter);
    }
}