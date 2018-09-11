package sharehunter;
/**
 *
 * @author Andrei
 */

//
//## Exercício 4
//Elabore um programa que recebe um número inteiro `N` maior que zero e imprima na tela um 
// triângulo conforme o padrão abaixo:
//Para uma entrada N = 4.
//```	
//1
//2 3
//4 5 6
//7 8 9 10
//```

public class Exercicios {
    public static void main(String[] args) {
        // exercicio 4
        imprimeTriangulo(10);
    }

    private static void imprimeTriangulo(int numero) {
        int k = 1;
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++, k++) {
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    } 
}