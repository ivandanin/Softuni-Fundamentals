import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AngryPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> priceRating = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int startingPoint = Integer.parseInt(scanner.nextLine());
        String typeOfItems = scanner.nextLine();
        String typeOfPriceRating = scanner.nextLine();


        List<Integer> leftSum = new ArrayList<>();
        List<Integer> rightSum = new ArrayList<>();

        if (typeOfItems.equals("cheap")) {
            for (int i = startingPoint; i < priceRating.size(); i++) {
                if (priceRating.get(i) < startingPoint){
                    rightSum.add(i);
                    priceRating.remove(i);
                    i--;
                }
                for (int j = priceRating.size(); j >= startingPoint ; j--) {
                    if (priceRating.get(i) < startingPoint) {
                        leftSum.add(i);
                        priceRating.remove(i);
                    }

                }
            }

        } else if (typeOfItems.equals("expensive")) {



        }


        if (typeOfPriceRating.equals("positive")) {



        } else if (typeOfPriceRating.equals("negative")) {



        } else if (typeOfPriceRating.equals("all")){



        }




        }
    }
