import java.util.*;

class Employee{
	public static void main(String args[])
	{
	Employee E=new Employee();
	E.output();
		
	}
	public void output(){
		String s[] =new String[3];
		String add[] =new String[3];
		int j[] = new int[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			s[i]=sc.nextLine();
			j[i]=sc.nextInt();
			sc.nextLine();
			add[i]=sc.nextLine();
		}
		System.out.println("Name   "+"Year of joining    "+"Address");
		for(int i=0;i<3;i++){
			System.out.println(s[i]+"    "+j[i]+"    "+add[i]);
		}
		
	}
}