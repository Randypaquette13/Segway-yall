package core;

public class Main {

	public static void main(String[] args) {
		
		double gyro = 0;
		double xAccelerometer = 0;// to find angle get full gravity:  asin(value/gravity)
		double gravity = 0;
		double angle = 0;
		boolean balanceMode = false;
		double dT = 0.01;//time of the program
		
		double kP = 0;
		double kD = 0;
		
		double rMotor;
		double lMotor;
		
		long time = (long) (System.currentTimeMillis() % (dT * 1000)); //program executes 100 times per second
		
		
		double accAngle = Math.asin(xAccelerometer/gravity) * 180/Math.PI;
		
		if (time == 0){
			angle = (0.98) * (angle + gyro * dT) + (0.02) * accAngle;
			
		}

		while (balanceMode){
			rMotor = kP * angle + kD * dT;
			lMotor = -rMotor;
		}
		
	}

}
