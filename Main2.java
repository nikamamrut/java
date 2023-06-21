public class Main2 {
    private String make;
    private String model;
    private int year;
    

    public Main2(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    static class Engine {
        private int horsepower;
        private int cylinders;

        public Engine(int horsepower, int cylinders) {
            this.horsepower = horsepower;
            this.cylinders = cylinders;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public int getCylinders() {
            return cylinders;
        }

        public void start() {
            System.out.println("Engine starting...");
        }
    }
    
    public static void main(String[] args)
    {
        Main.Engine engine = new Main.Engine(700, 4);
        engine.start();
    }
}