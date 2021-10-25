import junit.framework.Assert;
import org.junit.Test;

public class CalculadoraTest {


    //quais as ações?deveSomarCorretamenteQuandoOsValoresForemInteiros
    //deveDividirCorretamenteQuandoNumerosForemInteiros
    //deveMultiplicarCorretamenteQuandoNumerosForemInteiros
    //deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        int numero1 = 10;
        int numero2 = 2;
        int resultadoEsperado = 12;

        //Act
        int resultado = calculadora1.soma(numero1,numero2);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        int numero1 = 10;
        int numero2 = 2;
        int resultadoEsperado = 5;

        //Act
        int resultado = calculadora1.divisao(numero1,numero2);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        int numero1 = 10;
        int numero2 = 2;
        int resultadoEsperado = 20;

        //Act
        int resultado = calculadora1.multiplicacao(numero1,numero2);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        double numero1 = 10.5;
        double numero2 = 2.0;
        double resultadoEsperado = 5.25;

        //Act
        double resultado = calculadora1.divisaoPontoFlutuante(numero1,numero2);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

    @Test
    public void deveElevarAoQuadradoCorretamenteQuandoONumeroForInteiro(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        int numero1 = 10;
        int resultadoEsperado = 100;

        //Act
        int resultado = calculadora1.exponenciacao(numero1);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

    @Test
    public void deveTirarRaizQuadradaCorretamenteQuandoONumeroForInteiro(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        int numero1 = 100;
        int resultadoEsperado = 10;

        //Act
        int resultado = (int)calculadora1.raizQuadrada(numero1);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

    @Test
    public void deveRetornarASomaDosValoresDeXQuandoFormulaDeBhaskara(){

        //Arrange
        Calculadora calculadora1 = new Calculadora();
        double a = 1.0;
        double b = -2.0;
        double c = -1.25;
        double resultadoEsperado = 2.0;

        //Act
        double resultado = calculadora1.bhaskara(a,b,c);

        //Assert
        Assert.assertEquals(resultadoEsperado,resultado,0);
    }

}
