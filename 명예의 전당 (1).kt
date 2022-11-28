import java.util.*

/*
문제 : pr 명예의 전당 (1)
시간 : 10분
ide 활용 : o
질문 보기 : x
피드백 : 단순히 priorityQueue를 사용하는 문제이다.
kotlin 으로 처음 사용해서 당황스럽긴햇지만 하나씩 천천히 해봐야겟다.
*/

class Solution {
    fun solution(k: Int, score: IntArray): List<Int> {
        val answer = mutableListOf<Int>()
        val pq = PriorityQueue<Int>()

        for (i in score) {
            if (pq.size == k) {
                if (i > pq.peek()) {
                    pq.add(i)
                    pq.poll()
                }
            } else {
                pq.add(i)
            }
            answer.add(pq.peek())
        }
        return answer
    }
}