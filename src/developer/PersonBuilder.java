package developer;

import java.util.ArrayList;
import java.util.NoSuchElementException;

class PersonBuilder implements firstNameHolder,lastNameHolder,friendsHolder,bestFriendHolder,PersonBuilderHolder {
    private String firstName;
    private String lastName;
    private String bestFriend;
    private ArrayList<String> friends = new ArrayList<>();
    private PersonBuilder(){

    }
    public static firstNameHolder load(){
         return new PersonBuilder();
    }
    @Override
    public lastNameHolder setFirstName(String name){
        this.firstName = name;
        return this;
    }

    @Override
    public friendsHolder setLastName(String name){
        this.lastName = name;
        return this;
    }
    @Override
    public friendsHolder addFriends(String name) {
        friends.add(name);
        return this;
    }

    @Override
    public bestFriendHolder noMoreFreindsToAdd() {
        return this;
    }


    @Override
    public PersonBuilderHolder setBestFriends(String name){
        if (!friends.contains(name)){
            throw new NoSuchElementException(name + " Not found!");
        }
        bestFriend = name;
        return this;
    }

    @Override
    public Person Build(){
    System.out.println(firstName+ ", " + lastName);
    Person person = new Person(firstName, lastName);
    person.setFriends(friends);
    person.setBestFriends(bestFriend);
    return person;
    }


}