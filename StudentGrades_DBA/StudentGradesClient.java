import java.util.Random;

public class StudentGradesClient
{
public static void main(String [] args)
 {
 int test [] = {90,100,55,60,70,65,80};
 
 
  StudentGrades g1 =  new StudentGrades(test.length); //create object g1 call constructor
   StudentGrades g2 =  new StudentGrades(8);//create object g2 call constructor
   
   System.out.println("this is g1: ");
   int [] tempgrades = g1.getgrades();
   tempgrades = g1.sort_array();
   
   for (int i=0; i<tempgrades.length;i++)
     System.out.print(tempgrades[i]+" ");
     
     System.out.println();
   
   System.out.println("this is g2: ");
   int [] tempgrades2 = g1.getgrades();
   tempgrades2 = g2.sort_array();
   
   for (int i=0; i<tempgrades2.length;i++)
     System.out.print(tempgrades2[i]+" ");
     
     System.out.println();
     
   System.out.println("The highest grade for g1 is " + g1.HighestGrade());
  
   System.out.println("The lowest grade for g1 is " + g1.LowestGrade());
   
      
    //g2.setgrades;
   
    //g2.getgrades;
  
   System.out.println(" The  average grade is for g2: "+ g2.average());
   
   System.out.println("The mode grade for g2 is " + g2.mode());
   
    System.out.println("The median grade for g2 is " + g2.median());
    
     if (g1.equals(g2)){
     System.out.println("g1 and g2 are equal");
    }//end if 
    else{ 
      System.out.println("g1 and g2 are not equal");
             
        

       int []grades = new int [8];
          
          g1.setGrades(grades);
     
     if (g1.equals(g2)){
     System.out.println("g1 and g2 are equal");
    }//end if 
    else{ 
      System.out.println("g1 and g2 are not equal");

     
      
     System.out.println (g1.toString());
     
      

     
     }//end else
     System.out.println("Coded by Juan Aguirre");

    }
   }
  }
 

