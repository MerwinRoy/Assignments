/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author merwinroy
 */
import java.util.ArrayList;

public class PersonDirectory {
    ArrayList<Person> personDir;
    
    public PersonDirectory() {
        this.personDir = new ArrayList<>();
    }

    public ArrayList<Person> getPersonDir() {
        return personDir;
    }

    public void setPersonDir(ArrayList<Person> personDir) {
        this.personDir = personDir;
    }
    
    public Person addNewPerson(){
        Person person = new Person();
        personDir.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
        personDir.remove(person);
    }
}
