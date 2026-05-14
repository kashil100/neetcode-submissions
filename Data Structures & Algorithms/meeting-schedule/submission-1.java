/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        if(n==0 || n==1){
            return true;
        }
        int[][] temp = new int[n][2];
        for(int i = 0;i<n;i++){
            temp[i][0] = intervals.get(i).start;
            temp[i][1] = intervals.get(i).end;
        }

        Arrays.sort(temp, (a,b)-> Integer.compare(a[0],b[0]));
        for(int i = 1;i<n;i++){
            if(temp[i][0]<temp[i-1][1]){
                return false;
            }
        }

        return true;
    }
}
