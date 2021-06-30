
public class Main {

	public static void main(String[] args) {
		
		    System.out.println("strategy pattern örneði");
		    
		    
		    System.out.println("**********************************************************************************************************************************************************");
		    
		    
		    
		    IComputer computer = ConverterFactory.CreateConverterClass("Lenovo","Ýdepad520");
		    
		    computer.Convert();
		    
		    computer.getModel();
		    
		    
		    
		    
		    System.out.println("**********************************************************************************************************************************************************");
		    
		    
		    
		    
		    IComputer computer2 = ConverterFactory.CreateConverterClass("Hp","Pavilion");
		    
		    computer2.Convert();
		    
		    computer2.getModel();
		    
		    
		    
		    
		    
		    System.out.println("**********************************************************************************************************************************************************");
		    
		    
		    
		    
		    IComputer computer3 = ConverterFactory.CreateConverterClass("Asus","SonicMaster");
		    
		    computer3.Convert();
		    
		    computer3.getModel();
		    
	}

}
