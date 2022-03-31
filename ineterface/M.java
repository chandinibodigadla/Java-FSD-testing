package ineterface;
// multiple interface
 interface State {
	 void Statename();
 }
 interface Country{
	 void Countryname();
 }
 interface District{
	 void Districtname();
 }
 public class M implements State,Country,District {
	 public static void main(String[] args) {
	 }
	 public void Statename() {
		 System.out.println("Andhrapradesh");
	 }
	 public void Countryname() {
		 System.out.println("India");
	 }
	 public void Districtname() {
		 System.out.println("West godavari"); 
	 }
	 public static void main1(String[] args) {
		 M obj=new M();
		 obj.Statename();
		 obj.Countryname();
		 obj.Districtname();
		 
		 
	 }
	 }
