import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTests {

    @Test
    public void testSuma() {
        int num1 = 5;
        int num2 = 3;

        int resultado = Integer.suma(num1, num2);

        Assert.assertEquals(resultado, 8, "La suma no es correcta.");
    }

    @Test
    public void testResta() {
        int num1 = 10;
        int num2 = 4;

        int resultado = Integer.resta(num1, num2);

        Assert.assertEquals(resultado, 6, "La resta no es correcta.");
    }

    @Test
    public void testMultiplicacion() {
        int num1 = 6;
        int num2 = 7;

        int resultado = Integer.multiplicacion(num1, num2);

        Assert.assertEquals(resultado, 42, "La multiplicación no es correcta.");
    }

    @Test
    public void testDivision() {
        int num1 = 15;
        int num2 = 3;

        int resultado = Integer.division(num1, num2);

        Assert.assertEquals(resultado, 5, "La división no es correcta.");
    }
}
