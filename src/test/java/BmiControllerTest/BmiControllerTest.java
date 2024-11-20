package BmiControllerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BmiController.BmiController;
import BmiModel.Person;

public class BmiControllerTest {

    BmiController controller;
    double weight;
    double height;

    @BeforeEach
    public void setUp() {
        controller = new BmiController();
        weight = 75;
        height = 1.87;
    }

    @Test
    void testCreatePerson() {
        assertThat(controller.createPerson(weight, height), instanceOf(Person.class));
        assertThat(controller.createPerson(weight, height).getWeight(), is(weight));
        assertThat(controller.createPerson(weight, height).getHeight(), is(height));
    }

    private Object is(double weight2) {
        throw new UnsupportedOperationException("Unimplemented method 'is'");
    }

    private void assertThat(Person person, Object instanceOf) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThat'");
    }

    private void assertThat(String bmiCategoryExpeceted, Object instanceOf) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThat'");
    }

    private Object is(String weight2) {
        throw new UnsupportedOperationException("Unimplemented method 'is'");
    }

    private void assertThat(double person, Object instanceOf) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThat'");
    }

    private Object instanceOf(Class<Person> class1) {
        throw new UnsupportedOperationException("Unimplemented method 'instanceOf'");
    }

    @Test
    void testGetBmiNumber() {
        double bmiExpected = weight / (Math.pow(height, 2));
        assertThat(bmiExpected, is(controller.getBmiNumber(controller.createPerson(weight, height))));
    }

    @Test
    void testGetBmiClassification() {
        double bmiNumber = 15;
        String bmiCategoryExpeceted = "Severe thinness";
        assertThat(bmiCategoryExpeceted, is(controller.getBmiClassification(bmiNumber)));
    }
}
