package solution;

public class CarEvaluator{
	
    public Car getBestCar(Iterable<Car> cars){
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}

