
public class TestClass1 implements TestClassInterface {
	public double field1;
	public int field2;
	public long field3;
	public short field4;
	public float field5;
	public float field6;
	
	static {
			System.out.println("TestClass1 init");
	}
	
	@Override
	public void test() {
		System.out.println("test method of TestClass1 successfully called");
	}
}
