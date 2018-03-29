package deom01;

public class Class06son1 extends Class06 implements RingDoor,Baojing{
	private String doorName = "安全门";
	private String brand = "盼盼";
	public Class06son1(){
    	System.out.println("这是子类无参构造方法");
    }
	
	//父类抽象方法在子类实现抽象方法
	public void theNo() {
		System.out.println("我是安全门No2085");
	}

    public void open(){
    	System.out.println("/*--安全门，模拟执行了安全验证--*/");
    	System.out.println("门开了！");
    	System.out.println("下面开始调用父类方法和属性");
    	System.out.println(super.doorName);
    	super.open();
    }
    
    public void open(String key){
    	System.out.println("/*--用钥匙开安全门，模拟验证钥匙是否正确--*/");
    	System.out.println("门开了！");
    	}
    	public void open(int pwd){
    	System.out.println("/*--用6位密码开门，模拟验证密码是否正确--*/");
    	System.out.println("门开了！");
    	}
    	public void open(int doorNo,String visitName){
    	System.out.println("/*--"+visitName+"请求"+doorNo+"开门，模拟确定是否开门--*/");
    	System.out.println("门开了！");
    	}

    
    public Class06son1(String doorName,String brand){
    	super(doorName);
    	this.setBrand(brand);
    }
	public static void main(String[] args) {
		Class06 c1 = new Class06son1(); //Class06son1 c1 = new Class06son1(); 另外一种
		System.out.println(c1.doorName+c1.brand);
		c1.open();
		c1.close();
		c1.open(213214);
		c1.open("钥匙");
		c1.open(1802, "学员");
		System.out.println();
		c1.theNo();
		c1.ring();
		c1.baojing();
	
	}

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		System.out.println("响门铃");
	}

	@Override
	public void baojing() {
		// TODO Auto-generated method stub
		System.out.println("报警实现");
	}

	public String getDoorName() {
		return doorName;
	}

	public void setDoorName(String doorName) {
		this.doorName = doorName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
