package test.com;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 
 *     bo.yu
 * @email
 *     bo.yu@renren-inc.com
 * @time
 *     2012-7-17 下午12:20:39
 */
public class StringStady {
	
	private String init;
	
	public static void main(String[] args) {
		StringStady stringStady = new StringStady();
		stringStady.testForSplit();
		try {
			DataInput di = new DataInputStream(new FileInputStream(new File("")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * split测试
	 */
	public void testForSplit(){
		this.setInit("adsfasd,fasdfasd,fasdfasdfasdfa");
		System.out.println(this.getInit().split(",").length);
		
		
	}
	
	public String getInit(){
		return this.init;
	}
	
	public void setInit(String init){
		this.init = init;
	}

}
