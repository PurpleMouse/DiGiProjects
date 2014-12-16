package DiGiPets;

public enum Items 
{
	//Test Items
	Hat("Hat to wear", "Clothing"),
	Shirt("Shirt to wear", "Clothing");
	
	//Items information variables
	private final String desc;
	private final String type;
	
	//Items enum constructor
	Items(String Description, String skillType)
	{
		desc = Description;
		type = skillType;
	}
	
	/*
	 * Items information Accessors
	 */
	public String getDesc()
	{
		return desc;
	}
	
	public String getType()
	{
		return type;
	}
}
