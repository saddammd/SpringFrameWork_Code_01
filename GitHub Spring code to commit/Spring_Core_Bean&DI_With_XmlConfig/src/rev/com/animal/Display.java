package rev.com.animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Display {

	
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationConfig.xml");
		
		Cat anim = context.getBean("Catty", Cat.class);
		Dog anim2 = context.getBean("Doggy", Dog.class);
		
		// TODO Auto-generated method stub
		
		anim.food();
		anim.favorite();
		anim.hunting();
		anim.nutritionistAdvice();
		
		System.out.println("------------------------------------------");
		
		
		anim2.food();
		anim2.favorite();
		anim2.hunting(); 
		anim2.nutritionistAdvice();
		System.out.println("Your pet name is " +anim2.getDog_name());
		context.close();
		
		

	

}
}