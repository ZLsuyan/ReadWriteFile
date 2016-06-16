package readWriteFile;
import java.io.*;

public class ReadWriteFile {
	        
	  public static String readToString(File file) {
		  Long filelength = file.length();     //获取文件长度
		  byte[] filecontent = new byte[filelength.intValue()];
	      try {
	    	  FileInputStream fistream = new FileInputStream(file);
	    	  fistream.read(filecontent);
	    	  fistream.close();
	      } catch (FileNotFoundException e) {
	          e.printStackTrace();
	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	      return new String(filecontent);//返回文件内容,默认编码
	  }
	  
	  public static void append(File file, String appendcontent) {
	        try {
	            //打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
	            FileWriter fw = new FileWriter(file, true);
	            for(int i=0;i<2;i++){
	            	fw.write(appendcontent);
	            }
	            //fw.write(appendcontent);
	            fw.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	  
	  public static void main(String[] args)throws IOException {
		  File file= new File("F:/test.txt");
		  String appendcontent = "\nthis is a added line.\n" ;
		  append(file, appendcontent);
		  System.out.println(readToString(file));
	  }
	  
}



	       

