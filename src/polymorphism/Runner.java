package polymorphism;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Ferrari ferrari = new Ferrari();
		CarBrand CarBrandferrari = new Ferrari();
		
		ferrari.colour();
		ferrari.engine();
		ferrari.numberOfDoors();
		ferrari.cost();
		ferrari.numberOfSeats();
		ferrari.alloyMaterial();
		
		CarBrandferrari.colour();
		CarBrandferrari.engine();
		CarBrandferrari.numberOfDoors();
		((Ferrari) CarBrandferrari).cost();
		((Ferrari) CarBrandferrari).numberOfSeats();
		((Ferrari) CarBrandferrari).alloyMaterial();
	}

}
