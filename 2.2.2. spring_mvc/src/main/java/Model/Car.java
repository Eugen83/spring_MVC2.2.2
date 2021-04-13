package Model;

public class Car {
    private String model;
    private String manufacturer;
    private int series;

    public Car (){

    }

    public Car(String manufacturer, String model, int series) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", series=" + series +
                '}';
    }
}
