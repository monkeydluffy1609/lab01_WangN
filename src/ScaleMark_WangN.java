// You will modify this program to show the ranges of different grades.

import java.io.*;
  
public class ScaleMark_WangN{
  
  public static void main (String[] args){
    InputStreamReader stdin = new InputStreamReader(System.in);
    BufferedReader bfReader = new BufferedReader(stdin);
    
    int mark;
    String grade;
    String mark_input;
    
    try {
      System.out.println ("Enter your mark: ");
      mark_input = bfReader.readLine();
      mark = Integer.parseInt(mark_input);
      
      ScaleMark_WangN smObj = new ScaleMark_WangN();
      grade = smObj.scale(mark);
      System.out.println("Your final grade is: " + mark + ", " + grade + ".");
    } catch (java.io.IOException e) {
      System.out.println(e);
    }
      
  }
    
  
  public String scale(int aMark){
    String grade = null;
    if(aMark >= 90){
      grade = "A";
      }
    else if(aMark >= 80){
      grade = "B";
    }
    else if(aMark >= 70){
      grade = "C";
    }
    else if(aMark >= 60){
      grade = "D";
    }
    else {
      grade = "F";
    }

    return grade;
  }
}
    