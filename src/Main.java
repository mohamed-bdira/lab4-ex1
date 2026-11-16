//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PersonManager manager = new PersonManager();

        for(int i = 1; i <= 10; i++){
            System.out.println("Enter detials for person " + i);
            Person student  = new Person();
            student.initPerson();
            manager.addPerson(student);
        }

        manager.displayList();
    }
}
