package mavenPackage;

public class ConscAs
{
	static int m1;
	static int m2;
	static int m3;
public  ConscAs(int mark1,int mark2,int mark3)
{
m1=mark1;
m2=mark2;
m3=mark3;

}
public void grade()
{
	int totalmarks=m1+m2+m3;
	if(totalmarks>35){
		System.out.println("grade A");
	}
	else{
System.out.println("grade F");		
}
}
public static void main(String args[])
{
ConscAs obj= new ConscAs(10,20,30);
obj.grade();
}
}
