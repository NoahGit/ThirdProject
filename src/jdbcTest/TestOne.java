package jdbcTest;

import java.sql.*;

public class TestOne {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String DRIVER="oracle.jdbc.driver.OracleDriver";//驱动字符串
		String URL="jdbc:oracle:thin:@222.25.2.37:1521:orcl";//连接字符串
		String USER="GY";
		String PWD="GY";
		
		long start = System.currentTimeMillis();
		Class.forName(DRIVER);//加载驱动
		Connection con = DriverManager.getConnection(URL,USER,PWD);//获得连接
		long end = System.currentTimeMillis();
		System.out.println("共耗时："+(end-start)+"毫秒");
		
		
		long start1 = System.currentTimeMillis();
		//查询
//		String sql="select * from emp";
//		PreparedStatement pstmt=con.prepareStatement(sql);//分配一个PreparedStatement对象,执行查询 SQL（DQL）语句  
//		
//		ResultSet rs=pstmt.executeQuery();//从返回的ResultSet对象中检索数据,类似迭代器
//		while(rs.next()){
//			System.out.println("员工编号："+rs.getString("EMPNO"));
//			System.out.println("员工姓名："+rs.getString("ename"));
//			System.out.println("员工职务："+rs.getString("JOB"));
//			System.out.println("员工薪资："+rs.getString("sal"));
//			System.out.println("部门编号："+rs.getString("DEPTNO"));
//		}
//		rs.close();
//		pstmt.close();
		
		//修改
//		String sql2="update emp set sal=sal-10 where empno=7369";
//		PreparedStatement pstmt2=con.prepareStatement(sql2);
//		int i2 = pstmt2.executeUpdate();
//		if(i2==1){
//			System.out.println("修改成功");
//		}else{
//			System.out.println("修改失败");
//		}
//		pstmt2.close();
		//插入
//		int empno=7888;
//		String ename="张三";
//		String job="售货员";
//		int deptno=30;
//		                                                     
//		String sql3="insert into emp(empno,ename,job,deptno) values("+empno+",'"+ename+"','"+job+"',"+deptno+")";
//		PreparedStatement pstmt3 = con.prepareStatement(sql3);
//		int i3 = pstmt3.executeUpdate();
//		if(i3==1){
//			System.out.println("插入成功");
//		}else{
//			System.out.println("插入失败");
//		}
//		pstmt3.close();
     	//插入
//		int empno=1111;
//		String ename="李四";
//		String job="售货员";
//		int deptno=30;
//		                                                     
//		String sql3="insert into emp(empno,ename,job,deptno) values(?,?,?,?)";
//		PreparedStatement pstmt3 = con.prepareStatement(sql3);
//		pstmt3.setObject(1, empno);
//		pstmt3.setObject(2, ename);
//		pstmt3.setObject(3, job);
//		pstmt3.setObject(4, deptno);
//		
//		int i3 = pstmt3.executeUpdate();
//		if(i3==1){
//			System.out.println("插入成功");
//		}else{
//			System.out.println("插入失败");
//		}
//		pstmt3.close();
		
//		String proc_str="{call TEST_PROCEDURE}";
//		CallableStatement cs = con.prepareCall(proc_str);
//		cs.execute();
//		cs.close();
//		con.close();
		
//		String sql4="insert into emp(empno,ename) values(?,?)";
//		PreparedStatement pstmt4=con.prepareStatement(sql4);
//		for(int i=9000;i<=9100;i++){
//			pstmt4.setObject(1, i);
//			pstmt4.setObject(2, "user"+i);
//			pstmt4.addBatch();
//		}
//		int[] res=pstmt4.executeBatch();
//		System.out.println("成功插入"+res.length+"行");
//		con.close();
		
		String sql5="delete from emp where empno>=9000";
		PreparedStatement pstmt5=con.prepareStatement(sql5);
		int i5 = pstmt5.executeUpdate();
		if(i5>=1){
			System.out.println("删除成功"+i5+"行");
		}else{
			System.out.println("删除失败");
		}
		System.out.println(i5);
		pstmt5.close();
		con.close();
		
		
		long end1 = System.currentTimeMillis();
		System.out.println("1共耗时："+(end1-start1)+"毫秒");
	}
}
