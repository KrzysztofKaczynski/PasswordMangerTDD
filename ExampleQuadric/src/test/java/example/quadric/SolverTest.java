package example.quadric;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolverTest {

    @Test
    public void test() {
        Solver solver = new Solver(1, -7, 12);
        double[] result = solver.solve();
        assertEquals(2,result.length);
        assertEquals(3,result[0],0.0000001);
        assertEquals(4,result[1],0.0000001);
    }

}



