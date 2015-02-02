import maps.AssociativeArray;

public class TelephoneBook {

    private AssociativeArray aa = new AssociativeArray();

    TelephoneBook(){}

    public String add(String name, String number) {
        return aa.add(name, number);
    }

    public String get(String name) {
        return aa.containsKey(name);
    }

    public String remove(String name) {
        return aa.remove(name);
    }

}
