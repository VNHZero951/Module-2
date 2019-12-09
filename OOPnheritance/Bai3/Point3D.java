package OOPnheritance.Bai3;

public class Point3D extends Point2D{
        float z = 0.0f;
        float arr1[] = new float[3];
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x ,float y,float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        arr1[0] = x;
        arr1[1] = y;
        arr1[2] = z;
        return arr;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ","+ z +")";
    }
}
