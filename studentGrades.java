import java.io.*;
import java.util.*;

public class studentGrades 
{
	//Please ignore this part of the program, it was just to see if my methods were working. SO
	// I will import the correct file in class and rewrite for however many lines, etc. JN
	public static void main(String[] args) throws IOException
	{
		
		
				
		double grade1;
		double grade2;
		double grade3;
		
		
		String letterGrade;
		String studentName;
		String studentGrades = null;
		
		int lineNumber = 0;
		
		File studentGradeRep = new File("studentGradeSheet.txt");
		Scanner inputFile = new Scanner(studentGradeRep);
		
		while (inputFile.hasNext())
		{
			studentGrades = inputFile.nextLine();
			lineNumber++;
			System.out.println(lineNumber + " " + studentGrades +"\n");
		}
			do
			{
				studentName = "Jason N";
				grade1 = 85;
				grade2 = 92;
				grade3 = 86;
				letterGrade = letterGrade(grade1, grade2, grade3);
				System.out.println("Letter grade for " + studentName + " is " + letterGrade + ".");
				lineNumber++;
			}
			while (lineNumber ==2);
			
			
			do
			{
				studentName = "Sean O";
				grade1 = 98;
				grade2 = 93;
				grade3 = 97;
				letterGrade = letterGrade(grade1, grade2, grade3);
				System.out.println("Letter grade for " + studentName + " is " + letterGrade + ".");
				lineNumber++;
			}
			while (lineNumber ==4);
			
			do
			{
				studentName = "Jesse C";
				grade1 = 85;
				grade2 = 75;
				grade3 = 70;
				letterGrade = letterGrade(grade1, grade2, grade3);
				System.out.println("Letter grade for " + studentName + " is " + letterGrade + ".");
				lineNumber++;
			}
			while (lineNumber ==6);

			do
			{
				studentName = "Extra S";
				grade1 = 60;
				grade2 = 65;
				grade3 = 61;
				letterGrade = letterGrade(grade1, grade2, grade3);
				System.out.println("Letter grade for " + studentName + " is " + letterGrade + ".");
				lineNumber++;
			}
			while (lineNumber ==8);
	}
	



	/**
	 * 
	 * @param g1 The first grade in double.
	 * @param g2 The second grade in double.
	 * @param g3 The third grade in double.
	 * @return finalGrade The final grade that takes 20% of the first grade, 30% of the second grade, and 50% of the third grade. Returns a String.
	 */
	public static String letterGrade(double g1, double g2, double g3)
	{
		double finalNumGrade;
		String finalGrade;
		finalNumGrade = (g1 * 0.2) + (g2 * 0.3) + (g3 * 0.5);
		
		if(finalNumGrade >= 92)
		{
			finalGrade = "A";
		}
		else if(finalNumGrade >= 90)
		{
			finalGrade = "A-";
		}
		else if(finalNumGrade >= 88)
		{
			finalGrade = "B+";
		}
		else if(finalNumGrade >= 82)
		{
			finalGrade = "B";
		}
		else if(finalNumGrade >= 80)
		{
			finalGrade = "B-";
		}
		else if(finalNumGrade >= 78)
		{
			finalGrade = "C+";
		}
		else if(finalNumGrade >= 70)
		{
			finalGrade = "C";
		}
		else if(finalNumGrade >= 60)
		{
			finalGrade = "D";
		}
		else 
		{
			finalGrade = "F";
		}
		
		return finalGrade;
	}
	/**
	 * 
	 * @param sn The student's name.
	 * @param lg The letter grade the student will get. 
	 * @throws IOException
	 */
	public static void outputFile(String sn, String lg) throws IOException
	{
		PrintWriter outputFile = new PrintWriter("output.txt");
		outputFile.println(sn);
		outputFile.println(lg);
		outputFile.close();
	}
	
}

