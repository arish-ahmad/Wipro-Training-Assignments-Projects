
public class Assignment13 {

	public static void main(String[] args) {
		int i,j,counter=0;
        System.out.print("Prime number between 10 to 99 are : ");
        
        for(i=10;i<=99;i++)
        {
           for(j=1;j<=i;j++)
           {
             if(i%j==0)
               counter++;
           }
           if(counter==2)
             System.out.print(" "+i);
           counter=0;
        }

	}

}
