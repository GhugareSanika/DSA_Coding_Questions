/*----------------------Merge Intervals-------------------

    Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
    Output: [[1,6],[8,10],[15,18]]
    Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
*/

public class Merge_interval {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));
        List<int[]> result = new ArrayList<>();

        int[] newInterval = intervals[0];
        result.add(newInterval);

        for(int [] interval : intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            }else{
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
