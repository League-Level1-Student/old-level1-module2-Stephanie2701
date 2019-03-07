package extra;


public class PixelRunner {
	
	public static void main(String[] args) {
		
		PixelParty o= new PixelParty();
		o.drawCircle(20, 20, 10);
		o.drawRectangle(20, 10, 50, 80);
		o.drawTriangle(20, 10, 15,10, 20, 15);
		o.saveImage();
		o.displayImage();
	}

}
