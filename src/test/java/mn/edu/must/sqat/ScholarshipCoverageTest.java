package mn.edu.must.sqat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ScholarshipCoverageTest {
    private final ScholarshipCalculator calculator = new ScholarshipCalculator();

    @Test void letterGrade_cScore_returnsC() {
        assertEquals("C", calculator.letterGrade(75));
    }

    @Test void letterGrade_dScore_returnsD() {
        assertEquals("D", calculator.letterGrade(65));
    }

    @Test void letterGrade_fScore_returnsF() {
        assertEquals("F", calculator.letterGrade(55));
    }

    @Test void letterGrade_negativeScore_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.letterGrade(-1));
    }

    @Test void letterGrade_scoreAbove100_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.letterGrade(101));
    }

    @Test void gpa_remainingGrades_includesDefaultBranch() {
        assertEquals(1.0,
                calculator.gpa(new double[]{75, 65, 55}), 0.000001);
    }

    @Test void gpa_nullArray_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gpa(null));
    }

    @Test void gpa_emptyArray_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.gpa(new double[]{}));
    }

    @Test void scholarship_negativeGpa_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(-0.1, 15, false));
    }

    @Test void scholarship_gpaAbove4_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(4.1, 15, false));
    }

    @Test void scholarship_negativeCredits_throws() {
        assertThrows(IllegalArgumentException.class,
                () -> calculator.scholarship(3.9, -1, false));
    }

    @Test void scholarship_violation_returns0() {
        assertEquals(0, calculator.scholarship(3.9, 16, true));
    }

    @Test void scholarship_topGpaInsufficientTopCredits_returns70() {
        assertEquals(70, calculator.scholarship(3.9, 14, false));
    }

    @Test void scholarship_middleGpaInsufficientCredits_returns50() {
        assertEquals(50, calculator.scholarship(3.5, 11, false));
    }

    @Test void scholarship_lowGpa_returns0() {
        assertEquals(0, calculator.scholarship(2.5, 16, false));
    }
}