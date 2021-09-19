
public class HeadPhones {
	static final int LOW=1,MEDIUM=2,HIGH=3;
	private int  volume;
	private boolean pluggedIn;
	private String manufacturer;
	private String headPhoneColor;
	
	HeadPhones() {
		volume=MEDIUM;
		pluggedIn=false;
		manufacturer="UNKNOWN";
		headPhoneColor="UNKNOWN";
	}
	
	public void setVolume(int v) {
		volume=v;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setPluggedIn(boolean b) {
		pluggedIn=b;
	}
	
	public boolean getPluggedIn() {
		return pluggedIn;
	}
	
	public void setManufacturer(String m) {
		manufacturer=m;
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setHeadPhoneColor(String c) {
		headPhoneColor=c;
	}
	
	public String getHeadPhoneColor() {
		return headPhoneColor;
	}
	
	public void changeVolume(int val) {
		volume=val;
	}
	
	public String toString() {
		String res = "VOLUME = " + volume + 
				"\nPlugged In = " + pluggedIn +
				"\nManufacturer = " + manufacturer +
				"\nColor = " + headPhoneColor;
		return res;
	}
	
}
