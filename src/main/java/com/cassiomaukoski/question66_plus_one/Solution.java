package com.cassiomaukoski.question66_plus_one;

class Solution {

    public int[] plusOne(int[] digits) {
        int carry = 0;

        int digit = digits[digits.length-1];
        digit++;
        if(digit == 10){
            digit = 0;
            carry = 1;
        }

        digits[digits.length-1] = digit;

        int index = digits.length-2;
        while (carry != 0){
            if(index == -1){
                int[] newDigits = new int[digits.length + 1];

                newDigits[0] = carry;

                System.arraycopy(digits, 0, newDigits, 1, digits.length);
                digits = newDigits;
                carry = 0;
            }else{
                digit = digits[index];
                digit++;
                if(digit == 10){
                    digit = 0;

                    carry = 1;
                }else {
                    carry = 0;
                }
                digits[index] = digit;
                index--;
            }
        }
        return digits;
    }
}
