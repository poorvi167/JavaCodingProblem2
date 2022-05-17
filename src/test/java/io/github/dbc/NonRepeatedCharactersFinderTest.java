package io.github.dbc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NonRepeatedCharactersFinderTest {

    private NonRepeatedCharactersFinder finder;

    @BeforeEach
    void setUp() {
        finder = new NonRepeatedCharactersFinder();
    }

    @ParameterizedTest(name = "findFirstNonRepeatedCharacter(\"{arguments}\")")
    @DisplayName("should return Character.MIN_VALUE for strings with no non-repeated characters")
    @ValueSource(strings = {"aa", "aaa", "aaaa", "aaaaa", "aaaaaa"})
    void shouldReturnMinValueForStringsWithNoRepeatedCharacters(String input) {
        assertEquals(Character.MIN_VALUE, finder.findFirstNonRepeatedCharacter(input));
    }

    @ParameterizedTest(name = "findFirstNonRepeatedCharacter(\"{arguments}\")")
    @DisplayName("should return Character.MIN_VALUE for empty or blank strings")
    @EmptySource
    void shouldReturnMinValueForEmptyStrings(String input) {
        assertEquals(Character.MIN_VALUE, finder.findFirstNonRepeatedCharacter(input));
    }

    @ParameterizedTest(name = "findFirstNonRepeatedCharacter(\"{arguments}\")")
    @DisplayName("should throw an IllegalArgumentException for null strings")
    @NullSource
    void shouldThrowAnIllegalArgumentExceptionForNullStrings(String input) {
        assertThrows(IllegalArgumentException.class, () -> finder.findFirstNonRepeatedCharacter(input));
    }
}