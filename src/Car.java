public class Car extends Transport implements Engineable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку  у автомобиля");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель  у автомобиля");
    }
}

