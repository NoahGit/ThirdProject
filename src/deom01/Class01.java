package deom01;

import org.apache.log4j.Logger;
import org.jaudiotagger.Test;

public class Class01 {
	
	Logger rootLogger=Logger.getRootLogger();
	Logger myLogger=Logger.getLogger("mylogger");
	//log4j.logger.ThirdProject =   DEBUG,A1;
	public void test(int a,int b){
		Logger logger = Logger.getLogger(Test.class);
		logger.debug("����test����");
		try {
			if(a==0){
				logger.warn("0�����κ�������0��");
			}
			int c=a/b;
			logger.info("ִ�н����"+c);
		} catch (Exception e) {
			logger.error("ִ��test���������쳣��"+e.getMessage(),e);
		}
		logger.debug("test��������");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class01 c1 =new Class01();
		c1.test(0, 0);
		try {
			int i = 1 ;System.out.println("i = "+i);
			int j = i++ ;System.out.println("i = "+i);
			if((i==(++j))&&((i++)==j)){
				i += j ;System.out.println("i = "+i);
			}
			System.out.println("i = "+i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
