package OOPnheritance.Bai3;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;
    float arr[] = new float[2];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
   }
    public float[] getXY(){
        arr[0] = x;
        arr[1] = y;
        return arr;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
