package core;

public class Main {

	public static void main(String[] args) {
		
		double gyro = 0;
		double xAccelerometer = 0;// to find angle get full gravity:  asin(value/gravity)
		double gravity = 0;
		double angle = 0;
		boolean balanceMode = false;
		
		double kP = 0;
		double kD = 0;
		
		double motor;
		
		long time = System.currentTimeMillis() % 10; //program executes 100 times per second
		
		
		double accAngle = Math.asin(xAccelerometer/gravity) * 180/Math.PI;
		
		if (time == 0){
			angle = (0.98) * (angle + gyro * 0.01) + (0.02) * accAngle;
			
		}

		while (balanceMode){
			motor = kP * angle + kD * 0.01;
		}
		
	}

}
