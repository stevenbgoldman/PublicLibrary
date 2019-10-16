package PublicLibrary;

public class Address 
{
	private int uniqueId;                  // Every Address record has a unique id
	private String addressLine1;           // Address line 1
	private String addressLine2;           // Address line 2
	private int zipCode;                   // zip Code
	private int zipCodePlus4;              // Plus 4 code
	private String city;                   // City
	private String State;                  // State
	private String country;                // Country
	private String addressType;            // Customer or Branch
	
	public Address() 
	{
				
	}

	public int getUniqueId()
	{
		return uniqueId;
	}

	public void setUniqueId(int uniqueId)
	{
		this.uniqueId = uniqueId;
	}

	public String getAddressLine1()
	{
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2()
	{
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}

	public int getZipCode()
	{
		return zipCode;
	}

	public void setZipCode(int zipCode)
	{
		this.zipCode = zipCode;
	}

	public int getZipCodePlus4()
	{
		return zipCodePlus4;
	}

	public void setZipCodePlus4(int zipCodePlus4)
	{
		this.zipCodePlus4 = zipCodePlus4;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return State;
	}

	public void setState(String state)
	{
		State = state;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country)
	{
		this.country = country;
	}

	public String getAddressType()
	{
		return addressType;
	}

	public void setAddressType(String addressType)
	{
		this.addressType = addressType;
	}

}
