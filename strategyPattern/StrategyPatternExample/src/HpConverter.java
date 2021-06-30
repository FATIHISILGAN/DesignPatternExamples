

public class HpConverter implements IComputer {
 
	 
	   String Model ="";
	
	    public HpConverter(String _Model) {
	    	
	    	Model = _Model; 
	    	
	    }
		public void Convert() {
			
			System.out.println("Hp'e dönüþtü");
		}

		@Override
		public void getModel() {
			
			  System.out.println(Model);
		}
		
		
		
}
