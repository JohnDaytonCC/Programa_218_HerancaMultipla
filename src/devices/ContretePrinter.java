package devices;

public class ContretePrinter extends Device implements Printer {

	public ContretePrinter(String serialNuber) {
		super(serialNuber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}
	
	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}

}
