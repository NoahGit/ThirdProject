package deom01;

public class UserDAOImpl implements UserDAO{

	@Override
	public boolean deleteById(int id) {
		System.out.println("模拟通过id删除信息！");
		return true;
	}

}
