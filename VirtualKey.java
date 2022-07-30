package Phase1Project;


		import java.io.File;
		import java.io.FileReader;
		import java.io.IOException;
		import java.util.Arrays;
		import java.util.Scanner;

		public class VirtualKey {
			File folder=new File("C:\\Users\\Bhargav\\OneDrive\\Desktop\\Phase1 Project");
			public VirtualKey(){
				if(folder.exists()) {
					folder.mkdirs();
				System.out.println("Directory =>"+folder.getAbsolutePath()+"\n");
				}
			}
			 void showFiles() {
				if(folder.list().length==0) {
					System.out.println("The folder is empty");
				}else {
					String [] list=folder.list();
					System.out.println("Current Files in "+folder+" as ascending order:");
					Arrays.sort(list);
					for(String a:list) {
						System.out.println(a);
					}
					
					
				}
				
			}
			void addFile(String Filename) throws IOException {
				File new_one= new File(folder, Filename);
				String[] a=folder.list();
				for(String b:a) {
					if(Filename.equalsIgnoreCase(b)){
						System.out.println("File already exists");
						return;
					}
				}
				new_one.createNewFile();
				System.out.println("File Added to the Folder");
				
			}
			void delFile(String DelFile) {
				File del_one =new File(folder, DelFile);
				String a[]=folder.list();
				for(String b:a ) {
					if(DelFile.equals(b)&&del_one.delete()) {
						System.out.println("File Deleted Successfully");
						return;
					}
				}
				System.out.println("File Not Found - FNF");
			}
			void searchFile(String Search) throws IOException {
				String a[]=folder.list();
				for(String b:a) {
					if(Search.equals(b)) {
						System.out.println("File exists at "+folder);
						System.out.println("Contents in the file:");
						File search_one=new File(folder, Search);
						FileReader c= new FileReader(search_one);
						int data;
						while((data=c.read())!=-1) {
							System.out.print((char)data);
						}
						c.close();
						return;
					}
				}
				System.out.println("File Not Found - FNF");	
			}
			
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("\n**************************************\n");
				System.out.println("Welcome to the Virtual repositories\n");
				System.out.println("\t\t-Developed By Bhargav N\n");
				 System.out.println("**************************************");
				
				VirtualKey obj = new VirtualKey();
				while(true) {
				    System.out.println("");
			                System.out.println("Following are the operations to be performed \n");
		            	    System.out.println("1. To display the current files in ascending order\n");
		         		    System.out.println("2. Business Level Operation menu \n");
		           		    System.out.println("3. Terminate Program\n");
		            	    System.out.println("Enter your choice: \n");
		            
		            
		            int choice=sc.nextInt();
		            switch(choice) {
		            
		            case 1:
		            	obj.showFiles();
		            	break;
		            	
		            case 2:
		            	Boolean temp= true;
		            	while(temp) {
		            	     System.out.println("");
		                             System.out.println("Option 1 : To Add a file in the existing Directory");
		                    System.out.println("Option 2 : To Delete a file from the existing Directory. ");
		                    System.out.println("Option 3 : To Search a user specified file from the Directory");
		                    System.out.println("Option 4 : Back to the previous menu");
		                    
		                    int option =sc.nextInt();
		                    switch(option) {
		                    case 1:
		                    	System.out.println("Enter the FileName to add:");
		                    	String Filename=sc.next();
		                    	try {
					obj.addFile(Filename);
				} catch (IOException e) {
					System.out.println("Error Occured: "+e);
				}
		                    	break;
		                    case 2:
		                    	System.out.println("Enter the fileName to delete: ");
		                    	String DelFile = sc.next();
		                    	obj.delFile(DelFile);
		                    	break;
		                    case 3:
		                    	System.out.println("Enter the fileName to search: ");
		                    	String Search=sc.next();
		                    	try {
					obj.searchFile(Search);
				} catch (IOException e) {
					System.out.println("Error Occured: "+e);
				}
		                    	break;
		                    case 4:
		                    	temp=false;
		                    	break;
		                    default:
		                    	System.out.println("Invalid Choice ! Enter the correct choice :\n");
		                    	break;
		                    	
		                    	
		                    }   
		            	}
		            	break;
		            case 3:
		            	System.out.println("Progam Terminated.....Thank you!");
		            	System.exit(0);
		            default:
		            	System.out.println("Invalid Choice ! Enter the correct choice :\n");
		            
		            }
		            
		            
				}
				
			}
			
		}

