package _3_7_TheBallAndPlayerClasses;
/*
 * 
 * @author DNABigBoss - hanunalya22@gmail.com
 * 
 */
public class Ball {
	private float x;
	private float y;
	private float z;
	
	public Ball(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	public float getZ() {
		return z;
	}
	
	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String toString() {
		return "(" + x +","+ y + ","+ z + ")";
	}
}
