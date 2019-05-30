package computerAb1;

public class Desktop implements Hardware,Software {

	@Override
	public void SoftwareResources() {
		System.out.println("JAVA Developing");
		
	}

	@Override
	public void hardwareResources() {
		System.out.println("Chip manufacturing");
		
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.SoftwareResources();
	}

}
