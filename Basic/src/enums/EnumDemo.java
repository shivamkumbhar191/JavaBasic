package enums;

class Directions{
	static final String NORTH="NORTH";
	static final String SOUTH="SOUTH";
	static final String WEST="WEST";
	static final String EAST="EAST";
}

public class EnumDemo {
	
	public enum Direction{NORTH,SOUTH,WEST,EAST};

	public static void main(String[] args) {
		System.out.println(Directions.NORTH);
		Direction d1= Direction.NORTH;
		Direction d2= Direction.NORTH;
		if(d1.equals(d2)) {
			System.out.println("equals");
		}
		if(d1==d2) {
			System.out.println("equals");
		}
		for(Direction d: Direction.values()) {
			System.out.println(d);
		}
		System.out.println(Direction.EAST.ordinal());
		
	}

}
