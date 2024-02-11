public class CarApp {
    public static void main(String[] args) {
     
        Car defaultCar = new Car();

       
        Car customCar = new Car("Toyota", "Camry", 2022);

        
        System.out.println("дефолт детали за колата:");
        System.out.println(defaultCar);

        System.out.println("уредени детали за колата:");
        System.out.println(customCar);
    }
}
