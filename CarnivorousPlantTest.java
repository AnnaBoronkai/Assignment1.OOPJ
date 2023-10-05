package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarnivorousPlantTest {

    CarnivorousPlant m = new CarnivorousPlant(Guest.MEATLOAF, 0.7);

    @Test
    void amountOfLiquid() {
        double expectedAmountOfLiquid = 2.4;
        double actualAmountOfLiquid = m.amountOfLiquid();
        Assertions.assertEquals(expectedAmountOfLiquid, actualAmountOfLiquid);


    }
}