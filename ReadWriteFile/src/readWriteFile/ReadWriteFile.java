package readWriteFile;
import java.io.*;

public class ReadWriteFile {
	        
	  public static String readToString(File file) {
		  Long filelength = file.length();     //��ȡ�ļ�����
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
	      return new String(filecontent);//�����ļ�����,Ĭ�ϱ���
	  }
	  
	  public static void append(File file, String appendcontent) {
	        try {
	            //��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
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



	       

