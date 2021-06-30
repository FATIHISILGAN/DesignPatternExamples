import java.util.*;

public class Subject {
              

	
	public String SubjectAdi;
	
	
	public String Aciklama;
	
	
	public int SubjectNo;
	
	
	
	
	boolean değiştimi;
	
	
	
	public boolean getdeğiştimi() {
		
		return değiştimi;
	}
	

	public void setdeğiştimi(Boolean _degistimi) {
		
		if(_degistimi ==true) {
			Notify();
			değiştimi =_degistimi;
		}
		else {
			değiştimi =_degistimi;
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

	
	
	   	
	
	

