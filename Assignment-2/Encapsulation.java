
public class Encapsulation {
	private String name;
	private String address;
	private String city;
	private int rollNo;
	private int percentage;
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getAddress() {
		return address;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public String getCity() {
		return city;
	}
    public void setCity(String city) {
		this.city = city;
	}
    public int getRollNo() {
		return rollNo;
	}
    public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
    public int getPercentage() {
		return percentage;
	}
    public void setPercentage(int percentage) {
		this.percentage = percentage;
}

	  public static void main(String[] args) {
		  Encapsulation encapsulation=new Encapsulation();
		  encapsulation.setName("Asif");
		  System.out.println(encapsulation.getName());
		  
		  encapsulation.setAddress("Natekal");
		  System.out.println(encapsulation.getAddress());
		  
		  encapsulation.setCity("mangalore");
		  System.out.println(encapsulation.getCity());
		  
		  encapsulation.setRollNo(49);
		  System.out.println(encapsulation.getRollNo());
		
		  
		  encapsulation.setPercentage(79);
		  System.out.println(encapsulation.getPercentage());
		
		

	}

}
