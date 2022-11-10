package datastructures.brackets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBracketsTest {


  @Test
  public void testForValidation() {
    assertTrue(ValidateBrackets.validateBrackets("[hello]"));
  }

  @Test
  public void testForValidation2() {
    assertTrue(ValidateBrackets.validateBrackets("[{}]"));
  }

  @Test
  public void testForValidation3() {
    assertTrue(ValidateBrackets.validateBrackets("{{}}"));
  }

  @Test
  public void testForValidation4() {
    assertFalse(ValidateBrackets.validateBrackets("{"));
  }

  @Test
  public void testForValidation5() {
    assertFalse(ValidateBrackets.validateBrackets("]"));
  }

  @Test
  public void testForValidation6() {
    assertFalse(ValidateBrackets.validateBrackets("(])"));
  }

  @Test
  public void testForValidation7() {
    assertFalse(ValidateBrackets.validateBrackets("[{)}]"));
  }

  @Test
  public void testForValidation8() {
    assertTrue(ValidateBrackets.validateBrackets("{{}}[({mathew})]"));
  }
}
