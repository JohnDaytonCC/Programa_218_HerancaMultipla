package devices;

public class Scanner extends Device {

	public Scanner(String serialNuber) {
		super(serialNuber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	public String scan() {
		return "Scanner content";
	}
	
}
