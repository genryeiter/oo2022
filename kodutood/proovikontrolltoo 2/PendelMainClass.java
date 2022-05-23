public class PendelMainClass {
	public static void main(String[] arg) {
		Pendel p1 = new Pendel(25);
		new Thread(p1).start();
	}
}