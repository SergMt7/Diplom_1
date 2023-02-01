package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTypeTest {

    @Test
    public void sauceIngredientTypeTest() {
        assertEquals("Некорректный результат",IngredientType.SAUCE, IngredientType.valueOf("SAUCE"));
    }

    @Test
    public void filingIngredientTypeTest() {
        assertEquals("Некорректный результат",IngredientType.FILLING, IngredientType.valueOf("FILLING"));
    }
}

