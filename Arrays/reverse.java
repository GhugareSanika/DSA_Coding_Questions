/*---------------------Reverse array in groups-------------------------

    Input: k = 3, arr= [1, 2, 3, 4, 5]
    Output: [3, 2, 1, 5, 4]
 */
class reverse {
    // Function to reverse every sub-array group of size k.
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int counter =1;
        for (int i = 0; i < arr.size(); i += k) {
            int start = i;
            int end = k*counter-1;
            if(end > arr.size() - 1){
                end = arr.size()-1;
            }

            while (start < end) {
                Long temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);
                start++;
                end--;
            }
             counter++;
        }
    }
}