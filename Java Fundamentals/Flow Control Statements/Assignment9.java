
public class Assignment9 {

	public static void main(String[] args) {
		
		int month = Integer.parseInt(args[0]);
		String monthstr="";
		switch(month){   
		
        case 1: monthstr = "January";  
        break;  
        case 2: monthstr = "February";  
        break;  
        case 3: monthstr = "March";
        break;  
        case 4: monthstr = "April"; 
        break;  
        case 5: monthstr = "May"; 
        break;
        case 6:monthstr = "June"; 
        break;  
        case 7: monthstr = "July";
        break;  
        case 8: monthstr = "August";
        break;  
        case 9: monthstr = "September"; 
        break;  
        case 10: monthstr = "October"; 
        break;
        case 11: monthstr = "November";
        break;  
        case 12: monthstr = "December";  
        break;
        default:System.out.println("Invalid month");  
        }
		System.out.println(monthstr);
		
	}

}
