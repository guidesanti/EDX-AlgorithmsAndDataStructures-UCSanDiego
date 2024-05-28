package br.com.eventhorizon.edx.ucsandiego.algs204x.pa1;

import br.com.eventhorizon.common.pa.test.PASolution;
import br.com.eventhorizon.common.pa.test.PATestBase;
import br.com.eventhorizon.common.pa.test.PATestSettings;
import br.com.eventhorizon.common.pa.test.PATestType;
import br.com.eventhorizon.common.utils.Utils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BuildTrieTest extends PATestBase {

  private static final String SIMPLE_DATA_SET = "/test-dataset/pa1/build-trie.csv";

  private static final char[] ALPHABET = { 'A', 'C', 'G', 'T' };

  public BuildTrieTest() {
    super(new BuildTrie(), PATestSettings.builder()
            .timeLimitTestEnabled(true)
            .build());
  }

  @ParameterizedTest
  @CsvFileSource(resources = SIMPLE_DATA_SET, numLinesToSkip = 1)
  @Disabled("Trivial solution is not implemented")
  public void testNaiveSolutionWithSimpleDataSet(String input, String expectedOutput) {
    super.testSolution(PASolution.TRIVIAL, input, expectedOutput);
  }

  @ParameterizedTest
  @CsvFileSource(resources = SIMPLE_DATA_SET, numLinesToSkip = 1)
  public void testFinalSolutionWithSimpleDataSet(String input, String expectedOutput) {
    super.testSolution(PASolution.FINAL, input, expectedOutput);
  }

  @Override
  protected String generateInput(PATestType type, StringBuilder expectedOutput) {
    StringBuilder input = new StringBuilder();
    int numberOfKeys = Utils.getRandomInteger(1, 100);
    input.append(numberOfKeys).append(" ");
    for (int i = 0; i < numberOfKeys; i++) {
      input.append(generateKey()).append(" ");
    }
    return input.toString();
  }

  private String generateKey() {
    char[] key = new char[Utils.getRandomInteger(1, 100)];
    for (int i = 0; i < key.length; i++) {
      key[i] = ALPHABET[Utils.getRandomInteger(0, ALPHABET.length - 1)];
    }
    return String.valueOf(key);
  }
}
