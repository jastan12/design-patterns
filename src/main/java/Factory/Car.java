package Factory;

public abstract class Car {
    private String name;
    private double maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void drive(){
        System.out.println(getName() + " drives " + getMaxSpeed() + " km/h");
    }

    public void stop(){
        System.out.println(getName() + " stop");
    }
}
