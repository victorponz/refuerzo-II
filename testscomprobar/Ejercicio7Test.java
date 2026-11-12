import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio7Test {

    @Test
    void canales() {
        assertAll(
            () ->  assertEquals(3, Ejercicio7.canales(2, 5)),
            () ->  assertEquals(2, Ejercicio7.canales(2, 99)),
            () ->  assertEquals(41, Ejercicio7.canales(5, 63))
        );
    }

}