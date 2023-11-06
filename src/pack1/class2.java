package pack1;

public class class2 {

	public static void main(String[] args) {
		class2.boy();	
		class2.girl();
		class2.baby();
		class2.mom();
	}
public static void boy() {
int a = 500;
int b = 600;
int c = 700;
int d = a*b-c;
System.out.println(d);
	
}
public static void girl() {
double a = 700.99;
double b = 800.99;
double c = a*b;
System.out.println(c);
	
}	
public static void baby() {
String a = "I don't find any word";
System.out.println(a);
	}
public static void mom() {
int a = 7000;
double b = 800.50;
String c = "Please give me ";
char d = '$';
System.out.println(c+d+(a+b)+ " dollars only.");
	}
}
