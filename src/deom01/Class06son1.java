package deom01;

public class Class06son1 extends Class06 implements RingDoor,Baojing{
	private String doorName = "��ȫ��";
	private String brand = "����";
	public Class06son1(){
    	System.out.println("���������޲ι��췽��");
    }
	
	//������󷽷�������ʵ�ֳ��󷽷�
	public void theNo() {
		System.out.println("���ǰ�ȫ��No2085");
	}

    public void open(){
    	System.out.println("/*--��ȫ�ţ�ģ��ִ���˰�ȫ��֤--*/");
    	System.out.println("�ſ��ˣ�");
    	System.out.println("���濪ʼ���ø��෽��������");
    	System.out.println(super.doorName);
    	super.open();
    }
    
    public void open(String key){
    	System.out.println("/*--��Կ�׿���ȫ�ţ�ģ����֤Կ���Ƿ���ȷ--*/");
    	System.out.println("�ſ��ˣ�");
    	}
    	public void open(int pwd){
    	System.out.println("/*--��6λ���뿪�ţ�ģ����֤�����Ƿ���ȷ--*/");
    	System.out.println("�ſ��ˣ�");
    	}
    	public void open(int doorNo,String visitName){
    	System.out.println("/*--"+visitName+"����"+doorNo+"���ţ�ģ��ȷ���Ƿ���--*/");
    	System.out.println("�ſ��ˣ�");
    	}

    
    public Class06son1(String doorName,String brand){
    	super(doorName);
    	this.setBrand(brand);
    }
	public static void main(String[] args) {
		Class06 c1 = new Class06son1(); //Class06son1 c1 = new Class06son1(); ����һ��
		System.out.println(c1.doorName+c1.brand);
		c1.open();
		c1.close();
		c1.open(213214);
		c1.open("Կ��");
		c1.open(1802, "ѧԱ");
		System.out.println();
		c1.theNo();
		c1.ring();
		c1.baojing();
	
	}

	@Override
	public void ring() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}

	@Override
	public void baojing() {
		// TODO Auto-generated method stub
		System.out.println("����ʵ��");
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
