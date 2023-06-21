class overload
{
void area(int l,int b)
{
System.out.println("the area of rectangle is:"+(l*b));
}
void area(int l)
{
System.out.println("the area of square is:"+(l*l));
}
}
public class areaoverloading
{
public static void main(String args[])
{
overload obj=new overload();
obj.area(10);
obj.area(10,30);
}
}   