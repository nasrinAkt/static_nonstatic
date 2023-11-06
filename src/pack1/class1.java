package pack1;

public class class1 {

	public static void main(String[] args) {
		class1 obj = new class1();
		obj.one();
		obj.two();
		obj.three();
		obj.four();
	}
public void one() {
int a = 500;
int b = 600;
int c = a*b;
System.out.println(c);
}
public void two() {
double a = 55.50;
double b = 45.50;
double c = a+b;
System.out.println(c);
}	
public void three() {
String a = "I feel sleepy";
System.out.println(a);
}	
public void four() {
int a = 50000;
double b = 60000;
String c = "This is my salary ";
char d = '$';
System.out.println(c+d+(a+b));
}	
	
	
}
