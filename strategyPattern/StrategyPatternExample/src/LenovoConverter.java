



public class LenovoConverter implements IComputer  {
	
	
	String Model = "";
	public LenovoConverter(String _Model) {
		
		Model= _Model;
	}
	
	
  
	public void Convert() {
		
		System.out.println("Lenovoya d�n��t�");
	}
	
	
	public void getModel() {
		
		
		System.out.println(Model);
	}
}
