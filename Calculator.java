// Java program to demonstrate lamda expressions to implement 
// a user defined functional interface. 

@FunctionalInterface
interface Addition
{ 
	int add(int x,int y); 
} 
@FunctionalInterface
interface Subtract
{ 
	int difference(int x,int y); 
} 

@FunctionalInterface
interface Multiplication
{ 
	int product (int x, int y);
} 

@FunctionalInterface
interface Division
{ 
	int safeDivision(int x,int y); 
} 

class Calculator 
{ 
	public static void main(String args[]) 
	{ 
		int a = 50, b=10;

		 
	Addition s= (int x,int y)->x+y;
      Subtract t=(int x,int y)->x-y;
      
   Multiplication u=(int x,int y)->x*y;
      Division v=(int x,int y)->{ if(b==0) return 0; 
                                 return x/y;};

		 
		int ans = s.add(a,b);
      int ans2=t.difference(a,b);
      int ans3=u.product(a,b);
      int ans4=v.safeDivision(a,b);
		System.out.println(ans); 
      System.out.println(ans2);
      System.out.println(ans3);
      System.out.println(ans4);
	} 
} 
