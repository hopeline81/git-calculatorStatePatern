package Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void run() {
        Context context = new Context();
        assertEquals(0,context.run("C0+0="));
        assertEquals(2,context.run("C2"));
        assertEquals(25,context.run("C25"));
        assertEquals(253,context.run("C253"));
        assertEquals(5,context.run("C25/5"));
        assertEquals(10,context.run("C5*2="));
        assertEquals(5624,context.run("C75*75="));
        assertEquals(57,context.run("C45-7*3/2="));
        assertEquals(1,context.run("C9/5="));
        assertEquals(0,context.run("C2534*000="));
        assertEquals(50,context.run("C45+-*/*-+5="));
        assertEquals(40,context.run("C5*8="));
        assertEquals(45,context.run("C5+15=C30="));
    }
}