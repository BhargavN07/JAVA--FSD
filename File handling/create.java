package AssistedPracticeProject;


	import java.io.File;
	import java.io.BufferedReader;
	  
	// Importing as it converts bits to strings
	import java.io.InputStreamReader;
	  
	public class create {
	  
	  
	    public static void main(String args[])
	    {
	       
	    	create temp = new create();
	        temp.newFile();
	    }
	  
	   
	    public void newFile()
	    {
	        String strPath = "", strName = "";
	  
	       
	        try {
	  
	            
	            BufferedReader br = new BufferedReader(
	                new InputStreamReader(System.in));
	            System.out.println("Enter the file name:");
	  
	          
	            strName = br.readLine();
	            System.out.println("Enter the file path:");
	  
	           
	            strPath = br.readLine();
	  
	           
	            File file1
	                = new File(strPath + "" + strName + ".txt");
	  
	          
	            file1.createNewFile();
	        }
	  
	       
	        catch (Exception ex1) {
	        }
	    }
	}
