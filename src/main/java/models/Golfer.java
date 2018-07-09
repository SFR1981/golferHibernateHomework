package models;

import javax.persistence.*;

@Entity
@Table(name = "golfers")
public class Golfer {

    String firstName;
    String lastName;
    int age;
    int id;



    public Golfer(){

    }

    public Golfer(String firstName, String lastName, int age){
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Column(name = "first_name")
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    @Column(name = "last_name")
    public String getLastName(){
        return  this.lastName;
    }

    public void setLastName(String newLastName){
        this.lastName = newLastName;
    }

    @Column(name = "age")
    public int getAge(){
        return this.age;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId(){
        return id;
    }

    public void setId(int newId){
        this.id = newId;
    }

}
