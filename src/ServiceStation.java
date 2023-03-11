public class ServiceStation {
    public void check(Car car) {
        checkTransport(car);
        checkEngine(car);

    }

    public void check(Bicycle bicycle) {
        checkTransport(bicycle);

    }

    public void check(Truck truck) {
      checkTransport(truck);
      checkEngine(truck);
            truck.checkTrailer();

    }

    private void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
    private void checkEngine(Engineable engineable){
        engineable.checkEngine();
    }
}

