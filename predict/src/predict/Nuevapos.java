package predict;

public class Nuevapos {
	private double posx;
	private double posy;
	
	public Nuevapos(double posx, double posy) {
		super();
		this.posx = posx;
		this.posy = posy;
	}

	public double getPosx() {
		return posx;
	}

	public void setPosx(double posx) {
		this.posx = posx;
	}

	public double getPosy() {
		return posy;
	}

	public void setPosy(double posy) {
		this.posy = posy;
	}

	@Override
	public String toString() {
		return "Nuevapos [posx=" + posx + ", posy=" + posy + "]";
	}

	
	
}
