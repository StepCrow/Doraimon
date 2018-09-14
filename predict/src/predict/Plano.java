package predict;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Plano{
	
	private Obj1 obj1;
	
	private Obj2 obj2;
	private Thread hola;
	
	private boolean mov;
	private double temp;
	
	protected static double distancia(double x1, double x2, double y1, double y2) {
		
		double dist=0;
		
		dist = Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1), 2));
		
		
		
		return dist;
		
		
		
		
		
		
	}
	
	protected static void predict(double xi,double yi, double dir, double veli,double veld) {
		
		double nx = xi+veli*10*Math.cos(dir*Math.PI/180);
		
		double ny = yi+veli*10*Math.sin(dir*Math.PI/180);
		
		Nuevapos newpos = new Nuevapos(nx,ny);
		System.out.println(newpos);
		
	}
	
	public Plano() {
		
		hola = new Thread(new Runnable() {

			
			
			@Override
			public void run() {
				
				temp=0; //centesimas de segundo
				mov = false;
				while (mov==false) {
					
					System.out.println("tiempo transcurrido (centesimas)");
					System.out.println(temp);
					System.out.println("datos del obj 1");
					System.out.println(obj1);
					System.out.println("predict para dentro de 10 cent");
					predict(obj1.getPosX(),obj1.getPosY(),obj1.getDir(),obj1.getVel(),0);
					
					
					
					
					obj1.setPosX(obj1.getPosX()+obj1.getVel()*Math.cos(obj1.getDir()*Math.PI/180));
					
					obj1.setPosY(obj1.getPosY()+obj1.getVel()*Math.sin(obj1.getDir()*Math.PI/180));
					
					temp++;
					
					
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				
			}
		}); 
		
	
	}
	
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				Plano o = new Plano();
				
				o.obj1 = new Obj1(100,100,0.01,23);
				o.obj2 = new Obj2("",0,0,110,100);
				
				o.hola.start();
				
				
			}
		});
		
	}

}
