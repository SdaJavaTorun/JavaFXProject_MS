package sample.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Created by RENT on 2017-04-04.
 */
public class Person {
    private final StringProperty firstName;
    private final StringProperty lastName;
    private StringProperty street;
    private StringProperty city;
    private IntegerProperty postalCode;
    private ObjectProperty<LocalDate> birthday;

    public Person(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName); // chcemy obiekt, a nie Stringa
        this.lastName = new SimpleStringProperty(lastName);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
}
