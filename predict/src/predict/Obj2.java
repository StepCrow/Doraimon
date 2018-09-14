package predict;

public class Obj2 {

		private String name;
		private double veld;
		private double rango;
		private double posx;
		private double posy;
		
		
		
		
		
		public Obj2(String name, double veld, double rango, double posx, double posy) {
			super();
			this.name = name;
			this.veld = veld;
			this.rango = rango;
			this.posx = posx;
			this.posy = posy;
			
			
		}

		public Obj2() {
			super();
			this.name = "";
			this.veld = 0;
			this.rango = 0;
			this.posx = 0;
			this.posy = 0;
			
			
		}

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public double getVeld() {
			return veld;
		}


		public void setVeld(double veld) {
			this.veld = veld;
		}


		public double getRango() {
			return rango;
		}


		public void setRango(double rango) {
			this.rango = rango;
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
		
		
		
}
