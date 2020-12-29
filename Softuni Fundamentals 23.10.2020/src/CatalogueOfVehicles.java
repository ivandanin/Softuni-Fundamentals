import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogueOfVehicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();

        String lines = scanner.nextLine();
        while (!lines.equals("Close the Catalogue")) {



        while (!lines.equals("End")){
            String[] data = lines.split(" ");
            String type = data[0];
            String model = data[1];
            String colour = data[2];
            int hp = Integer.parseInt(data[3]);

            Vehicle vehicle = new Vehicle(type, model, colour, hp);

            vehicleList.add(vehicle);

            lines = scanner.nextLine();
            if (lines.equals(model)) {
                System.out.println(vehicle.toString());
            }
            lines = scanner.nextLine();
        }

        }

    }

    static class Vehicle {
        String type;
        String model;
        String colour;
        int hp;

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColour() {
            return colour;
        }

        public int getHp() {
            return hp;
        }

        public Vehicle(String type, String model, String colour, int hp) {
            this.type = type;
            this.model = model;
            this.colour = colour;
            this.hp = hp;


        }

        @Override
        public String toString() {
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getType(), getModel(), getColour(), getHp());
        }
    }
}
