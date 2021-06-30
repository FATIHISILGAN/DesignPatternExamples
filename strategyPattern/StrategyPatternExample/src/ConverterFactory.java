
public class ConverterFactory {
	
	public static IComputer CreateConverterClass(String choice,String model) {
		
		IComputer selectedComputer = null;
		
		if (choice == "Lenovo") {
			
			selectedComputer = new LenovoConverter(model);
				
			
		}
		
		else if (choice =="Hp") {
			
			selectedComputer = new HpConverter(model);
		}
		
		else if (choice =="Asus") {
			
			selectedComputer = new AsusConverter(model);
		}
		
		return selectedComputer;
		
	}

}
