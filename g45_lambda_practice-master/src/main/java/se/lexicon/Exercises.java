package se.lexicon;

import se.lexicon.data.DataStorage;
import se.lexicon.data.DataStorageImpl;
import se.lexicon.model.Person;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

import static se.lexicon.model.Gender.FEMALE;
import static se.lexicon.model.Gender.MALE;

public class Exercises {
   // private final static DataStorage storage = DataStorage.INSTANCE;
  // DataStorage INSTANCE = DataStorageImpl.getInstance();
static Consumer<DataStorageImpl> presons=(person ->person.findMany(Predicate.isEqual("Erik")));





    public static void main(String[] args) {
        exercise1("ex 1 is running");

    }

    /*
       1.	Find everyone that has firstName: “Erik” using findMany().
    */
    public static void exercise1(String message){
        System.out.println(message);
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Erik","Stevenson", LocalDate.of(2022,11,10),MALE));
        personList.add( new Person("Jenny","Ulf",LocalDate.of(2021,11,03),FEMALE));
        personList.add(new Person("Emily","Anderson",LocalDate.of(2014,10,01),FEMALE));
        personList.add(new Person("Dave","Sonny",LocalDate.of(2010,12,12),MALE));
        personList.add(new Person("Erik","Nuna", LocalDate.parse("2013-01-19"), MALE));


        Consumer<DataStorageImpl> c3 = (p)-> p.findMany(person->person.getFirstName().contains("Erik"));

        Consumer<DataStorageImpl> findErik = (p)->p.findMany(person -> {if(person.getFirstName().equals("Erik"));
            //personList.equals(c2);
            return personList.equals("Erik");
        });
        personList.forEach((plist->{
            if(plist.getFirstName().equals("Erik"));
            System.out.println(findErik);
        }));

        System.out.println("----------------------");





    }

    /*
        2.	Find all females in the collection using findMany().
     */



    public static void exercise2(String message){

        System.out.println(message);

        //Write your code here
        // TODO: exercise2

        System.out.println("----------------------");
    }

    /*
        3.	Find all who are born after (and including) 2000-01-01 using findMany().
     */
    public static void exercise3(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise3

        System.out.println("----------------------");
    }

    /*
        4.	Find the Person that has an id of 123 using findOne().
     */
    public static void exercise4(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise4

        System.out.println("----------------------");

    }

    /*
        5.	Find the Person that has an id of 456 and convert to String with following content:
            “Name: Nisse Nilsson born 1999-09-09”. Use findOneAndMapToString().
     */
    public static void exercise5(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise5

        System.out.println("----------------------");
    }

    /*
        6.	Find all male people whose names start with “E” and convert each to a String using findManyAndMapEachToString().
     */
    public static void exercise6(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise6

        System.out.println("----------------------");
    }

    /*
        7.	Find all people who are below age of 10 and convert them to a String like this:
            “Olle Svensson 9 years”. Use findManyAndMapEachToString() method.
     */
    public static void exercise7(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise7

        System.out.println("----------------------");
    }

    /*
        8.	Using findAndDo() print out all people with firstName “Ulf”.
     */
    public static void exercise8(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise8

        System.out.println("----------------------");
    }

    /*
        9.	Using findAndDo() print out everyone who have their lastName contain their firstName.
     */
    public static void exercise9(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise9

        System.out.println("----------------------");
    }

    /*
        10.	Using findAndDo() print out the firstName and lastName of everyone whose firstName is a palindrome.
     */
    public static void exercise10(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise10

        System.out.println("----------------------");
    }

    /*
        11.	Using findAndSort() find everyone whose firstName starts with A sorted by birthdate.
     */
    public static void exercise11(String message){
        System.out.println(message);
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("Erik","Stevenson", LocalDate.of(2022,11,10),MALE));
        long namesBeginningWithA = personList
                .stream()
                .filter(name -> name.getFirstName().startsWith("A"))
                .count();

        System.out.println("Number of names beginning with A is: " + namesBeginningWithA);


        //Write your code here
        // TODO: exercise11

        System.out.println("----------------------");
    }

    /*
        12.	Using findAndSort() find everyone born before 1950 sorted reversed by lastest to earliest.
     */
    public static void exercise12(String message) {
        System.out.println(message);
        //Write your code here
        // TODO: exercise12
    }
    /*
        13.	Using findAndSort() find everyone sorted in following order: lastName > firstName > birthDate.
     */
    public static void exercise13(String message){
        System.out.println(message);
        //Write your code here
        // TODO: exercise13

        System.out.println("----------------------");
    }
}
