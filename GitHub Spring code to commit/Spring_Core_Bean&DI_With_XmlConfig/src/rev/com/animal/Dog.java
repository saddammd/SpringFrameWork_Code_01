package rev.com.animal;

import rev.com.nutritionist.Nutritionist;

public class Dog implements Animal{
	
	private Nutritionist nutritionist;
	private String dog_name;

	
	
	
	public String getDog_name() {
		return dog_name;
	}

	public void setDog_name(String dog_name) {
		this.dog_name = dog_name;
	}

	public Dog() {
		
	}
	
	public Dog(Nutritionist nutri) {
		
		this.nutritionist = nutri;
	}
	
	@Override
	public void food() {
		// TODO Auto-generated method stub
		System.out.println("Dog eats biscuits");
		
	}

	@Override
	public void hunting() {
		
		// TODO Auto-generated method stub
		System.out.println("Dogs don't hunt but bite humans");
		
	}

	@Override
	public void favorite() {
		// TODO Auto-generated method stub
		System.out.println("Pedigree are dog's fav food");
		
	}

	
	public void nutritionistAdvice() {
		
		nutritionist.bathing();
	}
}
