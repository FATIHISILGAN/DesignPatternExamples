import java.util.*;

public class Subject {
              

	
	public String SubjectAdi;
	
	
	public String Aciklama;
	
	
	public int SubjectNo;
	
	
	
	
	boolean deðiþtimi;
	
	
	
	public boolean getdeðiþtimi() {
		
		return deðiþtimi;
	}
	

	public void setdeðiþtimi(Boolean _degistimi) {
		
		if(_degistimi ==true) {
			Notify();
			deðiþtimi =_degistimi;
		}
		else {
			deðiþtimi =_degistimi;
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

	
	
	   	
	
	

