package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BunTest {

    @Test
    public void getNameBunReturnName() {
        Bun bun = new Bun("Бургер", 99.5f);
        String expectedResult = "Бургер";
        String actualResult = bun.getName();
        Assert.assertEquals("Некорректный результат", expectedResult, actualResult);
    }

    @Test
    public void getPriceBunReturnPrice() {
        Bun bun = new Bun("Бургер", 99.5f);
        float expectedResult = 99.5f;
        float actualResult = bun.getPrice();
        Assert.assertEquals("Некорректный результат",expectedResult, actualResult, 0.0f);
    }
}
