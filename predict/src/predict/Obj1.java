package predict;

public class Obj1 {

	private double posX;
	private double posY;
	private double vel; 
	private double dir; // VA EN GRADOS!!
	
	
	public Obj1(double posX, double posY, double vel, double dir) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.vel = vel;
		this.dir = dir;
	}

	
	public Obj1() {
		super();
		this.posX = 0;
		this.posY = 0;
		this.vel = 0;
		this.dir = 0;
	}


	public double getPosX() {
		return posX;
	}


	public void setPosX(double posX) {
		this.posX = posX;
	}


	public double getPosY() {
		return posY;
	}


	public void setPosY(double posY) {
		this.posY = posY;
	}


	public double getVel() {
		return vel;
	}


	public void setVel(double vel) {
		this.vel = vel;
	}


	public double getDir() {
		return dir;
	}


	public void setDir(double dir) {
		this.dir = dir;
	}


	@Override
	public String toString() {
		return "Obj1 [posX=" + posX + ", posY=" + posY + ", vel=" + vel + ", dir=" + dir + "]";
	}
	
	
	
	
}
