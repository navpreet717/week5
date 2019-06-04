package week5th;

public class Flippy {

	public static void main(String[] args) {
		 calculateDistance(9.8,10);//call the function
		 calculateDistance("abc",1.2,9);
		
	}
		// TODO Auto-generated method stub
		//the distance an object falls down
		//d=0.5*g*t ----->g gravity(9.8m/s^2), t time--> how long its falling 
		//two parameters
		//p1 gravity
		// p2 time in seconds
		// function should output in console
		
		public static void calculateDistance(double g,int t){
			double distance=0.5*g*t;
			System.out.println("distance travelled:"+distance);}
		//FUNCTion poverloading
			public static void calculateDistance(String name,double g,int t){
				double distance=0.5*g*t;
				System.out.println("distance travelled2:"+name+":"+distance);
		}
		

	}

