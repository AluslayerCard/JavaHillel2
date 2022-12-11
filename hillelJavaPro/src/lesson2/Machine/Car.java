package lesson2.Machine;

public class Car {
    public void start() {
        startFuel();
        startCommand();
        startElectricity();
    }

    private void startFuel() {
        System.out.println("Fuel system started");
    }

    private void  startCommand() {
        System.out.println("Command has been started");
    }

    private void  startElectricity() {
        System.out.println("Electricity has been started");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }


}
