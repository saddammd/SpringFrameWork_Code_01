package rev.com.nutritionist;

public class Nutritionist implements Nutritions {

	@Override
	public void walking() {
		
		System.out.println("Your pet needs walking");

	}

	@Override
	public void bathing() {
		System.out.println("Your pet needs bathing");

	}

	@Override
	public void injection() {
		
		System.out.println("Your pet needs treatment get an injection");
		

	}

}
