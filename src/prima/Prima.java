/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prima;

/**
 *
 * @author fauhan.pugar
 */
public class Prima {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args)
    {		
        primaFor();
        primaWhile();
    }
    
    public static void primaFor(){
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        for (i = 1; i <= 110; i++)         
        { 		  	  
           int counter=0; 	  
           for(num =i; num>=1; num--)
           {
              if(i%num==0)
              {
                 counter = counter + 1;
              }
           }
           if (counter ==2)
           {
              //Appended the Prime number to the String
              primeNumbers = primeNumbers + i + " ";
           }	
        }	
        System.out.println("Bilangan Prima dari 1 sampai 100 adalah :");
        System.out.println(primeNumbers);
    }
    
    public static void primaWhile(){
        int i =0;
        int num =0;
        //Empty String
        String  primeNumbers = "";

        while(i <= 110)   
        { 		  	  
           int counter=0; 	  
           for(num =i; num>=1; num--)
           {
              if(i%num==0)
              {
                 counter = counter + 1;
              }
           }
           if (counter ==2)
           {
              //Appended the Prime number to the String
              primeNumbers = primeNumbers + i + " ";
           }
           ++i;
        }	
        System.out.println("Bilangan Prima dari 1 sampai 100 adalah :");
        System.out.println(primeNumbers);
    }
    
}
