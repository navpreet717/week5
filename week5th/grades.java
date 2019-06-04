package week5th;

import java.util.Scanner;

public class grades {

	public static void main(String[] args) {
		
		
		
		String finalGrade=getLetterScore();
		System.out.println("final scores"+finalGrade);
		
		
	}
	//function ask user to enter 5 test scores
		//convert score to letter grade
		//return letter as string
		//a:90-100
		//b:80-89
	//c:70-79
	//d:60-69
	//f:below 60
	
	
		
		public static String getLetterScore(){
			//ASK 5 GRADES MEANS INPUT
			//SCANNER
			Scanner keyboard=new Scanner(System.in);
			int score=0;
		for(int i=0;i<5;i++){
			System.out.println("Enter Scores"+(i+1));
			score=score+keyboard.nextInt();
			
		}

		System.out.println("total scores"+score);
			
			
			//CALCULATE AVERAGE
			double average=score/5.0;
			System.out.println("average scores"+average);
			
			//DECIDE WHAT LETTER PERSON GETS
			String LetterScore="";
			if(average>=90 && average<=100)
			{
				 LetterScore="A";
			}
			else if(average>=80 && average<=89)
			{
				 LetterScore="B";
			}
			else if(average>=70 && average<=79)
			{
				 LetterScore="C";
			}
			else if(average>=60 && average<=69)
			{
				 LetterScore="D";
			}
			else 
			{
				 LetterScore="E";
			}
			
			//IF ELSE
			
			
			//RETURN LETTER GRADES
			
		return LetterScore;
}

	}

