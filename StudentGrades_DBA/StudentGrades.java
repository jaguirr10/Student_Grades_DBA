
import java.util.Random;
import java.util.Arrays;

 
public class StudentGrades {

private int [] grades;
 private int numOfStudents=0;
 int Temp;
 
 //Random R = new Random(); 
  
 public StudentGrades(int value)
    {
   
    grades = new int [value];
    for(int i = 0; i< grades.length;i++)
    {
      grades[i]= (int)(Math.random()*101);
      numOfStudents++;
      }
      }
  
  public void setGrades(int [] array)
  {
  numOfStudents =0;
  grades = new int [array.length];
   for(int count = 0;count<array.length;count++)
   {
      
    grades[count] = array[count];
    numOfStudents++;
    }
  }
   
   
  public int[] getgrades()
  {
    return grades;
  }
  
  public double average()
  {
  double sum = 0;
  for (int i = 0; i<grades.length; i++)
  {
   sum = sum + grades[i];
  }
   double average;
  
  average = sum/grades.length;
  
   return average;
  }
  
  
  public String toString()
  {
  String temp= "";
  for(int i=0; i<numOfStudents; i++)
  {
   temp += " " + grades[i] + " ";
   
   }
   return (temp += '\n');
  }//end tostring
  
  
  public int [] sort_array()
  {
  int [] temparray = new int[grades.length];
  for(int i=0; i<grades.length;i++){
   temparray[i] = grades[i];
   }
   
  int Temp=temparray[0];  
    for( int counter = 0; counter<(temparray.length-1);counter++)
    for(int index = 0;index<(temparray.length-1);index++)
     {
      if(temparray[index]>temparray[index+1])
        {
         Temp = temparray[index+1];
         temparray[index + 1] = temparray[index];
         temparray[index] = Temp;
         //grades = Temp;
         }
     }
     return temparray;
   }//end of sort_array
  
 
  public int median()
  {
       
    int [] temp=sort_array();
    
     return temp[temp.length/2];
  }//end of median
 
 public boolean equals(Object o) {
   if (!(o instanceof StudentGrades)) {
   return false;
   } else {
   StudentGrades objStudentGrades = (StudentGrades) o;
   if (numOfStudents == objStudentGrades.numOfStudents) {
   return true;
   } else {
           
            if(grades.length!= objStudentGrades.grades.length)
            {
            
      return false;
      }
      }
    } 
   return true;
 }
    
 
  public int HighestGrade()
  {
   int Highest = 0;
   int maxIndex =0;
   for( int i = 1;i<grades.length;i++)
   {
     if (grades[i]>grades[maxIndex])
        //return maxIndex;
        maxIndex = i;
       }
       return grades[maxIndex];
       }
       
      
   
   
  public int LowestGrade()
  {
   int minIndex =0;
   for( int i = 1;i<grades.length;i++)
   {
     if (grades[i]<grades[minIndex])
        minIndex = i;
        
  }
  return grades[minIndex];
  }
  
 public int mode()
 {
   int maxValue = 0;
   int maxCount = 0;
   int count =0;
   for (int i = 0; i <grades.length; ++i)
   {
      
      for (int j = 0; j <grades.length; ++j)
      {
     
       if (grades[i] == grades[j])
          ++count;
    
    if (count > maxCount) 
    {
        maxCount = count;
        maxValue = grades[i];
    }
   }
  }//end mode
  return maxValue;
} 


}
   

