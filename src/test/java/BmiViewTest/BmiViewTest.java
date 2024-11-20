package BmiViewTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import BmiView.BmiView;

public class BmiViewTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private Scanner scanner;
    BmiView view;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        view = new BmiView();
    }

    @Test
    void testAskHeight() {
        double heightInMeters = 1.87;
        String simulatedInput = String.valueOf(heightInMeters) + "\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        scanner = new Scanner(System.in).useLocale(Locale.US);
        double heightReturned = view.askHeight(scanner);
        assertThat(heightReturned, is(heightInMeters));
    }

    private void assertThat(double heightReturned, Object object) {
        throw new UnsupportedOperationException("Unimplemented method 'assertThat'");
    }

    private Object is(double heightInMeters) {
        throw new UnsupportedOperationException("Unimplemented method 'is'");
    }

    @Test
    void testAskWeight() {
        double weightInMeters = 75;
        String simulatedInput = String.valueOf(weightInMeters) + "\n";
        System.setIn(new ByteArrayInputStream(simulatedInput.getBytes()));
        scanner = new Scanner(System.in).useLocale(Locale.US);
        double heightReturned = view.askWeight(scanner);
        assertThat(heightReturned, is(weightInMeters));
    }

    @Test
    void testShowWelcome() {
        view.showWelcome();
        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("-------------------------"));
        assertTrue(output.contains("Welcome to BMI calculator"));
    }
}
