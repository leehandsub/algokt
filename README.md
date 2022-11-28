# kotlin 정리

## priority_queue 사용

기본적으로 오름차순 정렬로 되어있다.

peek() 맨위에 값을 가져온다.

poll() pop하면서 pop한 값을 리턴한다.

val pq2 = PriorityQueue<Int>(Collections.reverseOrder()) 내림차순 하는 방법