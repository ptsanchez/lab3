import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReveresdInPlaceOther() {
    int[] input1 = {1, 2, 3, 4};
    int[] reversedInput1 = {4, 3, 2, 1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(reversedInput1, input1);
  }
  @Test
  public void testAverageWithoutLowest() {
    double[] input = {1, 2, 3, 4};
    double averageWithoutLowestInput = 3;
    double returnedValue = ArrayExamples.averageWithoutLowest(input);
    assertEquals(averageWithoutLowestInput, returnedValue, 0.1);
  }

  @Test
  public void testAverageWithoutLowestSameValues() {
    double[] input = {1, 1, 1, 1};
    double averageWithoutLowestInput = 0.0;
    double returnedValue = ArrayExamples.averageWithoutLowest(input);
    assertEquals(averageWithoutLowestInput, returnedValue, 0.1);
  }

  @Test
  public void testAverageWithoutLowestOther() {
    double[] input = {};
    //double averageWithoutLowestInput = 9.25;
    double returnedValue = ArrayExamples.averageWithoutLowest(input);
    assertEquals(0.0, returnedValue, 0.01);
  }
}
