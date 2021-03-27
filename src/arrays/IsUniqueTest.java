package arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void isUniqueWithHelperArray() {
        String empty = "";
        String tooLong = "abcdefghijklmnopqrstuvwxyzaa";
        String duplicates = "aabcdef";
        String unique = "abcdefg";

        assertTrue(IsUnique.isUniqueWithHelperArray(empty.toCharArray()));
        assertFalse(IsUnique.isUniqueWithHelperArray(tooLong.toCharArray()));
        assertFalse(IsUnique.isUniqueWithHelperArray(duplicates.toCharArray()));
        assertTrue(IsUnique.isUniqueWithHelperArray(unique.toCharArray()));
    }


    @Test
    public void isUniqueSorting() {
        String empty = "";
        String tooLong = "abcdefghijklmnopqrstuvwxyzaa";
        String duplicates = "aabcdef";
        String unique = "abcdefg";

        assertTrue(IsUnique.isUniqueSorting(empty.toCharArray()));
        assertFalse(IsUnique.isUniqueSorting(tooLong.toCharArray()));
        assertFalse(IsUnique.isUniqueSorting(duplicates.toCharArray()));
        assertTrue(IsUnique.isUniqueSorting(unique.toCharArray()));
    }
}
