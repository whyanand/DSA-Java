public class EvenDigits {
  public static void main(String[] args) {
    int[] nums = { 1, 22, 333, 4444, 55555, 666666 };
    System.out.println(evenDigits(nums));
  }

  static int evenDigits(int[] nums) {
    int numCount = 0;
    for (int a : nums) {
      int temp = a;
      int digitCount = 0;
      while (temp > 0) {
        temp /= 10;
        digitCount++;
      }
      if (digitCount % 2 == 0) {
        numCount++;
      }
    }

    return numCount;
  }

}
