
public class OzkanAyataOCAMentoring {
	/*
	 * 
	 * Whizlabs - OCA study Guide - Practice questions of each chapter of OCA study guide(second pdf)- Quizzes posted by Muhtar
	 * 
	 * 
		 1)
		 		Consider the following code

				public class Test {
				
				static int x;
				int y;
				
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					Test t2 = new Test();
					t1.x=10;
					t1.y=20;
					t2.x=30;
					t2.y=40;
					System.out.println(t1.x+":"+t1.y+":"+t2.x+":"+t2.y);		
				}
			}
			What is the result?
			
		2) Consider the code 

			int i = 10;
			float f = 10.100f;
			double d = 123;
			Which of the following assignments won't compile?

			 d = i , d = f, f = i, i = d, i = f, f = d
			 
		3) Consider the code

			public class  Test{
				static double area;
				int b=30,h=40;
				public static void main(String[] args) {
					
					double p,b,h;// Line-1
					if(area ==0){
						b=3;
						h=4;
						p=0.5;
						area=p*b*h;// Line-2
					}
					
					System.out.println(area);
				}
			}
			What is the result?

			4) Consider the code

			public class Test 
			{
				static int count=0;
				int i =0;
				public void modify()
				{
					while(i<5)
					{
						i++;
						count++;
					}
				}
				public static void main(String[] args) 
				{
					Test t1 = new Test();
					Test t2 = new Test();
					t1.modify();
					t2.modify();
					System.out.println(t1.count+".."+t2.count);
				}
				
			}
			What is the result?
			
			
			5) Consider the following code

			public class Test 
			{
				int i,j;
				public Test(int i,int j)
				{
					initialize(i,j);
				}
				public void initialize(int i,int j)
				{
					this.i = i*i;
					this.j=j*j;
				}		
				public static void main(String[] args) 
				{
					int i =10, j= 20;
					Test t = new Test(i,j);
					System.out.println(i+"..."+j);
				}
			}
			What is the result?
			
			6) Consider the code

			class Student
			{
				String name;
				public Student(String name)
				{
					this.name=name;
				}
			}
			public class Test 
			{
				public static void main(String[] args) 
				{
					Student[] students = new Student[3];
					students[1]= new Student("Cybertek1");
					students[2]= new Student("Cybertek2");
					for(Student s : students)
					{
						System.out.println(s.name);
					}
				}
			}
			What is the result?
			
			7) There was a question regarding Java ByteCode
			
			a) It runs every Platform
			b) It runs only on the platform it was compiled
			c) It runs on any Platform that has Compiler
			d) It runs on any Platform that has JRE
			
			8)  Line-- > insert code here 
					x[0]=10;
						x[1]=20;
							System.out.println(x[0]+":"+x[1]);
							
				a) int[] x = new int[2];
				b) int x = new int[2];
				c) int x;
					x = {10,20};
			
			9) Which is true about switch?
			
				a) its case label literals can be changed at RunTime
				b) its expression can be evaluated to multiple values 
				c) break statement is not mandatory
				d) It must contain default section
				
			10) 
			
			x = 4
			
			if(x++<5)
			{
				System.out.println(x+" Hello Ozkan");
			}
			else
			{
				System.out.println(x+" Hello you");
			}
			
			11) 
			
			{
			int x = 0;
			String[] days={"sun","mon","wed","sat"};
			for(String s : days)
			{
				switch(s)
				{
					case "sat":
	    			case "sun":
						x += 1;
					    break;
					case "mon":
					case "wed":
						x -= 2;
				}
			}
			System.out.println(x);
		}
		
		
		12)
				if(args[0].equals("2")?false:true){
				
				System.out.println("Success");
			}
			else
			{
				System.out.println("Failure");
			}
			
			javac className.java
			java className 1 2 3
			
			
			
		13) 	
		if(args[0].equals("123")?false:true){
				
				System.out.println("Success");
			}
			else
			{
				System.out.println("Failure");
			}
			
			javac className.java
			java className "123"
			
			14) There was 5-8 questions about contructors-overloaded contructors-default constructors. Off course they are all mixed up with polymorhism-inheritance
			
			15) 
			
			int[] array = {5,4,3,2,1}; was given and question was to pick the choice which will print all array elements in reverse
			int x = 5;
			
			while(x > 0){
			System.out.print(array[--x] + " ");
			
			}
			
			16) 	
			
			What u should add next line to print Ten to the console
			
			String x = "9", double x = 9, long x = 9, short x = 9, byte x = 9, Integer x = new Integer(9);
			
			switch(x)
			{
				case 9:
					System.out.println("Ten");
				        break;
				case 10:
					System.out.println("Twenty");
				        break;
			}
			
			17)
			int i =50;
			int j =30;
			int k = (j += i/5) / 5;
			System.out.println(i+":"+j+":"+k);
			
			18)
			int n[];
			n= new int[2];
			n[0]=1;
			n[1]=2;
	 
			n = new int[4];
			n[2]=3;
			n[3]=4;
	 
			for(int x : n)
			{
				System.out.print(" "+x);
			}
			
			19)
			
			int[] x = {11,12,13,14,15}; an array was given and asking two choices that will print these elements to the console.
			
			Answer: one was regular for loop, other was enhanced for loop
			
			20) ArrayList<Integer> x = new ArrayList();
			
			x.add(1);
			x.add(2);
			x.add(3);
			x.remove(2);
			x.add(2,5);
			
			System.out.println(x);
			
			21)
				int x;
					
				static void hey(int i) {
						i = i * i;
				}
					
				static void hey2(String s) {
						s += s;
				}		
					
						
						main method ;
						
			String s = "Hello";
			Integer i = 10;
			Practice object = new Practice();
			object.x = 10;
			
			hey(i);
			hey2(s);
			hey(object.x);
			
			System.out.println(object.x +"..." +  i +"..."+ s);
						
						
		}
			
			21) Exception handling was there about 5 questions
			22) for - while -array questions in total 15 questions if I am not exaggerating 
			23) off course Abstraction-interface-inheritance-polymorphism was there 
			
	*/
}
