package jdbcTest;

import java.sql.*;

public class TestOne {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String DRIVER="oracle.jdbc.driver.OracleDriver";//�����ַ���
		String URL="jdbc:oracle:thin:@222.25.2.37:1521:orcl";//�����ַ���
		String USER="GY";
		String PWD="GY";
		
		long start = System.currentTimeMillis();
		Class.forName(DRIVER);//��������
		Connection con = DriverManager.getConnection(URL,USER,PWD);//�������
		long end = System.currentTimeMillis();
		System.out.println("����ʱ��"+(end-start)+"����");
		
		
		long start1 = System.currentTimeMillis();
		//��ѯ
//		String sql="select * from emp";
//		PreparedStatement pstmt=con.prepareStatement(sql);//����һ��PreparedStatement����,ִ�в�ѯ SQL��DQL�����  
//		
//		ResultSet rs=pstmt.executeQuery();//�ӷ��ص�ResultSet�����м�������,���Ƶ�����
//		while(rs.next()){
//			System.out.println("Ա����ţ�"+rs.getString("EMPNO"));
//			System.out.println("Ա��������"+rs.getString("ename"));
//			System.out.println("Ա��ְ��"+rs.getString("JOB"));
//			System.out.println("Ա��н�ʣ�"+rs.getString("sal"));
//			System.out.println("���ű�ţ�"+rs.getString("DEPTNO"));
//		}
//		rs.close();
//		pstmt.close();
		
		//�޸�
//		String sql2="update emp set sal=sal-10 where empno=7369";
//		PreparedStatement pstmt2=con.prepareStatement(sql2);
//		int i2 = pstmt2.executeUpdate();
//		if(i2==1){
//			System.out.println("�޸ĳɹ�");
//		}else{
//			System.out.println("�޸�ʧ��");
//		}
//		pstmt2.close();
		//����
//		int empno=7888;
//		String ename="����";
//		String job="�ۻ�Ա";
//		int deptno=30;
//		                                                     
//		String sql3="insert into emp(empno,ename,job,deptno) values("+empno+",'"+ename+"','"+job+"',"+deptno+")";
//		PreparedStatement pstmt3 = con.prepareStatement(sql3);
//		int i3 = pstmt3.executeUpdate();
//		if(i3==1){
//			System.out.println("����ɹ�");
//		}else{
//			System.out.println("����ʧ��");
//		}
//		pstmt3.close();
     	//����
//		int empno=1111;
//		String ename="����";
//		String job="�ۻ�Ա";
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
//			System.out.println("����ɹ�");
//		}else{
//			System.out.println("����ʧ��");
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
//		System.out.println("�ɹ�����"+res.length+"��");
//		con.close();
		
		String sql5="delete from emp where empno>=9000";
		PreparedStatement pstmt5=con.prepareStatement(sql5);
		int i5 = pstmt5.executeUpdate();
		if(i5>=1){
			System.out.println("ɾ���ɹ�"+i5+"��");
		}else{
			System.out.println("ɾ��ʧ��");
		}
		System.out.println(i5);
		pstmt5.close();
		con.close();
		
		
		long end1 = System.currentTimeMillis();
		System.out.println("1����ʱ��"+(end1-start1)+"����");
	}
}
