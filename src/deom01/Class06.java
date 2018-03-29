package deom01;

public abstract class Class06 {
	public abstract void theNo();
	
	public Class06(){
		System.out.println("这是父类无参构造方法");
	}
	public Class06(String doorName){
		this.doorName = doorName;
	}
	public String doorName = "门";
	public String brand;
	//本质功能
	public void open(){
		System.out.println("开门");
	}
	public void close(){
		System.out.println("关门");
	}

	public void open(int i) {
		// TODO Auto-generated method stub
		
	}

	public void open(String string) {
		// TODO Auto-generated method stub
		
	}

	public void open(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	public void ring() {
		// TODO Auto-generated method stub
		
	}

	public void baojing() {
		// TODO Auto-generated method stub
		
	}
}
