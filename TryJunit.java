import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

class TryJunit {
    @Test
    void addition() { assertEquals(3, 1+2); }

    @Test
    void m() { assertEquals(1,1);}
}