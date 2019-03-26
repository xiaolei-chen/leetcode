class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        char[] num1Char = num1.toCharArray();
        char[] num2Char = num2.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry == 1){
            int a = (i >= 0) ? (num1Char[i] - '0') : 0;
            i--;
            int b = (j >= 0) ? (num2Char[j] - '0') : 0;
            j--;
            int sum = a + b + carry;
            sb.insert(0, sum % 10);
            carry = sum / 10;
        }
        return sb.toString();
    }
}

/*
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        char[] num1Char = a.toCharArray();
        char[] num2Char = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0 || carry == 1){
            int num1 = (i >= 0) ? (num1Char[i] - '0') : 0;
            i--;
            int num2 = (j >= 0) ? (num2Char[j] - '0') : 0;
            j--;
            int sum = num1 + num2 + carry;
            sb.insert(0, sum % 2);
            carry = sum / 2;
        }
        return sb.toString();
    }
}
*/