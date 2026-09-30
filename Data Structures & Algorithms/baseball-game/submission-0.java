class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> s = new Stack<Integer>();
        int total = 0;

        for (String op : operations){
            if (op.equals("+")){
                int last = s.pop();
                int sLast = s.peek();
                int newVal = last + sLast;
                s.push(last);
                s.push(newVal);
            }
            else if(op.equals("D")){
                int last = s.peek();
                s.push(last*2);
            }
            else if(op.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(op));
            }
        }
        for (int x : s){
            total += x;
        }
        return total;

        
    }
}