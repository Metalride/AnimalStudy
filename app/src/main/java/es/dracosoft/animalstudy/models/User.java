package es.dracosoft.animalstudy.models;

/**
 * Created by Dracosoft on 31/03/2017.
 */

public class User {
    private String userName;
    private String name;
    private String surname;
    private String company;
    private String email;

    public void User(){

    }

    public void User(String userName, String name,
                     String surname,
                     String company, String email){

        this.setUserName(userName);
        this.setName(name);
        this.setSurname(surname);
        this.setCompany(company);
        this.setEmail(email);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
