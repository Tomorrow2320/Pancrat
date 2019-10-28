import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalyzerTest {

    @Test
    public void analyzer() {
    String expect = "Ты, братец, холерик";
    String actual = new Analyzer().analyze(new TTestResult(4,4));
    assertEquals(expect,actual);
    }

}