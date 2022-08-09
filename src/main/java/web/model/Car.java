package web.model;

public class Car {
    private String model;
    private int series;
    private String cost;

    public Car() {
    }

    public Car(String model, int series, String cost) {
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public String getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", cost='" + cost + '\'' +
                '}';
    }
}
