package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    IngredientType type;

    @Test
    public void getPriceIngredientReturnPrice() {
        Ingredient ingredient = new Ingredient(null, "ничего", 10);
        float expectedResult = 10;
        float actualResult = ingredient.getPrice();
        Assert.assertEquals("Некорректный результат", expectedResult, actualResult, 0.0f);
    }

    @Test
    public void getNameIngredientReturnName() {
        Ingredient ingredient = new Ingredient(null, "Сыр", 0);
        String expectedResult = "Сыр";
        String actualResult = ingredient.getName();
        Assert.assertEquals("Некорректный результат", expectedResult, actualResult);
    }

    @Test
    public void getTypeIngredientReturnType() {
        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "ничего", 0);
        Assert.assertEquals("Некорректный результат", IngredientType.FILLING, ingredient.getType());
    }
}

