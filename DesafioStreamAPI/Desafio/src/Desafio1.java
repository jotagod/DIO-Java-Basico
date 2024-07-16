import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) throws Exception {

    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 99, 0, 7, 3, 3);

    numeros.stream().sorted((n1, n2) -> n1.compareTo(n2)).forEach(System.out :: println);

    }
}
