class A
{
public void printA()
{
System.out.println("from parent class");
}
}
class B extends A
{
public void printB()
{
System.out.println("iam from child class");
}
}
public class Single
{
public static void main(String args[]){
B obj=new B();
obj.printA();
obj.printB();
}
}