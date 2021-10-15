package Laptop;

public class ActualLaptopData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaptopClass hp = new LaptopClass();
		LaptopClass lenovo = new LaptopClass();
		LaptopClass Dell = new LaptopClass();
		// Filling the input
		hp.ram = 4;
		hp.OS = "Windows";
		hp.processor = "Intel";
		hp.graphics = 2;
		hp.storage = 1;
		hp.batteryBackup = 4;
		boolean fingerprint = true;
//		     
//		     //Details for Lenovo
//		     lenovo.ram=4;
//		     lenovo.OS = "Windows";
//		     lenovo.processor = "Intel";
//		     lenovo.graphics  = 2;
//		     lenovo.storage = 1;
//		     lenovo.batteryBackup = 4;

		// Printing the input data
		System.out.println("Processor : " + hp.processor);
		System.out.println("OS        : " + hp.OS);
		System.out.println("Graphics  : " + hp.graphics + " GB");
		System.out.println("Ram       : " + hp.ram + " GB");
		System.out.println("Storage   : " + hp.storage + " GB");
		System.out.println("Battery   : " + hp.batteryBackup + " hrs");
		// Printing Input for Lenovo

		// Below are the methods in my Laptop
		hp.gaming();
		hp.entertainment();
		hp.browsing();

	}

}
