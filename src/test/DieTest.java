/* ------------------------------------------------------
GEN- LAB 3
File : DieTest
Authors : Carpita Edoardo, Dutu Launay Marion, Moreira Erwan
Date : 01-05-2019

Brief : This class implement the tests on the Die class.

---------------------------------------------------------*/

import main.Die;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DieTest {

    @Test
    public void aNewDieShouldBeCreated() {
        Die die = new Die();
        assertNotNull(die);
    }

    @Test
    public void rollValueMustBeBetweenOneAndSix() {
        Die die = new Die();
        int counter = 50;
        while (counter >= 0) {
            die.roll();
            assertTrue(1 <= die.getFaceValue() && die.getFaceValue() <= 6);
            counter--;
        }

    }
}
