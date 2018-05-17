package comm;
import java.sql.*;
public class BaseDAO {
	//1���������ݿ��������Ҫ���ַ���
	public final String DRIVER="oracle.jdbc.driver.OracleDriver";
	public final String URL="jdbc:oracle:thin:@222.25.2.37:1521:orcl";
	public final String USER="GY";
	public final String PWD="GY";
	
	public Connection con;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	/**
	 * �������
	 * @return �������Ӷ���
	 */
	public Connection getConnection(){
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("���������쳣��");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL,USER,PWD);
		} catch (SQLException e) {
			System.out.println("��������쳣��");
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * �ر���������
	 */
	public void closeAll(){
		if(null!=rs){
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("�ر�rs�쳣��");
				e.printStackTrace();
			}
		}
		if(null!=pstmt){
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("�ر�pstmt�쳣");
				e.printStackTrace();
			}
		}
		try {
			if(null!=con && (!con.isClosed())){
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("con�ر��쳣����con�Ѿ��رչ���");
			e.printStackTrace();
		}
	}
	/**
	 * ִ��select���
	 * @param sqlҪִ�е�select��ѯ���
	 * @param values��ѯ����У�������ֵ�б�
	 * @return ���ؽ����
	 */
	public ResultSet executeQuery(String sql, Object[] values){
		getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			if(null!=values && values.length>0){
				for(int i=0; i<values.length; i++){
					pstmt.setObject(i+1, values[i]);
				}
			}
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return rs;
	}
	/**
	 * ִ��update,delete,insert���
	 * @param sqlҪִ�е�dml���
	 * @param values ����У�ռλ����ֵ�б�
	 * @return ������Ӱ������
	 */
	public int executeUpdate(String sql, Object[] values){
		int result = 0;
		getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			if(null!=values && values.length>0){
				for(int i=0; i<values.length; i++){
					pstmt.setObject(i+1, values[i]);
				}
			}
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			this.closeAll();
		}
		return result;
	}
	
}
