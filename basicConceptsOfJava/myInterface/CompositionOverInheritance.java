    class Engine {
        void start() {
            System.out.println("Engine started.");
        }
    }

    class Wheels {
        void roll() {
            System.out.println("Wheels are rolling.");
        }
    }

    class Car {
        private Engine engine = new Engine();
        private Wheels wheels = new Wheels();

        void drive() {
            engine.start();
            wheels.roll();
            System.out.println("Car is driving.");
        }
    }