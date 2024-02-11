package seminars.third.hw;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainHW {
    
   @Test
    public void testEvenOddNumber() {
        NumberUtils numberUtils = new NumberUtils();

        // Проверка четных чисел
        assertTrue(numberUtils.evenOddNumber(2));
        assertTrue(numberUtils.evenOddNumber(4));

        // Проверка нечетных чисел
        assertFalse(numberUtils.evenOddNumber(3));
        assertFalse(numberUtils.evenOddNumber(11));
    }

    @Test
    public void testNumberInInterval() {
        NumberUtils numberUtils = new NumberUtils();

        // Проверка чисел внутри интервала
        assertTrue(numberUtils.numberInInterval(50));
        assertTrue(numberUtils.numberInInterval(75));

        // Проверка чисел за пределами интервала
        assertFalse(numberUtils.numberInInterval(20));
        assertFalse(numberUtils.numberInInterval(200));
    }

}
