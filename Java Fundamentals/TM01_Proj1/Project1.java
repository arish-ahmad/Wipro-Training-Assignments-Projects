public class Project1 {
	
	public static void main(String[] args) {
		 String[][] database ={
			 {"Emp no", "Emp name", "Join Date", "Designation code", "Department", "Basic","HRA", "IT"},
			 {"1001", "Ashish", "01/04/2009", "e", "R&D"          , "20000", "8000" , "3000"},
			 {"1002", "Sushma", "23/08/2009", "c", "PM"           , "30000", "12000", "9000"},
			 {"1003", "Rahul" , "12/11/2008", "k", "Acct"         , "10000", "8000" , "1000"},
			 {"1004", "Chahat", "29/01/2013", "r", "Front Desk"   , "12000", "6000" , "2000"},
			 {"1005", "Ranjan", "16/07/2005", "m", "Engg"         , "50000", "20000", "20000"},
			 {"1006", "Suman" , "1/1/2000"  , "e", "Manufacturing", "23000", "9000" , "4400"},
			 {"1007", "Tanmay", "12/06/2006", "c", "PM"           , "29000", "12000", "10000"},	 
		 };
		 String[][] DA_database= {
				 {"Designation code","Designation", "DA"},
				 {"e", "Engineer"    , "20000"},
				 {"c", "Consultant"  , "32000"},
				 {"k", "Clerk"       , "12000"},
				 {"r", "Receptionist", "15000"},
				 {"m", "Manager"     , "40000"},
		 };
		 //checking the given employee is present in database or not
		 boolean found = false;
		 for(int i = 1 ; i< database.length; i++) {
				 if (Integer.parseInt(args[0]) == Integer.parseInt(database[i][0]))
					 found = true; 	 
		 };
		 if (found == false)
			 System.out.println("There is no employee with empid "+args[0]);	
		 else
			 Employee_info(database,DA_database,args);
	}

	private static void Employee_info(String[][] d1, String[][] d2,String[] args) {
		
		// fetch employee data in new array from database
		String[] EmpData = new String[8];
		for(int i = 1 ; i< d1.length; i++) {
			if (Integer.parseInt(args[0]) == Integer.parseInt(d1[i][0])) {
				for(int j = 0 ; j< d1[i].length; j++) {
					EmpData[j] = d1[i][j];
				}
			}
		}
		// create array to display employee data
		String[][] display_EmpData = {
				{"Emp no"  , "Emp name", "Department"       , "Designation", "Salary"},
				{EmpData[0], EmpData[1], EmpData[4]         , ""           , ""},
		};
		String Designation_code = EmpData[3]; 
	    switch(Designation_code){   
	    case "e": 
	    	display_EmpData[1][3] = DA_info(d2,EmpData,"e")[0];
	    	display_EmpData[1][4]= DA_info(d2,EmpData,"e")[1];
	    	
	    break;  
	    case "c":
	    	display_EmpData[1][3] = DA_info(d2,EmpData,"c")[0];
	    	display_EmpData[1][4]= DA_info(d2,EmpData,"c")[1];  
	    break;  
	    case "k":
	    	display_EmpData[1][3] = DA_info(d2,EmpData,"k")[0];
	    	display_EmpData[1][4]= DA_info(d2,EmpData,"k")[1];
	    break;
	    case "r":
	    	display_EmpData[1][3] = DA_info(d2,EmpData,"r")[0];
	    	display_EmpData[1][4]= DA_info(d2,EmpData,"r")[1];
	    break;
	    case "m":
	    	display_EmpData[1][3] = DA_info(d2,EmpData,"m")[0];
	    	display_EmpData[1][4]= DA_info(d2,EmpData,"m")[1];
	    break; 
	    default:System.out.println("Designation not found");  
	    } 
	    //Displaying employee data
	    
	    for ( int k = 0 ; k<2 ; k++) {
		System.out.format("%s \t %20s \t %15s \t %15s \t %15s\n",
	    		display_EmpData[k][0],
	    		display_EmpData[k][1],
	    		display_EmpData[k][2],
	    		display_EmpData[k][3],
	    		display_EmpData[k][4]);
	    }
	    System.out.println();
	}
	// This method maped the designation code with Database and return the designation and the salary of employee
	private static String[] DA_info(String[][] d2, String[] edata, String dcode) {
		String[] temp = new String[2];
		for(int i = 1; i< d2.length; i++) {
    		if (d2[i][0] == dcode) {   
    			temp[0] = d2[i][1];  //designation
    			int salary = Integer.parseInt(edata[5])+Integer.parseInt(edata[6])+Integer.parseInt(d2[i][2])-Integer.parseInt(edata[7]);
    			temp[1] = String.valueOf(salary);  // salary
    		}
    	}
		return temp;
	}

}
