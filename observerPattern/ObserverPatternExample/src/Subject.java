import java.util.*;

public class Subject {
              

	
	public String SubjectAdi;
	
	
	public String Aciklama;
	
	
	public int SubjectNo;
	
	
	
	
	boolean de�i�timi;
	
	
	
	public boolean getde�i�timi() {
		
		return de�i�timi;
	}
	

	public void setde�i�timi(Boolean _degistimi) {
		
		if(_degistimi ==true) {
			Notify();
			de�i�timi =_degistimi;
		}
		else {
			de�i�timi =_degistimi;
		}
		
	}
	
	
	List<ObserverAbstract> Gozlemciler; 
	
	public Subject() {
		 this.Gozlemciler= new ArrayList<ObserverAbstract>();
		
	}
	
	public void AboneEkle(ObserverAbstract observer) {
		
		Gozlemciler.add(observer);
	}
	
	
	public void AboneCikar(ObserverAbstract observer) {
		
		Gozlemciler.remove(observer);
	}
	
 
	 public void Notify() {
		 
		 
		 Gozlemciler.forEach(g->{
			 
			 g.Update();
			 
		 });
		 
				 
				
		 
	 }

	
	
}

	
	
	   	
	
	

