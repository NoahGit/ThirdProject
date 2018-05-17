package jdbcTest;

import java.sql.ResultSet;
import java.sql.SQLException;

import comm.BaseDAO;

public class TestTwo {
	BaseDAO bd = new BaseDAO();
	/**
	 * ��ҳ��ѯ
	 * @param pageNo ָ��Ҫ��ѯ��ҳ��
	 * @param rowPerPage ָ��ÿҳ��ʾ������
	 */
	
	public void findEmpByPage(int pageNo, int rowPerPage){
		int end = pageNo*rowPerPage; //������ ����ǰҳ��*ÿҳ��ʾ������
		int start = (pageNo-1)*rowPerPage; //��ʼ������
		
		String sql_p = "select empno,ename,job,sal from "
				+ "(select A.*,rownum r from "
				+ "(select empno,ename,job,sal from emp order by empno)"
				+ " A where rownum<=?)"
				+ " where r>?";
		Object[] values_p = {end,start};
		ResultSet rs_p = bd.executeQuery(sql_p, values_p);
		try {
			while(rs_p.next()){
				System.out.println(rs_p.getString("empno"));
				System.out.println(rs_p.getString("ename"));
				System.out.println(rs_p.getString("job"));
				System.out.println(rs_p.getString("sal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			bd.closeAll();
		}
	}
	
	
	
	
	public static void main(String[] args) {
		TestTwo tt = new TestTwo();
		tt.findEmpByPage(2,5);
		/*
		//�޸�
		int empno2 = 1111;
		String ename2 = "o";
		String job2 = "sales";
		int sal2 = 3000;
		String sql2 = "insert into emp(empno,ename,job,sal) values(?,?,?,?)";
		Object[] values2 = {empno2,ename2,job2,sal2};
		int i2 = bd.executeUpdate(sql2, values2) ;
		if(i2>0){
			System.out.println("��ӳɹ�"+i2+"��");
		}else{
			System.out.println("���ʧ��"+i2);
		}
		//��ѯ
		int empno = 7500;
		int sal = 1300;
		String sql = "select * from emp where empno>? and sal>?";
		Object[] values = {empno,sal};
		ResultSet rs = bd.executeQuery(sql, values);
		try {
			while(rs.next()){
				System.out.println(rs.getString("empno")+"/"+rs.getString("sal"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			bd.closeAll();
		}
		//ɾ��
		int empno_1 = 8888;
		int empno_2 = 9999;
		int empno_3 = 1111;
		String sql3 = "delete from emp where empno=? or empno=? or empno=?";
		Object[] values3 = {empno_1,empno_2,empno_3};
		int i3 = bd.executeUpdate(sql3, values3);
		if(i3>0){
			System.out.println("ɾ����"+i3+"��");
		}else{
			System.out.println("ɾ��ʧ��"+i3);
		}
		*/
		/*
		String sql4 = "select count(*) from emp where deptno=10";
		ResultSet rs = bd.executeQuery(sql4, null);
		try {
			while(rs.next()){
				int count = rs.getInt(1);//���ڸò�ѯû������������ʹ��1�����һ��
				System.out.println("Ա������Ϊ��"+count);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			bd.closeAll();
		}
		*/
		
		
	}
}
