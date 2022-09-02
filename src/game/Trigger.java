package game;



public class Trigger {

	private static int STANDARD_SPEED = 8;
	
	private int type;
	private boolean status;
	private int x, row, speed;
	private int timeToCreate;
	private boolean isCreated;

	public Trigger(int type, int row){
		this.type = type;
		this.row = row;
		this.x = 1001;
		this.timeToCreate = -1;
		this.speed = STANDARD_SPEED;
		isCreated = false;
		status = false;
	}
	
	public Trigger(int type, int row, int timeToCreate) {
		this.type = type;
		this.row = row;
		this.x = 1001;
		this.timeToCreate = timeToCreate;
		this.speed = STANDARD_SPEED;
		isCreated = false;
		status = false;
	}
	
	public Trigger(int type, int row, int x, int timeToCreate) {
		this.type = type;
		this.row = row;
		this.x = x;
		this.timeToCreate = timeToCreate;
		this.speed = STANDARD_SPEED;
		isCreated = false;
		status = false;
	}

	public int getType() {
		return type;
	}

	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status){
		this.status = status;
	}

	public int getX() {
		return x;
	}
	
	//private final Random r = new Random();
	public int getRow() {
		//return 1;
		return row;
		//return (Math.abs(r.nextInt()%4)+1);
	}

	public int getSpeed() {
		return speed;
	}
	
	public int getTimeToCreate(){
		return timeToCreate;
	}
	
	public boolean isCreated(){
		return isCreated;
	}
	
	public void setCreated(boolean b){
		isCreated = b;
	}
	
	public void update(){
		x-=speed;
	}
}
