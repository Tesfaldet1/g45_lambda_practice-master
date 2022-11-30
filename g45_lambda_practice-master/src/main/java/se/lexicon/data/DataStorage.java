package se.lexicon.data;


import se.lexicon.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface DataStorage {

    DataStorage INSTANCE = DataStorageImpl.getInstance();

    List<Person> findMany(Predicate<Person> filter);
    Person findOne(Predicate<Person> filter);


    Person findOneAndMapToString(Predicate<Person> filter, Function<Person, String> personToString);

    List<Person> findManyAndMapEachToString(Predicate<Person> filter, Function<Person, String> personToString);

    void findAndDo(Predicate<Person> filter, Consumer<Person> consumer);

    List<Person> findAndSort(Comparator<Person> comparator);

    List<Person> findAndSort(Predicate<Person> filter, Comparator<Person> comparator);
}
