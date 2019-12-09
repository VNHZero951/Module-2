package OOP;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public Fan() {
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan(int speed, double radius , String color, boolean on) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString(){
        if (isOn()){
            return "Speed:" + getSpeed() +" "+ "Color:"+getColor() + " " + "Radius:" + getRadius() +" "+ "Fan is on";
        } else {
            return "Speed:" + getSpeed() +" "+ "Color:"+getColor() + " " + "Radius:" + getRadius() +" "+ "Fan is off";
        }
    }

    public static void main(String[] args) {
        Fan Fan1 = new Fan(3,10,"Yellow",true);
        Fan Fan2 = new Fan(2,5,"Blue",false);
        System.out.println(Fan1);
        System.out.println(Fan2);
    }

}
