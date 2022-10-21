import java.util.StringTokenizer;
public class House {
	private String houseID;
	private String houseAddress;
	private String houseType;
	private double housePrice;
	private int numBedrooms;
	private int numBathrooms;
	private int numCarspace;
	private double sizeHouse;
	private String descriptionHouse;
	
	public House (String id, String address, String type, double price, int bedrooms, int bathrooms, int carspace, double size, String description) {
		houseID=id;
		houseAddress=address;
		houseType=type;
		housePrice=price;
		numBedrooms=bedrooms;
		numBathrooms=bathrooms;
		numCarspace=carspace;
		sizeHouse=size;
		descriptionHouse=description;
	}
	
	public boolean AddHouse() {
		if(houseID.length()!=10 || Character.isUpperCase(houseID.charAt(0))==false) {
			return false;
		}
		int countWord= countWordsDescriptionHouse (descriptionHouse);
		if (countWord <5 || countWord <10) {
			return false;
		}
		if (numBedrooms >4 && numBathrooms <=2) {
			return false;
		}
		if (houseType = "Apartment" && numCarspace >=1) {
			return false;
		}
		return true;
	}
	public int countWordsDescriptionHouse (String Description_House) {
		StringTokenizer stringTokenizer1 = new StringTokenizer(Description_House);
		return stringTokenizer1.countTokens();
	}
	
	public boolean UpdateHouse (String newAddress, String newType, double newPrice, int newBedrooms, int newBathrooms, int newCarspace, double newSize, String newDescription) {
		return true;
	}
}
