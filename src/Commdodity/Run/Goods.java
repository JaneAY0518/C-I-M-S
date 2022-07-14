package Commdodity.Run;

/*
 * 
 * 商品
 * 
 * */

public class Goods {
	private String Id;
	private String Name;
	private String Barcode;
	private String Place;
	
	public  Goods(String Id,String Name,String Barcode,String Place) {
		this.Id=Id;
		this.Name=Name;
		this.Barcode=Barcode;
		this.Place=Place;
	}
	
	public void setId(String Id) {
		this.Id=Id;
	}
	public String getId() {
		return Id;
	}
	
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	
	public void setBarcode(String Barcode) {
		this.Barcode=Barcode;
	}
	public String getBarcodee() {
		return Barcode;
	}
	
	public void setPlace(String Place) {
		this.Place=Place;
	}
	public String getPlace() {
		return Place;
	}
	
	public String toString() {  
		return "Client  {" +"Id='" + Id + '\'' +", Name='" + Name + '\'' +", Barcode='" + Barcode +
				'\'' +", Place='" + Place + '\''  +'}';
	}
	
}
