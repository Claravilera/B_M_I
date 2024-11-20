package BmiModelTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BmiModel.Person;

public class PersonTest {

    Person person;
    double weight;
    double height;

    @BeforeEach
    public void setUp() {
        weight = 75;
        height = 1.87;
        person = new Person(weight, height);
    }

    @Test
    void testGetHeight() {
        assertThat(height, is(person.getHeight()));
    }

    private void assertThat(double height2, Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThat'");
    }

    private Object is(double height2) {
        throw new UnsupportedOperationException("Unimplemented method 'is'");
    }

    @Test
    void testGetWeight() {
        assertThat(weight, is(person.getWeight()));
    }

    @Test
    void testSetHeight() {
        double newHeight = 1.70;
        person.setHeight(newHeight);
        assertThat(newHeight, is(person.getHeight()));
    }

    @Test
    void testSetWeight() {
        double newWeight = 75;
        person.setWeight(newWeight);
        assertThat(newWeight, is(person.getWeight()));
    }
}