import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class AnsBaseTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void add() throws IllegalArgumentException{
        AnsBase ans = new AnsBase();
        assertThrows(IllegalArgumentException.class, () -> ans.add(""));
    }
}