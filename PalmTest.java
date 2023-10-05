package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm laura = new Palm(Guest.LAURA, 5);
    @Test
    void amountOfLiquid() {
        double expectedAmountOfLiquid = 2.5;
        double actualAmountOfLiquid = laura.amountOfLiquid();
        Assertions.assertEquals(expectedAmountOfLiquid, actualAmountOfLiquid);
    }

}