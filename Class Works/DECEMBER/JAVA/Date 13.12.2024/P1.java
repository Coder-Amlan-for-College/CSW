
class Engine{
	void start() {
		System.out.println("Engine is Starting");
	}
}
class Car{
	Engine engine;
	
	Car(Engine engine){
		this.engine = engine;
	}
	void drive() {
		engine.start();
		System.out.println("Car is driving...");
		
	}
}

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Engine a = new Engine();
         Car car = new Car(a);
         car.drive();
	}

}
