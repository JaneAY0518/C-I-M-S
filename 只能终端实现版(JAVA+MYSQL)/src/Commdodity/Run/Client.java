package Commdodity.Run;

/*
 * 
 * 客人
 * 
 * */

public class Client {
	private String Id;
	private String Name;
	private String Mobile;
	private String Address;
	private String Email;
	public  Client(String Id,String Name,
String Mobile,String Address,String Email) {
		this.Id=Id;
		this.Name=Name;
		this.Mobile=Mobile;
		this.Address=Address;
		this.Email=Email;
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
	public void setMobile(String Mobile) {
		this.Mobile=Mobile;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setAddress(String Address) {
		this.Address=Address;
	}
	public String getAddress() {
		return Address;
	}
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public String getEmail() {
		return Email;
	}
}
