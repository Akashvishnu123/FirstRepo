package mavenPackage;

public class Method {

	public void avg(int a,int b,int c){
		int avg= a+b+c;
		System.out.println(avg);		
		
	}
	public void avg(float a,float b ,float  c){
		float  avg= a+b+c;
		System.out.println(avg);		
		
	}
	public void area(int l,int b) {
		int area=b*l;
			System.out.println(area);
	}
	public void area(int side) {
		int area=side*side;
			System.out.println(area);
	}
	public void area(float r) {
		float area=r*r;
			System.out.println(area);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj=new Method();
		obj.avg(12,13,14);
		obj.avg(12.5f, 13.5f, 14.5f);
		obj.area(10, 5);
		obj.area(5);
		obj.area(3.5f);
		

	}

}
