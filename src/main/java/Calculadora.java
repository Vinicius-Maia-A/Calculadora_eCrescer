public class Calculadora {

    //qual é o problema? criar uma calculadora que
    //quais os atributos? numero1, numero2, resultado.
    //quais as ações?deveSomarCorretamenteQuandoOsValoresForemInteiros
    //deveDividirCorretamenteQuandoNumerosForemInteiros
    //deveMultiplicarCorretamenteQuandoNumerosForemInteiros
    //deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes


    int resultado;
    double resultadoPontoFlutuante;

    public int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public int divisao(int numero1, int numero2){
        return numero1/numero2;
    }

    public int multiplicacao(int numero1, int numero2){
        return numero1*numero2;
    }

    public double divisaoPontoFlutuante(double numero1, double numero2){
        return numero1/numero2;
    }


    //desafio 1

    public int exponenciacao(int numero){
        return numero*numero;
    }

    public int raizQuadrada(int numero){
        return (int) Math.sqrt(numero);
    }

    //desafio 2

    public double bhaskara(double a, double b, double c){

        double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        return x1+x2;

    }


}
