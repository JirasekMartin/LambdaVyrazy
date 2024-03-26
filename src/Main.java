// Lambda výrazy: Použijte lambda výrazy k psaní stručného
// a funkčního kódu ak provádění operací, jako je filtrování, mapování a redukce.


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Seznam čísel
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        // Filtrování pouze sudých čísel
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Sudá čísla: " + evenNumbers);

        // Mapování na druhé mocniny
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println("Druhé mocniny: " + squares);

        // Redukce - součet všech čísel
        int sum = numbers.stream()
                .reduce(0, (acc, n) -> acc + n);
        System.out.println("Součet čísel: " + sum);
    }
}

// V tomto programu je použito lambda výrazů k definici funkcí předávaných metodám streamu.
//
//Lambda výraz (n -> n % 2 == 0) je použit pro filtrování sudých čísel.
//Lambda výraz (n -> n * n) je použit pro mapování na druhé mocniny.
//Lambda výraz (acc, n) -> acc + n je použit pro redukci seznamu čísel na součet.
//Pomocí těchto lambda výrazů je kód stručný a funkční, a umožňuje provádět
// operace filtrování, mapování a redukce s minimálním množstvím kódu.