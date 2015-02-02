package task_13_11;

import java.util.Calendar;

public class Employee {

    private String secondName;
    private String firstName;
    private String patronymic;
    private String address;
    private int yearOfJoining;
    private int monthOfJoining;


    // Constructors
    Employee (String secondName,
              String firstName,
              String patronymic,
              String address,
              int yearOfJoining,
              int monthOfJoining) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.yearOfJoining = yearOfJoining;
        this.monthOfJoining = monthOfJoining;
    }

    Employee (String secondName,
              String firstName,
              String address,
              int yearOfJoining,
              int monthOfJoining) {
        this(secondName, firstName, null, address, yearOfJoining, monthOfJoining);
    }


    // getters and setters

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        if (patronymic == null) {
            return "";
        } else {
            return patronymic;
        }
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getMonthOfJoining() {
        return monthOfJoining;
    }

    public void setMonthOfJoining(int monthOfJoining) {
        this.monthOfJoining = monthOfJoining;
    }


    // method for calc years of work
    public int getYearsOfWork () {
        Calendar c = Calendar.getInstance();
        if ( (monthOfJoining - 1) <= c.get(Calendar.MONTH) ) {
            return c.get(Calendar.YEAR) - yearOfJoining;
        } else {
            return c.get(Calendar.YEAR) - yearOfJoining - 1;
        }
    }

}
