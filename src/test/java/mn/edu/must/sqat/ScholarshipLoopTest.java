package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScholarshipLoopTest {
    private final ScholarshipCalculator calculator = new ScholarshipCalculator();

    @Test void gpa_oneGrade_returnsItsGradePoint() {
        assertEquals(4.0, calculator.gpa(new double[]{95}), 0.000001);
    }

    @Test void gpa_fourGrades_returnsAverage() {
        assertEquals(2.5, calculator.gpa(new double[]{95, 85, 75, 65}), 0.000001);
    }
}