package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Spy
    private Burger burger = new Burger();

    public static final String RECEIPT = "(==== Супер-бургер ====)" + System.lineSeparator() +
            "= filling Супер-начинка =" + System.lineSeparator() + "(==== Супер-бургер ====)" +
            System.lineSeparator() + System.lineSeparator() + "Price: 209,000000" + System.lineSeparator();

    @Test
    public void getPriceBurgerReturnPrice() {
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(99.5f);
        Mockito.when(ingredient.getPrice()).thenReturn(10f);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        float expectedResult = 209f;
        float actualResult = burger.getPrice();
        assertEquals( "Некорректный результат",expectedResult, actualResult, 0.0);
    }

    @Test
    public void getReceiptBurgerReturnReceipt() {
        Mockito.when(bun.getName()).thenReturn("Супер-бургер");
        Mockito.when(ingredient.getName()).thenReturn("Супер-начинка");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(burger.getPrice()).thenReturn(209f);
        String expectedResult = RECEIPT;
        String actualResult = burger.getReceipt();
        assertEquals("Некорректный результат", expectedResult, actualResult);
    }
}


