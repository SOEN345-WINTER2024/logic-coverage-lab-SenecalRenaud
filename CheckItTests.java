import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class CheckItTests
{

    @Test public void testPredicateCoverage()
    {
        //evaluates to true
        assertEquals(true, Main.checkIt (true, true, true));

        //evaluates to false
        assertEquals(false, Main.checkIt (false, false, true));

    }

    @Test public void testClauseCoverage()
    {
        //all clauses true
        assertEquals(true, Main.checkIt (true, true, true));

        //all clauses false
        assertEquals(false, Main.checkIt (false, false, false));

    }

    @Test public void testRACCCoverage()
    {

        assertEquals(true, Main.checkIt (true, true, true));
        assertEquals(true, Main.checkIt (true, true, false));
        assertEquals(true, Main.checkIt (true, false, false));
        assertEquals(true, Main.checkIt (true, false, true));
        assertEquals(true, Main.checkIt (false, true, true));
        assertEquals(false, Main.checkIt (false, true, false));
        assertEquals(false, Main.checkIt (false, false, true));
        assertEquals(false, Main.checkIt (false, false, false));

    }

    @Test public void testCACCCoverage()
    {

        assertEquals(true, Main.checkIt (true, true, true));
        assertEquals(true, Main.checkIt (true, true, false));
        assertEquals(true, Main.checkIt (true, false, false));
        assertEquals(true, Main.checkIt (true, false, true));
        assertEquals(true, Main.checkIt (false, true, true));
        assertEquals(false, Main.checkIt (false, true, false));
        assertEquals(false, Main.checkIt (false, false, true));
        assertEquals(false, Main.checkIt (false, false, false));

    }
}