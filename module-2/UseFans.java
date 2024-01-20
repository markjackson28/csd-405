import java.util.Collection;
import java.util.ArrayList;

// Fan class
class Fan {
    // Constants for fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Constructors
    public Fan() {
        this(STOPPED, false, 6, "white");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Setters
    public void setSpeed(int speed) { this.speed = speed; }
    public void setOn(boolean on) { this.on = on; }
    public void setRadius(double radius) { this.radius = radius; }
    public void setColor(String color) { this.color = color; }

    // Getters
    public int getSpeed() { return this.speed; }
    public boolean isOn() { return this.on; }
    public double getRadius() { return this.radius; }
    public String getColor() { return this.color; }

    // toString method
    @Override
    public String toString() {
        return (this.on ? "Fan speed: " + this.speed + ", color: " + this.color + ", radius: " + this.radius
                        : "Fan is off, color: " + this.color + ", radius: " + this.radius);
    }
}

// UseFans class
public class UseFans {
    // Method to display a collection of Fan instances
    public void displayFans(Collection<Fan> fans) {
        for (Fan fan : fans) {
            displayFan(fan);
            System.out.println();
        }
    }

    // Method to display a single Fan instance
    public void displayFan(Fan fan) {
        String status = fan.isOn() ? "On" : "Off";
        System.out.println("Fan Status: " + status);
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }

    public static void main(String[] args) {
        // Create a collection of Fan instances
        Collection<Fan> fans = new ArrayList<>();
        fans.add(new Fan(Fan.FAST, true, 10, "blue"));
        fans.add(new Fan());
        fans.add(new Fan(Fan.MEDIUM, false, 7, "green"));

        // UseFans instance to display the fans
        UseFans useFans = new UseFans();
        useFans.displayFans(fans);
    }
}
