package br.com.eventhorizon.edx.ucsandiego.algs200x.pa5;

import br.com.eventhorizon.common.pa.PATest;
import br.com.eventhorizon.common.pa.PATestType;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LongestCommonSubsequenceOfThreeSequencesTest extends PATest {
  private static final String SIMPLE_DATA_SET =
      "/test-dataset/pa5/longest-common-subsequence-of-three-sequences.csv";

  public LongestCommonSubsequenceOfThreeSequencesTest() {
    super(new LongestCommonSubsequenceOfThreeSequences());
  }

  @ParameterizedTest
  @CsvFileSource(resources = SIMPLE_DATA_SET, numLinesToSkip = 1)
  public void testNaiveSolutionWithSimpleDataSet(String input, String expectedOutput) {
    super.testNaiveSolution(input, expectedOutput.replace("%", "\n"));
  }

  @ParameterizedTest
  @CsvFileSource(resources = SIMPLE_DATA_SET, numLinesToSkip = 1)
  public void testFinalSolutionWithSimpleDataSet(String input, String expectedOutput) {
    super.testFinalSolution(input, expectedOutput.replace("%", "\n"));
  }

  @Override
  protected String generateInput(PATestType type) {
    StringBuilder input = new StringBuilder();
    int n;
    int m;
    int l;
    switch (type) {
      case TIME_LIMIT_TEST:
        n = getRandomInteger(1, 100);
        m = getRandomInteger(1, 100);
        l = getRandomInteger(1, 100);
        break;
      case STRESS_TEST:
      default:
        n = getRandomInteger(1, 5);
        m = getRandomInteger(1, 5);
        l = getRandomInteger(1, 5);
        break;
    }
    input.append(n);
    for (int i = 0; i < n; i++) {
      input.append(" ").append(getRandomInteger(1, 2000000001) - 1000000001);
    }
    input.append(" ").append(m);
    for (int i = 0; i < m; i++) {
      input.append(" ").append(getRandomInteger(1, 2000000001) - 1000000001);
    }
    input.append(" ").append(l);
    for (int i = 0; i < l; i++) {
      input.append(" ").append(getRandomInteger(1, 2000000001) - 1000000001);
    }
    return input.toString();
  }
}
