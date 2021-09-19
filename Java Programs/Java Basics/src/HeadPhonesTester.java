
public class HeadPhonesTester {

	public static void main(String[] args) {
		HeadPhones h1=new HeadPhones();
		HeadPhones h2=new HeadPhones();
		System.out.println(h1);
		h2.setHeadPhoneColor("Coffee");
		h2.setManufacturer("Sony");
		h2.setVolume(1);
		h2.setPluggedIn(true);
		System.out.println("\nSECOND INSTANCE\n");
		System.out.println(h2);
		h2.changeVolume(3);
		System.out.println("AFTER CHANGING VOLUME");
		System.out.println("Volume = "+h2.getVolume());
		System.out.println("Manufacturer = "+h2.getManufacturer());
	}

}
