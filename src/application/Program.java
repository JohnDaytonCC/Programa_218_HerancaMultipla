/* A interface é uma forma de implementar uma classe que pode realizar mais de um interface,
 * porem isso não é considerado uma herança multipla, pois não há a característica do reuso da
 * relação entre ComboDevice e as interfaces Scanner e Printer.
 * 
 * ComboDevice não herda, mas sim implementa as interfaces(cumpre o contrato).
 */
package application;

import devices.ContretePrinter;
import devices.ComboDevice;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		
		ContretePrinter p = new ContretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertaion");
		c.print("My dissertaion");
		System.out.println("Scan serult: " + c.scan());
	}

}
