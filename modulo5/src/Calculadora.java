public class Calculadora {

    private int adicionar(int a, int b) {
        return a + b;
    }

    private int subtrair(int a, int b) {
        return a - b;
    }

    private int multiplicar(int a, int b) {
        return a * b;
    }

    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

    // Testes unitários

    public static void main(String[] args) {
        CalculadoraTest test = new CalculadoraTest();
        test.testAdicionar();
        test.testSubtrair();
        test.testMultiplicar();
        test.testDividir();
    }
}

class CalculadoraTest {

    public void testAdicionar() {
        Calculadora calc = new Calculadora();
        assert calc.adicionar(3, 5) == 8;
        assert calc.adicionar(-3, 5) == 2;
        assert calc.adicionar(0, 0) == 0;
    }

    public void testSubtrair() {
        Calculadora calc = new Calculadora();
        assert calc.subtrair(8, 5) == 3;
        assert calc.subtrair(-3, 5) == -8;
        assert calc.subtrair(0, 0) == 0;
    }

    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assert calc.multiplicar(3, 5) == 15;
        assert calc.multiplicar(-3, 5) == -15;
        assert calc.multiplicar(0, 0) == 0;
    }

    public void testDividir() {
        Calculadora calc = new Calculadora();
        assert calc.dividir(10, 5) == 2;
        assert calc.dividir(15, 3) == 5;
        try {
            calc.dividir(10, 0);
            // Se a divisão por zero não lançar uma exceção, o teste falha
            assert false;
        } catch (IllegalArgumentException e) {
            // A exceção esperada é capturada aqui, indicando sucesso no teste
            assert true;
        }
    }
}

//Esses testes unitários cobrem os cenários esperados para cada método,
// incluindo situações especiais como divisão por zero.