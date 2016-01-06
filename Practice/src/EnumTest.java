
public class EnumTest {

	 public static void main(String[] args) {
	        
	        showAnimal(Animal.DOG);
	        
	    }
	    
	    public static void showAnimal(Animal animal) {
	        
	        if ( animal == Animal.CAT ) {
	            System.out.println("고양이");
	            System.out.println(animal.value);
	            System.out.println(animal.value2);
	        }
	        
	        else if ( animal == Animal.DOG ) {
	            System.out.println("강아지");
	            System.out.println(animal.value);
	            System.out.println(animal.value2);
	        }
	        
	        else if ( animal == Animal.BIRD ) {
	            System.out.println("새");
	            System.out.println(animal.value);
	            System.out.println(animal.value2);
	        }
	        
	        else {
	            System.out.println("???");
	        }
	        
	    }
}
