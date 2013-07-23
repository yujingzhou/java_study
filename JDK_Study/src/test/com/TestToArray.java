package test.com;

import java.util.Collection;
import java.util.LinkedList;

public class TestToArray {
	public static void main(String[] args) {
//		Collection<String> collection = new LinkedList<String>();
//		collection.add("a");
//		collection.add("b");
//		String []strings = new String[collection.size()];
//		collection.toArray(strings);
//		System.out.println(strings[0] + ":" + strings[1]);
	    String str = "你在哪";
//	    while(true){
//	        int i = str.indexOf("{");
//	        int j = str.indexOf("}");
//	        if(i>=0 && j>=0 && j>i){
//	           str=str.substring(0,i)+str.substring(j + 1, str.length());
//	        }else{
//	           break;
//	        }
//	    }
//	    System.out.println(str);
//	    System.out.println(str.substring(0, 1));
	    byte bt[] = "你好asd好fasdfas".getBytes();
	    int j = 0;
	    for (int i = 0; i < bt.length; i++) {
	        if(bt[i]<0){
	            i+=2;
	            j++;
	        }else{
	            j++;
	        }
        }
	    System.out.println(j);
	}
}
