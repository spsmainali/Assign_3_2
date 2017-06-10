// Right answer is d. The program prints pnt is null 0 0.
class example {
	int x; int y;
	String name;
	public static void main(String args[]) {
		example pnt = new example();
		System.out.println ("pnt is " + pnt.name + " " + pnt.x + " " + pnt.y); // value of pnt is not initialised any where 
	}
}