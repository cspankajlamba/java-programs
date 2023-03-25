public class PlusOne{
public int[] plusOne(int[] digits) {
    // Traverse the digits from right to left
    for (int i = digits.length - 1; i >= 0; i--) {
        // Increment the current digit by 1
        digits[i]++;

        // Check if the current digit is less than 10
        if (digits[i] < 10) {
            // No need to carry over, return the incremented array
            return digits;
        }

        // Carry over the 1 to the next digit
        digits[i] = 0;
    }

    // If we reach here, we need to add a new digit at the beginning of the array
    int[] newDigits = new int[digits.length + 1];
    newDigits[0] = 1;

    return newDigits;
}
}
