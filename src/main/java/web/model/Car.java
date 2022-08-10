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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Car other) {
            return other.cost.equals(cost)
                    && other.model.equals(model)
                    && other.series == series;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (model.hashCode() * 13 + cost.hashCode() * 37 + series) >>> 5;
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
