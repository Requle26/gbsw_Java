class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length / n];
        int indexCnt = 0;
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[indexCnt];
            indexCnt += n;
            if (indexCnt + 1 >= num_list.length) {
                break;
            }
        }
        return answer;
    }
    void main() {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}, 2));
    }
}