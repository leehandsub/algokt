# kotlin 정리

## priority_queue 사용

기본적으로 오름차순 정렬로 되어있다.

peek() 맨위에 값을 가져온다.

poll() pop하면서 pop한 값을 리턴한다.

val pq2 = PriorityQueue<Int>(Collections.reverseOrder()) 내림차순 하는 방법

## 배열

val arr = Array(number + 1) { 0 } // 0으로 초기화하면서 정해진 크기 생성

배열 뒤에서부터 접근하는 방법

```kotlin
for (i in (food.indices).reversed()) {
    
}
```

## 소팅방법

`val apple = score.*sorted*().*reversed*()`

sort된 값을 넣는 방법

`val apple = score.*sort*().reversed()` x안된다. 왜??

score 자체를 바꾸는 방법

`score.*sortDescending*()`