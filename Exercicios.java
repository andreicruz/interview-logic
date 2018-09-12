package sharehunter;
/**
 *
 * @author Andrei
 */
public class Exercicios {
    public static void main(String[] args) {
        // exercicio 3
        Busca busca = new Busca();
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
                            11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        System.out.println("Exercicio 3:"); 
        System.out.println("Posição: " + busca.buscaBinaria(20, vetor));
        System.out.println("Posição: " + busca.buscaBinariaRecursiva(vetor, 0, vetor.length - 1, 20) +  "\n");
        
    // exercicio 4
        System.out.println("Exercicio 4:"); 
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