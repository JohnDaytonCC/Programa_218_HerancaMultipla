package devices;

public class Printer extends Device {

	public Printer(String serialNuber) {
		super(serialNuber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

}
