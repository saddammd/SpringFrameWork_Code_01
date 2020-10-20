package rev.com.animal;

import rev.com.nutritionist.Nutritionist;

public class Cat implements Animal {

	private Nutritionist nutri;
	
	public Nutritionist getNutri() {
		return nutri;
	}

	public void setNutri(Nutritionist nutri) {
		this.nutri = nutri;
	}

	public void nutritionistAdvice() {
		
		nutri.walking();
		
	}
	
	@Override
	public void food() {
		
		// TODO Auto-generated method stub
		System.out.println("Cat drinks milk");
		
	}

	@Override
	public void hunting() {
		
		// TODO Auto-generated method stub
		System.out.println("Cats hunt for rat");
		
		
	}

	@Override
	public void favorite() {
		
		System.out.println("milk and fish are cat's fav dishes");
		
	}

}
