package Task4;

public class TV {
    private String model;
    private int year;
    private double price;
    private int diagonal;
    private Manufacturer manufacturer;

    public TV(String model, int year, double price, int diagonal, Manufacturer manufacturer) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return
                "Модель: " + model +
                ", Год: " + year +
                ", Цена: " + price + "$" +
                ", Диагональ: " + diagonal + "\"" +
                ", Производитель: " + manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TV tv = (TV) o;

        if (year != tv.year) return false;
        if (Double.compare(tv.price, price) != 0) return false;
        if (diagonal != tv.diagonal) return false;
        if (model != null ? !model.equals(tv.model) : tv.model != null) return false;
        return manufacturer == tv.manufacturer;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model != null ? model.hashCode() : 0;
        result = 31 * result + year;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + diagonal;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }
}
