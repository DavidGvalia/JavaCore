package org.example.internal_nested;


public class Car {
    private String model;
    private Engine engine;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    static class Engine {
        private TypeOfEngine typeOfEngine;
        private int horsePower;

        public Engine(TypeOfEngine typeOfEngine, int horsePower) {
            this.typeOfEngine = typeOfEngine;
            this.horsePower = horsePower;
        }

        public TypeOfEngine getTypeOfEngine() {
            return typeOfEngine;
        }

        public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
            this.typeOfEngine = typeOfEngine;
        }

        public int getHorsePower() {
            return horsePower;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }
    }
    public void getInfo(){
        System.out.println("Model: " + model);
        if (engine != null) {
            System.out.println("Engine");
            System.out.println("Type of engine: " + engine.getTypeOfEngine());
            System.out.println("Horse power: " + engine.getHorsePower());
        } else {
            System.out.println("No engine");
        }


    }
}
