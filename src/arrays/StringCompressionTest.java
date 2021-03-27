package arrays;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompressionTest {

    @Test
    public void compress() {
        String empty = "";
        String singleChar = "a";
        String doubleChar = "aa";
        String multiChar = "aadddvvveecfeee";
        String multiCharVariation = "aadddvvveecfeees";

        assertThat(StringCompression.compress(empty), is(""));
        assertThat(StringCompression.compress(singleChar), is("a"));
        assertThat(StringCompression.compress(doubleChar), is("a2"));
        assertThat(StringCompression.compress(multiChar), is("a2d3v3e2c1f1e3"));
        assertThat(StringCompression.compress(multiCharVariation), is("a2d3v3e2c1f1e3s1"));
    }
}
