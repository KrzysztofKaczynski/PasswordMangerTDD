package example.asserttest;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MatchersTest {

    @Test
    public void testEqualTo() {
        String result = "wynik";
        assertThat(result, equalTo("wynik"));
        assertThat(result, is("wynik"));
    }

    @Test
    public void testStrings() {
        String result = "wynik bardzo skoplikowanej metody";
        assertThat(result, containsString("bardzo"));
        assertThat(result, startsWith("wynik"));
        assertThat(result, endsWith("ody"));
    }

    @Test
    public void testStringsAllOf() {
        String result = "wynik bardzo skoplikowanej metody";
        assertThat(result, allOf(containsString("bardzo"), endsWith("ody"), startsWith("wynik")));

    }
    @Test
    public void testStringsAnyOf() {
        String result = "wynik bardzo skoplikowanej metody";
        assertThat(result, anyOf(containsString("bardzo"), endsWith("ady"), startsWith("wynik")));

    }
    @Test
    public void testStringsComposed() {
        String result = "wynik bardzo skoplikowanej metody";
        assertThat(result, allOf(containsString("bardzo"),
                anyOf(containsString("zzz"), endsWith("ody"), startsWith("aaa"))));

    }
    @Test
    public void testArrays() {
        List<String> result = Arrays.asList("element jeden", "element dwa", "element trzy");
        assertThat(result, everyItem(startsWith("element")));
        assertThat(result, hasItem("element dwa"));
        assertThat(result, hasItem(endsWith("dwa")));

    }

}
