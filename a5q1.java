import java.util.Scanner;
class rect
{
	private int len;
	private int wid;
	public int getlen()
	{
		return len;
	}
	public void setlen(int x)
	{
		len=x;
	}
	public int getwid()
	{
		return wid;
	}
	public void setwid(int y)
	{
		wid=y;
	}
	public void find()
	{
		double area=len*wid;
		System.out.println("area is " + area);
	}
}
public class a5q1
{
	public static void main(String[] args) {
		rect a=new rect();
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int w=sc.nextInt();
		a.setlen(l);
		a.setwid(w);
		a.find();
	}
}