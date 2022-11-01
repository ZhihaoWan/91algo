class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();
        int p1 = num.length - 1;
        int sum = 0;
        int carry = 0;
        int a = 0;
        int b = 0;

        while(p1 >= 0 || k != 0){
            a = p1 >= 0 ? num[p1] : 0;
            b = k != 0 ? (k % 10) : 0;
                
            sum = a + b + carry;
            carry = sum / 10;
            k /= 10;
            
            p1--;
            res.add(0, sum % 10);
        }

        if(carry != 0) res.add(0, carry);
        return res;
    }
}

