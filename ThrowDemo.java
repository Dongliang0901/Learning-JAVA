
public class ThrowDemo {

	public static void main(String[] args) {
		Hero hero=new Hero("diaochan");
		try {
			hero.setExp(1000);
			hero.setHealth(40);
			hero.rideHorse();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("present experience: "+hero.getExp());
	}

}

class Hero{
	private String name;
	private long exp;
	private int health;
	
	public Hero(String name){
		setName(name);
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	//while the health<50, can not ride a horse
	public void rideHorse() throws LessThanZeroException{
		if(health>=50){
			System.out.println(getName()+" ridding");
		}else
			throw new LessThanZeroException(); 
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getExp() {
		return exp;
	}
	
	public void setExp(long exp) throws Exception {
		if(exp>=0){
			this.exp = exp;
		}else{
			throw new Exception("experience can not be negative number");
		}
	}
}