package DiGiPets;

import java.io.File;

public enum Items 
{
	
	
	//Test Items
	Hat("Hat to wear", "Clothing", new File ("Item_Icons/hat.png")),
	Shirt("Shirt to wear", "Clothing", new File ("Item_Icons/shirt.png"));
	

	
	//Items information variables
	private final String desc;
	private final String type;
	private final File icon;
	
	//Items enum constructor
	Items(String Description, String skillType, File iconFile)
	{
		desc = Description;
		type = skillType;
		icon = iconFile;
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
	
	public File getIcon()
	{
		return icon;
	}
	
	
}
