
public class Patient {
	boolean care = false;
	boolean live = true;
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return care;
	}

	public void checkPulse() {
		care = true;
		
	}

	public boolean isAlive() {
		return live;
	}

	public void kill() {
		live=false;
		
	}

}
