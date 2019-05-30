package computerAb1;



public class Overloading {
	public void stdId(String name) {
		System.out.println("String method"+name);

	}
	//no of arguments
	public void stdId(Long phno,String email,char block) {
		System.out.println("3 method" +phno+ "\n" +email+ "\t" +block);
	}
	//data type
	public void stdId(int regno) {
		System.out.println("int method" + regno);
	}
	//order
	public void  stdId(String Hod,String Project) {
		System.out.println("String String method" +Hod+ "\n" +Project);
	}
	//number
	public void stdId(Float fee,String doj) {
		System.out.println("float String method" +fee+ "\n" +doj);
	}
	public static void main(String[] args) {
		Overloading st=new Overloading();
		st.stdId("sonam");
		st.stdId(8056055767l,"sonam@gmail.com",'f');
		st.stdId(587);
		st.stdId("gupta","college feedback sys java");
		st.stdId(90000f,"28/3/2015");
		
	}
	}



