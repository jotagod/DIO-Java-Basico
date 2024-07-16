import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class desafio3 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, -4, 5, 6, 7, 8, -9, 10, -5, 4, 3);

        if(numeros.stream().anyMatch(n -> n < 0)) {
            System.out.println("Existem números negativos");
        } else System.out.println("Todos os números sao positivos");

    }
    
}
