/*
문제 : 푸드 파이트 대회
시간 : 15분
ide 활용 : o
질문 보기 : x
피드백 : 일단 string 앞뒤로 붙이게 했따.
배열 뒤에서부터 탐색하는 방법을 몰라서 찾아봣다. reversed() 사용하면 된다.
*/

class Solution {
    fun solution(food: IntArray): String {
        var answer: String = "0"

        for (i in (food.indices).reversed()) {
            for (j in 0 until food[i] / 2) {
                answer += i.toString()
                answer = i.toString() + answer
            }
        }
        return answer
    }
}

fun main() {
    print(Solution().solution(intArrayOf(1, 3, 4, 6)) == "1223330333221")
}