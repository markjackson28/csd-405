// Class definition for Fan
public class Fan {
    // Constants for fan speeds
    // STOPPED speed constant
    public static final int STOPPED = 0; 
    // SLOW speed constant
    public static final int SLOW = 1;   
    // MEDIUM speed constant
    public static final int MEDIUM = 2;  
    // FAST speed constant
    public static final int FAST = 3;    

    // Private fields of the Fan class
    // holds the speed of the fan
    private int speed;
    // holds whether the fan is on or off        
    private boolean on;    
    // holds the radius of the fan   
    private double radius;
    // holds the color of the fan   
    private String color;     

    // No-argument constructor
    public Fan() {
        // default speed is STOPPED
        speed = STOPPED;
        // default state is off 
        on = false;
        // default radius is 6      
        radius = 6;
        // default color is white      
        color = "white"; 
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Setters and getters for the fields
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean isOn() {
        return on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // toString method to describe the fan's state
    @Override
    public String toString() {
        if (on) {
            return "Fan speed: " + speed + ", color: " + color + ", radius: " + radius;
        } else {
            return "Fan is off, color: " + color + ", radius: " + radius;
        }
    }

    // Main method to test the Fan class
    public static void main(String[] args) {
        // Creating an instance of Fan using the no-argument constructor
        Fan fan1 = new Fan();
        // Displaying default state
        System.out.println(fan1); 

        // Creating an instance of Fan using the argument constructor
        Fan fan2 = new Fan(MEDIUM, true, 8, "blue");
        // Displaying custom state
        System.out.println(fan2); 

        // Demonstrating the functionality of setter methods
        fan1.setSpeed(FAST);
        fan1.setOn(true);
        fan1.setColor("red");
        fan1.setRadius(10);
        // Displaying updated state of fan1
        System.out.println(fan1); 
    }
}
