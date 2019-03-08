package developer;


interface firstNameHolder{
    lastNameHolder setFirstName(String  name);
}

interface lastNameHolder{
    friendsHolder setLastName(String name);
}

interface friendsHolder{
    friendsHolder addFriends(String name);
    bestFriendHolder noMoreFreindsToAdd();
}

interface bestFriendHolder{
    PersonBuilderHolder setBestFriends(String name);
}

interface PersonBuilderHolder{
    Person Build();
}

