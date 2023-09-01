public class TestLine{
	public static void main(String[] args){
		Color red = Color.RED;
		Line line1 = new Line(9.264,8.626,9.070,3.194, red);
		
		Color green = Color.GREEN;
		Line line2 = new Line(5.670,0.307,4.001,8.058, green);
		
		Color blue = Color.BLUE;
		Line line3 = new Line(9.360,6.226,4.605,4.110, blue);
		
		Color yellow = Color.YELLOW;
		Line line4 = new Line(0.752,9.955,5.561,9.962, yellow);
		
		System.out.println("" + line1 + " has length of " + line1.length());
		System.out.println("" + line2 + " has length of " + line2.length());
		System.out.println("" + line3 + " has length of " + line3.length());
		System.out.println("" + line4 + " has length of " + line4.length());
	}
}
