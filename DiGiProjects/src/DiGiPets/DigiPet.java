package DiGiPets;

public class DigiPet {
	private int lvl, hp, mp;//pet level, health, mana
	private String name;//pet name
	private Items[] invt;//Holds all the pets objects add max 20
	private Skill[] skills;//Holds all the pets skills max 100
	public DigiPet(){//default pet creation
		lvl = 0;
		hp = mp = 1;
		name = "";
		invt = new Items[19];//Max 20
		skills = new Skill[99];//Max 100 skills
	}
	public void setName(String n){
		name = n;
	}
	public void levelUp(){
		//on level up
		//gain random item
		//gain new skill
		//hp and mp inc
		lvl ++;//level increment
	}
	public void learnSkill(Skill s){
		//Add to skill inv check if invt is full
	}
	public void gainItem(Items i){
		//add to invt check if invt is full
	}
	//Return statements
	public String getName(){
		return name;
	}
	public int getLevel(){
		return lvl;
	}
	public int getHP(){
		return hp;
	}
	public int getMP(){
		return mp;
	}//added
	//array returns need fix
	public Items[] getInventory(){
		return invt;
	}
	public Skill[] getSkills(){
		return skills;
	}
}
