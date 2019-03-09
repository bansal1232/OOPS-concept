package developer;

import java.util.ArrayList;

class Person {
    private String firstName;
    private String lasName;
    private String bestFriend;
    private ArrayList<String> friends = new ArrayList<>();

    void setFriends(ArrayList<String> friendlist){
        this.friends = friendlist;
    }

    void setBestFriends(String name){
        bestFriend = name;
    }

    Person(String firstName, String lasName) {
        this.firstName = firstName;
        this.lasName = lasName;
    }

    public void sayHello(){
        System.out.println("First name:" + firstName + "\nLast Name :" + lasName );
        for(String name : friends){
            System.out.println(name);
        }
        System.out.println("Best friend -> " + bestFriend);
    }
}
