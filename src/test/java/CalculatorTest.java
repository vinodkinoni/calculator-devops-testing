package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();
    double res;

    @Test
    public void calculatesqrt(){
        res = calc.sqrt(-5);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.sqrt(16);
        assertEquals(4, res, DELTA);
    }

    @Test
    public void calculatefact(){
        res = calc.fact(-2);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.fact(6);
        assertEquals(720, res, DELTA);
    }

    @Test
    public void calculatenlog(){
        res = calc.nlog(-4);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.nlog(2);
        assertEquals(0.6931471805599453, res, DELTA);
    }

    @Test
    public void calculatelog10(){
        res = calc.log10(-3);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.log10(100);
        assertEquals(2, res, DELTA);
    }

    @Test
    public void calculatecustlog(){
        res = calc.custlog(-4, 3);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.custlog(4, 1);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.custlog(8, 2);
        assertEquals(3, res, DELTA);
    }

    @Test
    public void calculatepow(){
        res = calc.pow(0, 0);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.pow(2, 4);
        assertEquals(16, res, DELTA);
    }

    @Test
    public void calculatemod(){
        res = calc.mod(0, 0);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.mod(5, 3);
        assertEquals(2, res, DELTA);
    }

    @Test
    public void calculatepercent(){
        res = calc.percent(10, 50);
        assertEquals(5, res, DELTA);
    }

    @Test
    public void calculaterecipro(){
        res = calc.recipro(0);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.recipro(4);
        assertEquals(0.25, res, DELTA);
    }

    @Test
    public void calculatesin(){
        res = calc.sin(90);
        assertEquals(1, res, DELTA);
    }

    @Test
    public void calculatecos(){
        res = calc.cos(90);
        assertEquals(0, res, DELTA);
    }

    @Test
    public void calculatetan(){
        res = calc.tan(90);
        assertEquals(Double.NaN, res, DELTA);

        res = calc.tan(45);
        assertEquals(1, res, DELTA);
    }

    @Test
    public void calculatepermutation(){
        res = calc.permutation(5, 3);
        assertEquals(60, res, DELTA);
    }

    @Test
    public void calculatecombination(){
        res = calc.combination(5, 3);
        assertEquals(10, res, DELTA);
    }
}
