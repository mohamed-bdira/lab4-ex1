import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> peopleList;

    public PersonManager(){
        this.peopleList = new ArrayList<>();
    }

    public void addPerson(Person p){
        if(p != null && p.isPersonEmpty() == 0){
            peopleList.add(p);
        }else{
            System.out.println("cannot add an empty person");
        }
    }

    public void displayList(){
        if(peopleList.isEmpty()){
            System.out.println("the list is empty");
            return;
        }

        System.out.println("list of people and balances");
        for(Person p : peopleList){
            System.out.println("id: " + p.getId() +
                               "| name: " + p.getFirstName() + " " + p.getLastName() +
                               "| balance: " + p.getBalance());
        }
    }
}
