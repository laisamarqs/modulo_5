/**
 * Classe que representa uma calculadora simples com métodos para realizar operações básicas.
 */
public class Calculator {

    /**
     * Método para adicionar dois números inteiros.
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return A soma dos dois números.
     */
    private int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Método para subtrair um número inteiro de outro.
     * @param a O número inteiro a ser subtraído.
     * @param b O número inteiro a subtrair.
     * @return A diferença entre os dois números.
     */
    private int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método para multiplicar dois números inteiros.
     * @param a O primeiro número inteiro.
     * @param b O segundo número inteiro.
     * @return O produto dos dois números.
     */
    private int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para dividir um número inteiro por outro.
     * @param a O dividendo.
     * @param b O divisor.
     * @return O resultado da divisão.
     * @throws IllegalArgumentException Se o divisor for zero.
     */
    private int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }
}

// Resposta à pergunta:
//
//A compreensão do código sem a documentação dependeria da familiaridade do leitor com Java e com o problema em questão.
//No entanto, a documentação torna o código mais claro e explícito sobre o que cada método faz, quais parâmetros eles recebem e o que retornam.
//Isso é particularmente útil para outros desenvolvedores que podem precisar usar essa classe em seus projetos, além de ser uma boa prática de programação.
//
//Mesmo sem a documentação, o código em si é relativamente simples e autoexplicativo, principalmente para desenvolvedores com experiência em Java.
//Os nomes dos métodos e parâmetros são descritivos o suficiente para dar uma boa ideia de suas funcionalidades.
//A documentação torna a compreensão mais rápida e fácil, especialmente para aqueles que não estão familiarizados com o código ou para revisões futuras.
//Portanto, enquanto o código pode ser compreendido sem a documentação, esta última facilita significativamente a compreensão e a manutenção do código.
