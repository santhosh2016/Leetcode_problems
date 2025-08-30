

class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();
        
        for (String op : operations) {
            int n = scores.size();
            
            if (op.equals("+")) {
                scores.add(scores.get(n - 1) + scores.get(n - 2));
            } else if (op.equals("D")) {
                scores.add(2 * scores.get(n - 1));
            } else if (op.equals("C")) {
                scores.remove(n - 1);
            } else {
                scores.add(Integer.parseInt(op));
            }
        }
        
        int sum = 0;
        for (int s : scores) sum += s;
        return sum;
    }
}
