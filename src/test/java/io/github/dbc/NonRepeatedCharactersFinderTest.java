package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NonRepeatedCharactersFinderTest {

    private NonRepeatedCharactersFinder finder;

    @BeforeEach
    void setUp() {
        finder = new NonRepeatedCharactersFinder();
    }

    @ParameterizedTest(name = "findFirstNonRepeatedCharacter(\"{arguments}\")")
    @DisplayName("should return Character.MIN_VALUE for strings with no non-repeated characters")
    @ValueSource(strings = {"aa", "aaa", "aaaa", "aaaaa", "aaaaaa"})
    void displayNameForTheTest(String input) {
        Assertions.assertEquals(Character.MIN_VALUE, finder.findFirstNonRepeatedCharacter(input));
    }
}