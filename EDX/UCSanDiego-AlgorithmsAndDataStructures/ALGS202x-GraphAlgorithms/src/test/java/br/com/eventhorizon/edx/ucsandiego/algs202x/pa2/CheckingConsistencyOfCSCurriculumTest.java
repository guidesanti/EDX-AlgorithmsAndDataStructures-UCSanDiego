package br.com.eventhorizon.edx.ucsandiego.algs202x.pa2;

import br.com.eventhorizon.common.pa.test.PASolution;
import br.com.eventhorizon.common.pa.test.PATestBase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CheckingConsistencyOfCSCurriculumTest extends PATestBase {

  private static final String SIMPLE_DATA_SET = "/test-dataset/pa2/checking-consistency-of-cs-curriculum.csv";

  public CheckingConsistencyOfCSCurriculumTest() {
    super(new CheckingConsistencyOfCSCurriculum());
  }

  @ParameterizedTest
  @CsvFileSource(resources = SIMPLE_DATA_SET, numLinesToSkip = 1)
  public void testTrivialSolutionWithSimpleDataSet(String input, String expectedOutput) {
    super.testSolution(PASolution.TRIVIAL, input, expectedOutput);
  }

  @ParameterizedTest
  @CsvFileSource(resources = SIMPLE_DATA_SET, numLinesToSkip = 1)
  public void testFinalSolutionWithSimpleDataSet(String input, String expectedOutput) {
    super.testSolution(PASolution.FINAL, input, expectedOutput);
  }
}
