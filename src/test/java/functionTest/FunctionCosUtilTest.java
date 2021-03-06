package functionTest;

import function.FunctionCosUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Double.NaN;

public class FunctionCosUtilTest extends Assert {
    FunctionCosUtil functionCosUtil = new FunctionCosUtil();
    private final HashMap<Double, Double> arrayTestValues = new HashMap<>();
    private static final double DELTA = 0.01;

    @Before
    public void setUp() {
        // ключ - x, значение - введенное значение - y

        //проверка нулевого значения
        arrayTestValues.put( 0d, 1d);

        //проверка правой стороны
        arrayTestValues.put(Math.PI / 6, Math.sqrt(3) / 2);
        arrayTestValues.put(Math.PI / 4, Math.sqrt(2) / 2);
        arrayTestValues.put(Math.PI / 3, 0.5);
        arrayTestValues.put(Math.PI / 2, 0d);
        arrayTestValues.put(2*Math.PI / 3, -0.5);
        arrayTestValues.put(3* Math.PI / 4, -Math.sqrt(2) / 2);
        arrayTestValues.put(5*Math.PI / 6, -Math.sqrt(3) / 2);

        //проверка левой стороны (на четность)
        arrayTestValues.put(-Math.PI / 6, Math.sqrt(3) / 2);
        arrayTestValues.put(-Math.PI / 4, Math.sqrt(2) / 2);
        arrayTestValues.put(-Math.PI / 3, 0.5);
        arrayTestValues.put(-Math.PI / 2, 0d);
        arrayTestValues.put(-2*Math.PI / 3, -0.5);
        arrayTestValues.put(-3* Math.PI / 4, -Math.sqrt(2) / 2);
        arrayTestValues.put(-5*Math.PI / 6, -Math.sqrt(3) / 2);

        //проверка граничных значений
        arrayTestValues.put(-Math.PI, -1d);
        arrayTestValues.put(Math.PI, -1d);

        //тестирование NaN, Infinity
        arrayTestValues.put(NaN, NaN);
        arrayTestValues.put(Double.POSITIVE_INFINITY, NaN);
        arrayTestValues.put(Double.NEGATIVE_INFINITY, NaN);

        //тестовые значения вне границы покрытия
        arrayTestValues.put(7*Math.PI / 6, NaN);
        arrayTestValues.put(-7*Math.PI / 6, NaN);

    }

    @After
    public void tearDown() {
        arrayTestValues.clear();
    }

    @Test
    public void testCos() {

        double expected, actual;
        for (Map.Entry<Double, Double> entry : arrayTestValues.entrySet()) {
            expected = entry.getValue();

            actual = functionCosUtil.cos(entry.getKey());
            System.out.println("x = " + entry.getKey() + " actual = " + actual
                    + " expected = " + expected);
            assertEquals(expected, actual, DELTA);
        }
    }
}

