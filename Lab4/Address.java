public class Address {

	private String address;
	private String street;
	private String town;
	private String county;
	

	public void setAddress(String addressin)
	{
		this.address = addressin;
	}
	
	public String getAddress()
	{
		return address;
	}

	public String getCounty() 
	{
		return county;
	}
	
	public void setCounty(String employeecounty) 
	{
		this.county = employeecounty;
	}
	
	public String getTown() 
	{
		return town;
	}
	
	public void setTown(String employeetown) 
	{
		this.town = employeetown;
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public  void setStreet(String employeestreet) 
	{
		this.street = employeestreet;
	}
	
	public String toString()
	{
		if(getAddress=="")
			{
				return "\n" + getStreet() + "\n" + getTown() + "\n" + getCounty();		
			}
		else
			{
				return "\n" + getAddress;
			}
	}
}