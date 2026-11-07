package mn.edu.must.sqat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScholarshipBoundaryTest {
    private final ScholarshipCalculator calculator = new ScholarshipCalculator();

    @ParameterizedTest(name = "score {0} should be {1}")
    @CsvSource({
        "60, D",
        "59.99, F",
        "69.99, D",
        "0, F",
        "100, A",
        "89.99, B",
        "90, A"
    })
    void letterGrade_atBoundary_returnsSpecifiedGrade(double score, String expected) {
        assertEquals(expected, calculator.letterGrade(score));
    }
}