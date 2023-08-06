package enums;

enum Season{WINTER,SUMMER,SPRING,MANSOON};

public class EnumDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s=Season.SUMMER;
		switch(s) {
		case SUMMER:System.out.println("summer cloth");
		break;
		case WINTER:System.out.println("winter cloth");
		break;
		case SPRING:System.out.println("spring cloth");
		break;
		case MANSOON:System.out.println("umbrelaa....");
		break;
		default:System.out.println("invalid");
		}

	}

}
