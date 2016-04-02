import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StuckNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        scanner.nextLine();
        String[] numbersStringArr = scanner.nextLine().split(" ");
        List<String > numbersString = Arrays.asList(numbersStringArr).stream().collect(Collectors.toList());

        for (int i = 0; i<)



    }
}
