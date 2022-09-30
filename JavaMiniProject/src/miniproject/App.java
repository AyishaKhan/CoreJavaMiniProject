package miniproject;
import java.util.Scanner;


public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			System.out.println("------------WELCOME TO JAVA QUIZ APP-----------");
			
			System.out.println("Choose Your Level");
			System.out.println("Press 1 For,Level 1:Beginner");
			System.out.println("Press 2 For,Level 2:Medium");
			System.out.println("Press 3 For,Level 3:Advanced");
			
		
			Scanner op=new Scanner(System.in);
			System.out.println("Enter your option:");
			int option=op.nextInt();
		    //questions for quiz application in java
			//created a string to store the questions
			System.out.println("         ----------ALL THE BEST-----------");
			
		 	String bq1 = " Which statement is true about Java?\n"+ " A. Java is a sequence-dependent programming language \n B. Java is a code dependent programming language \n C. Java is a platform-dependent programming language \n D. Java is a platform-independent programming language ";
	        String bq2 = " What is the extension of java code files?\n"+ " A. .txt \n B. .pdf \n C. .sql \n D. .java";
	        String bq3 = " Who developed Java?\n"+" A. Guido van Rossum \n B. James Gosling \n C. Dennis Ritchie \n D. Bjarne Stroustrup";
	        String bq4 = " Which one of the following is not a Java feature?\n"+ " A. Object-oriented \n B. Use of pointers \n C. Portable \n D. Dynamic and Extensible";
	        String bq5 = " Which Component Is Used to Compile,Debug and Execute A Java Program?\n"+" A.JDK \n B.JVM \n C.JIT \n D.JRE";
	        //array of questions store inside the array, create Question objects
	        Question [] questions1 ={
	        		new Question(bq1,"d"),//this correspond to the first prompt
	        		new Question(bq2,"d"),//this correspond to the second prompt
	        		new Question(bq3,"b"),//this correspond to the third prompt
	        		new Question(bq4,"b"),//this correspond to the fourth prompt
	        		new Question(bq5,"a")//this correspond to the fifth prompt
	        		
		
	        };if(option==1){
				System.out.println("    -----YOU HAVE CHOOSED BEGINNER LEVEL------");
			 Beginner(questions1);
	        }      //call the method in the main 
	        
	        
	        String iq1 = " Which concept of java is a way of converting real-world objects in terms of class? \n"+ " A. Polymorphism \n B. Encapsulation \n C. Abstraction \n D. Inheritance ";
	        String iq2 = " What will be the output of the following Java Program?\n public class Increment{ \n public static void main (String args[]){ \n int i=3;\n System.out.println(++i *8);\n } \n } \n"+ " A. 24 \n B. 32 \n C. 28 \n D. 42";
	        String iq3 = " What is true about do statement?\n"+ " A. Do statement executes the code more than once always \n B. Do Statement checks the condition at the beginning of the loop \n C. Do Statement does not get execute if condition is not matched in the first iteration \n D. Do Statement executes the code of a loop at least once";
	        String iq4 = " What will be the output of the following Java Program?\n public class Test{\n public static void main (String args[]){ \n StringBuffer s1= new StringBuffer('Complete'); \n s1.setCharAt(1,'i'); \n s1.setCharAt(7,'d');\n System.out.println(s1);\n } \n }\n"+" A. Cimpletd \n B. Complete \n C. Coipletd \n D. iomplede";
	        String iq5=  " How can we remove an object from ArrayList?\n"+ " A. Using the remove() method \n B. Using Iterator \n C. Using the remove() method and Iterator \n D. Using the delete() method";
			//array of questions store inside the array, create Question objects
	        Question [] questions2 ={
	        		new Question(iq1,"c"),//this correspond to the first prompt
	        		new Question(iq2,"b"),//this correspond to the second prompt
	        		new Question(iq3,"d"),//this correspond to the third prompt
	        		new Question(iq4,"a"),//this correspond to the fourth prompt
	        		new Question(iq5,"c")//this correspond to the fifth prompt
	};if(option==2){
		System.out.println("        -----YOU HAVE CHOOSED MEDIUM LEVEL-----");
	        medium(questions2);
	}
	
	String aq1 = " What does SAM stand for in the context of Functional Interface?\n"+ " A. Single Ambivalue Method \n B. Simple Active Markup \n C. Single Abstract Method \n D. Simple Abstract Markup";
    String aq2 = " What is the relation between HashSet and HashMap?\n"+ " A. HashSet internally implements HashMap \n B. HashMap internally implements HashSet \n C. HashMap is the interface;HashSet is the concrete class \n D.HashSet is the interface;HashMap is the concrete class";
    String aq3 = " What is garbage collection in the context of Java?\n"+ " A. The operating system periodically deletes all of the java files available on the system. \n B. Any package imported in a program and not used is automatically deleted. \n C. The JVM checks the output of any Java program and deletes anything that doesn’t make sense. \n D. When all references to an object are gone, the memory used by the object is automatically reclaimed";
    String aq4 = " What is the Output of following Java Program?\n class Base \n { \n  public void show()\n  { \n    System.out.println('Base::show() called');\n  } \n } \n class Derived extends Base \n { \n  public void show() \n { \n    System.out.println('Derived::show() called'); \n } \n }\n public class Main \n { \n public static void main(String[] args)\n { \n     Base b = new Derived();\n     b.show();\n  } \n}\n"+ " A. Derived::show() called \n B. Base::show() called \n C. Compiler Error \n D. Run Time Error";
    String aq5 = " What is the Output of following Java Program?\n final class Complex \n { \n private  double re,  im; \n public Complex(double re, double im) \n { \n    this.re = re;\n     this.im = im;\n }\n Complex(Complex c)\n { \n     System.out.println('Copy constructor called');\n     re = c.re;\n     im = c.im; \n }\n public String toString()\n { \n   return (' '+ re + " + " + im + 'i');\n }\n }\n class Main \n { \n  public static void main(String[] args)\n  {\n     Complex c1 = new Complex(10, 15);\n     Complex c2 = new Complex(c1);\n     Complex c3 = c1;\n     System.out.println(c2);\n  }\n }\n"+ " A. Copy constructor called (0.0)+(0.0i)\n B. Copy constructor called (10.0)+(15.0i) \n C. Compiler Error \n D. (10.0)+(15.0i) ";
	//array of questions store inside the array, create Question objects
    Question [] questions3 ={
    		new Question(aq1,"c"),//this correspond to the first prompt
    		new Question(aq2,"a"),//this correspond to the second prompt
    		new Question(aq3,"d"),//this correspond to the third prompt
    		new Question(aq4,"a"),//this correspond to the fourth prompt
    		new Question(aq5,"b")//this correspond to the fifth prompt
};if(option==3){
System.out.println("         -----YOU HAVE CHOOSED ADVANCED LEVEL-----");
Advanced(questions3);
}
	}
	
	public static void Beginner(Question [] questions1)//creating a method and passing array of questions that is created
	{
		int correctAnsCount=0;
	    int wrongAnsCount=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<questions1.length;i++)//it will loop till the questions length
		{
			System.out.println(questions1[i].prompt);//in each iteration of loop we accepting different questions in prompt
			System.out.println("Enter Your Answer: ");
			String answer=sc.nextLine();//reading the user answer
			if(answer.equals(questions1[i].answer))//checking the user answer
			{
				System.out.println("Correct");//if the condition is true then it print this
                correctAnsCount++;//it is to increment the score of correct answers
			}
			else{
                System.out.println("Wrong");//if the condition fails it print this
                wrongAnsCount++;//it is to increment the score of wrong answers
            }
		}
		System.out.println();
        System.out.println("--------Result Of Level-1---------");
        System.out.println("Correct Answered Questions : "+correctAnsCount);
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);
		System.out.println ("You got:" +  correctAnsCount+"/"+ questions1.length);//from the out of possible questions the score you got
		int percentage=(100*correctAnsCount)/questions1.length;
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }


	}
	public static void medium(Question [] questions2)//creating a method and passing array of questions that is created
	{
		int correctAnsCount=0;
	    int wrongAnsCount=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<questions2.length;i++)//it will loop till the questions length
		{
			System.out.println(questions2[i].prompt);//in each iteration of loop we accepting different questions in prompt
			System.out.println("Enter Your Answer: ");
			String answer=sc.nextLine();//reading the user answer
			if(answer.equals(questions2[i].answer))//checking the user answer
			{
				System.out.println("Correct");//if the condition is true then it print this
                correctAnsCount++;//it is to increment the score of correct answers
			}
			else{
                System.out.println("Wrong");//if the condition fails it print this
                wrongAnsCount++;//it is to increment the score of wrong answers
            }
		}
		System.out.println();
        System.out.println("--------Result Of Level-2---------");
        System.out.println("Correct Answered Questions : "+correctAnsCount);
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);
		System.out.println ("You got:" + correctAnsCount+"/"+ questions2.length);//from the out of possible questions the score you got
		int percentage=(100*correctAnsCount)/questions2.length;
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }
	}
	public static void Advanced(Question [] questions3)//creating a method and passing array of questions that is created
	{
		int correctAnsCount=0;
	    int wrongAnsCount=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<questions3.length;i++)//it will loop till the questions length
		{
			System.out.println(questions3[i].prompt);//in each iteration of loop we accepting different questions in prompt
			System.out.println("Enter Your Answer: ");
			String answer=sc.nextLine();//reading the user answer
			if(answer.equals(questions3[i].answer))//checking the user answer
			{
				System.out.println("Correct");//if the condition is true then it print this
                correctAnsCount++;//it is to increment the score of correct answers
			}
			else{
                System.out.println("Wrong");//if the condition fails it print this
                wrongAnsCount++;//it is to score the count of wrong answers
            }
		}
		System.out.println();
        System.out.println("--------Result Of Level-3---------");
        System.out.println("Correct Answered Questions : "+correctAnsCount);
        System.out.println("Wrong Answered Questions : "+wrongAnsCount);
		System.out.println ("You got:" + correctAnsCount+"/"+ questions3.length);//from the out of possible questions the score you got 
		int percentage=(100*correctAnsCount)/questions3.length;
        System.out.println("Percentage : "+percentage);
        if(percentage>95){
            System.out.println("Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("Performance : Very Low");
        }
        else{
            System.out.println("Performance : Medium");
        }
	}

}
