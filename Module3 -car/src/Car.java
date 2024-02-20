public class Car {
    protected String make;
    protected String model;
    protected String year;

//    Defualt
    public Car(){
        this.make = "";
        this.model = "";
        this.year = "";
    }

//    Parametric
    public Car(String _make, String _model, String _year){
        this.make = _make;
        this.model = _model;
        this.year = _year;
    }

//    Copy

    public Car(Car otherCar){
        this.make = otherCar.make;
        this.model = otherCar.model;
        this.year = otherCar.year;
    }

    // Method to print car information
    public void printMe() {
        System.out.println("Make= '" + make + '\'' +
                ", Model= '" + model + '\'' +
                ", Year= '" + year + '\'');
    }


}
