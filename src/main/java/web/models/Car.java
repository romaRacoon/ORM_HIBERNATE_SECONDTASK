package web.models;

public class Car {
    private String model;
    private int series;
    private int yearOfReleased;

    public Car(String model, int series, int yearOfReleased) {
        this.model = model;
        this.series = series;
        this.yearOfReleased = yearOfReleased;
    }


    public int getYearOfReleased() {
        return yearOfReleased;
    }

    public void setYearOfReleased(int yearOfReleased) {
        this.yearOfReleased = yearOfReleased;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
