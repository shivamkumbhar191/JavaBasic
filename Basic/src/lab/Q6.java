package lab;

interface MusicalInstrument{
	void play();
	
	static void learnInstrument()	{
		System.out.println("learning ");
	}
	
}


abstract class Sound{
	
	abstract void listenSound();
	
}

class PercussionIntrument extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		
	}

	@Override
	void listenSound() {
				
	}
	
}

class StringedInstrument extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		
	}

	@Override
	void listenSound() {
	
		
	}
	
}
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
