/*
문제 : 과일 장수
시간 : 5분
ide 활용 : o
질문 보기 : x
피드백 : 음 그냥 sort해서 일정한 값들 더해주면 되는 문제다...
다른 사람 코드를 보니까 sortDescending()이 있던데 참고해야겟다.
*/

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        var answer: Int = 0
        val apple = score.sorted().reversed()

        for (i in apple.indices) {
            if (i % m == m - 1)
                answer += (apple[i] * m)
        }
        return answer
    }
}


fun main() {
    print(Solution().solution(4, 20, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2)) == 0)
}