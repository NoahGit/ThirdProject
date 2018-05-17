package comm;
import java.sql.*;
public class BaseDAO {
	//1、创建数据库操作所需要的字符串
	public final String DRIVER="oracle.jdbc.driver.OracleDriver";
	public final String URL="jdbc:oracle:thin:@222.25.2.37:1521:orcl";
	public final String USER="GY";
	public final String PWD="GY";
	
	public Connection con;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	/**
	 * 获得连接
	 * @return 返回连接对象
	 */
	public Connection getConnection(){
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println("加载驱动异常！");
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(URL,USER,PWD);
		} catch (SQLException e) {
			System.out.println("获得连接异常！");
			e.printStackTrace();
		}
		return con;
	}
	/**
	 * 关闭所有连接
	 */
	public void closeAll(){
		if(null!=rs){
			try {
				rs.close();
			} catch (SQLException e) {
				System.out.println("关闭rs异常！");
				e.printStackTrace();
			}
		}
		if(null!=pstmt){
			try {
				pstmt.close();
			} catch (SQLException e) {
				System.out.println("关闭pstmt异常");
				e.printStackTrace();
			}
		}
		try {
			if(null!=con && (!con.isClosed())){
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("con关闭异常或者con已经关闭过了");
			e.printStackTrace();
		}
	}
	/**
	 * 执行select语句
	 * @param sql要执行的select查询语句
	 * @param values查询语句中？参数的值列表
	 * @return 返回结果集
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
	 * 执行update,delete,insert语句
	 * @param sql要执行的dml语句
	 * @param values 语句中？占位符的值列表
	 * @return 返回受影响行数
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
