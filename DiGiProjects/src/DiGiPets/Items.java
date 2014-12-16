package DiGiPets;

import javax.swing.ImageIcon;

public enum Items 
{
	//Test Items
	Hat("Hat to wear", "Clothing", new ImageIcon(Object.class.getResource("Item_Icons/hat.png"))),
	Shirt("Shirt to wear", "Clothing", new ImageIcon(Object.class.getResource("Item_Icons/shirt.png")));
	

	
	private final String desc;//item description
	private final String type;//item type
	private final ImageIcon icon;//item icon file
	
	//Items enum constructor
	Items(String Description, String skillType, ImageIcon imageIcon)
	{
		desc = Description;
		type = skillType;
		icon = imageIcon;
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
	
	public ImageIcon getIcon()
	{
		return icon;
	}
	
	
}
