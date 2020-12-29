import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Plant> plants = new HashMap<>();


        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("<->");
            Plant p = new Plant(info[0], Integer.parseInt(info[1]));
            plants.put(p.getName(), p);

        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] commands = input.split(": ");
            String command = commands[0];

            switch (command) {
                case "Rate":
                    String[] rateParameters = commands[1].split(" - ");
                    String ratePlant = rateParameters[0];
                    int rating = Integer.parseInt(rateParameters[1]);

                    Plant plantRating = plants.get(ratePlant);
                    if (plantRating != null) {
                        plantRating.addRating(rating);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "Update":
                    String[] updateParameters = commands[1].split(" - ");
                    String updatePlant = updateParameters[0];
                    int rarity = Integer.parseInt(updateParameters[1]);

                    Plant plantUpdated = plants.get(updatePlant);
                    if (updatePlant != null) {
                        plantUpdated.setRarity(rarity);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "Reset":
                    String resetPlant = commands[1];

                    Plant plantReset = plants.get(resetPlant);
                    if (plantReset != null) {
                        plantReset.resetRating();
                    } else {
                        System.out.println("error");
                    }

                    break;
                default:
                    System.out.println("error");
            }


            input = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");

        plants.values().stream().sorted((a, b) -> {
            if (a.getRarity() != b.getRarity()) {
                return Integer.compare(b.getRarity(), a.getRarity());
            } else {
                return Double.compare(b.getAverageRating(), a.getAverageRating());
            }
        })
                .map(p -> "- " + p.getName() + "; Rarity: " + p.getRarity() + "; Rating: " + String.format("%.2f", p.getAverageRating()))
                .forEach(s -> System.out.println(s));


    }
    static class Plant {
        String name;
        int rarity;
        List<Double> ratings;



        public Plant (String name, int rarity) {
         this.name = name;
         this.rarity = rarity;
         this.ratings = new ArrayList<>();

        }
        public String getName() {
            return name;
        }
        public int getRarity() {
            return rarity;
        }
        public void addRating (double rating) {
            this.ratings.add(rating);
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public void resetRating() {
            this.ratings.clear();
        }

        public double getAverageRating() {
            if (this.ratings.isEmpty()) {
                return 0;
            }
            double averageRating = 0;
            for (Double rating : this.ratings) {
                averageRating += rating;
            }
            averageRating = averageRating / this.ratings.size();
            return averageRating;
        }
    }
}
