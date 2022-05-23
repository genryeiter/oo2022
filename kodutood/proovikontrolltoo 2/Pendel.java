public class Pendel implements Runnable{
	int ooteaeg;
	public Pendel(double cm){
		ooteaeg=(int)(1000*2*Math.PI*Math.sqrt((cm/100.0)/9.8));
		System.out.println(ooteaeg);
	}
	public void run(){
		while (true) {
			try {
				Thread.sleep(ooteaeg);
			} catch (Exception ex) {
				System.out.println(ex);
			}
			System.out.println("tiks");
		}
	}
}