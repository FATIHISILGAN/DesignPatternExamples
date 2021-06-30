
public class Main {

	public static void main(String[] args) {
		
		System.out.println("observer pattern örneði");
		
		Subject subject = new Subject();
		subject.AboneEkle(new AgentB());
		subject.AboneEkle(new AgentA());
		subject.AboneEkle(new AgentC());
		
		subject.SubjectAdi = "subject1";
		
		subject.Aciklama="subject1 subjecti";
		
		subject.SubjectNo =65;
		
		
		subject.setdeðiþtimi(true);
		
		
		
		
		
		

	}

}
