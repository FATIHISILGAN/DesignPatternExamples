
public class AsusConverter implements IComputer {
 
	 String Model= "";
	 public  AsusConverter(String _Model) {
		 
		 Model = _Model;
		
	}
	@Override
	public void Convert() {
		 
		System.out.println("Asusa dönüştürüldü");
	}

	@Override
	public void getModel() {
            
		System.out.println(Model);
		
	}
         
}
