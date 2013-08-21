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
		
		//format
		String t = String.format("%1$d%%", 10);
		System.out.println(t);
		System.out.println(System.getProperty("line.separator"));
		
		String temp = "abcd";
		System.out.println(temp.codePointAt(2));
		String old = "5.12.2".replaceAll("\\.", "");
		String ok = "5.9.1".replaceAll("\\.", "");
		System.out.println(old);
		System.out.println(ok);
		
		System.out.println(old.compareTo(ok));
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
