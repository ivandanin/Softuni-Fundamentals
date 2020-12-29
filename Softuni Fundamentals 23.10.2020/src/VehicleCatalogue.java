import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicles> vehiclesList = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = scanner.nextLine().split(" ");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int hp = Integer.parseInt(data[3]);

            Vehicles vehicle = new Vehicles(type, model, color, hp);
            vehiclesList.add(vehicle);

            input = scanner.nextLine();

        }
        String readTheModel = scanner.nextLine();

    }

    static class Vehicles {
        String type;
        String model;
        String color;
        int hp;

        public Vehicles(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getHp() {
            return hp;
        }

        public void setHp(int hp) {
            this.hp = hp;
        }

        public String dataOfVehicles() {
            return String.format(" Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                    getType(), getModel(), getColor(), getHp());
        }
    }
}
