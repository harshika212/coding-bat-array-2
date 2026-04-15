// Given an array of ints, return true if the number of 1's is greater than the number of 4's


// more14([1, 4, 1]) → true
// more14([1, 4, 1, 4]) → false
// more14([1, 1]) → true

int count1 = 0;
  int count4 = 0;

  for (int num : nums) {
    if (num == 1) count1++;
    if (num == 4) count4++;
  }

  return count1 > count4;
