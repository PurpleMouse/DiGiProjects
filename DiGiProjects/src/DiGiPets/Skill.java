package DiGiPets;

public enum Skill 
{
	//Test Skills
	Wave("Waves to screen", "Social"),
	Bow("Bows to screen", "Social");
	
	//Skill information variables
	private final static String desc;
	private final static String type;
	
	//Skill enum constructor
	Skill(String Description, String skillType)
	{
		desc = Description;
		type = skillType;
	}
	
	/*
	 * Skill information Accessors
	 */
	public String getDesc()
	{
		return desc;
	}
	
	public String getType()
	{
		return skillType;
	}
}
