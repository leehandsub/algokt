/*
문제 : 기사단원의 무기
시간 : 10분
ide 활용 : o
질문 보기 : x
피드백 : 일단 약수를 구하는 문제인데 nlongn 시간이 걸리게 구현했다.
하지만 이거보다 더빠른게 있을거 같긴하다.
import하는 것을 잘 생각해야겠다. 그리고 array 정의하는 방법을 알았따.
*/
import java.lang.Math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        val arr = Array(number + 1) { 0 }
        for (i in 1 until number + 1) {
            for (j in 1 until sqrt(i.toDouble()).toInt() + 1) {
                if (i % j == 0) {
                    if (i == j * j)
                        arr[i] += 1
                    else
                        arr[i] += 2
                }
            }
        }
        for (i in arr) {
            answer += if (i > limit)
                power
            else
                i
        }
        return answer
    }
}

fun main() {
    print(Solution().solution(5, 3, 2) == 10)
}