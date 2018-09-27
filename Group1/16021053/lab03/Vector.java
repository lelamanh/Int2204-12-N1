public class Vector {
    float x, y, z;
    public Vector(float x, float y, float z) {
        this.x = x; this.y = y; this.z = z;
    }
    public Vector add(Vector v) {
        return new Vector(v.x + x, v.y + y, v.z + z);
    }
}