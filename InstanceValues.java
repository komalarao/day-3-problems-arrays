package bridgelabz;

public class InstanceValues {
   String personName;
   int age;
   InstanceValues(String personName,int age) {
	  this.personName = personName;
	  this.age = age;
   }void showInstanceValues(InstanceValues clue, InstanceValues clues){
	   System.out.println("name is-"+this.personName);
	   System.out.println("age is-"+this.age);
	   System.out.println("name is " +clue.personName);
	   System.out.println("age is "+clue.age);
	   System.out.println("name is"+clues.personName);
	   System.out.println("age is "+clues.age);
   }
   static String classPurpose = "demo";

   static void displayClassPurpose() {
       System.out.println("class purpose - " + classPurpose);
   }
    public static void main(String[]args) {
	InstanceValues firstobject = new InstanceValues("srinu",23);
	InstanceValues secondobject = new InstanceValues("kartheek",25);
	InstanceValues thirdobject = new InstanceValues("komalarao",26);
	firstobject.showInstanceValues(secondobject, thirdobject);
    displayClassPurpose();
   }

		
}
