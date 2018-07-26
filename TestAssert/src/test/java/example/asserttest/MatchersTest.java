package example.asserttest;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class MatchersTest {

    @Test
    public void testEqualTo() {
        String result = "wynik";
        assertThat(result, equalTo("wynik"));
    }
}
