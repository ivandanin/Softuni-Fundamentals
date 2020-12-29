import java.text.DecimalFormat;
import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] realNumbers = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> counts = new TreeMap<>();

        for (double realNumber : realNumbers) {
            if (!counts.containsKey(realNumber)){
                counts.put(realNumber, 0);
            }
            counts.put(realNumber, counts.get(realNumber) + 1);
        }
for (Map.Entry<Double, Integer> doubleIntegerEntry : counts.entrySet()) {
    DecimalFormat df = new DecimalFormat("#.#######");
    System.out.printf(("%s -> %d%n"), df.format(doubleIntegerEntry.getKey()), doubleIntegerEntry.getValue());
        }


    }
}
