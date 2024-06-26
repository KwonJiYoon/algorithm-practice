### Two-Pointers   

```
💡 배열이나 리스트와 같은 선형 데이터 구조에서 두 개의 포인터를 사용하여 문제를 해결하는 알고리즘 기법   
💡 주로 정렬된 배열에서 특정 조건을 만족하는 부분 배열이나 부분 집합을 찾을 때 유용
```

>**주요 개념** 👀 

1. **_두개의 포인터 사용_** :
   * 두 개의 포인터를 배열과 시직과 끝, 혹은 배열의 특정 위치에 배치
2. **_포인터 이동_** :
    * 각 단계마다 조건 검사, 그 조건에 따라 포인터 이동
    * 일반적으로 한 포인터는 왼쪽에서 오른쪽으로 이동, 다른 포인터는 오른쪽에서 왼쪽으로 이동
3. **_조건 만족 확인_** :
   * 포인터들이 가리키는 요소들을 검사하여 조건을 만족하는지 확인  
   * 조건을 만족하지 않으면 포인터를 이동시키고 다시 검사

<br>

>**Example** 🔎 

#### 📃 Problem
```
- 정렬된 배열 nums와 목표 합 target이 주어질 때, 
두 수의 합이 target이 되는 배열의 두 인덱스를 찾는 함수 twoSum을 작성하시오.
```

#### 🖥️ 예시 코드 
```java
public class TwoPointerExample {
    public static int[] twoSum(int [] nums, int target) {
        int left = 0;   // 왼쪽 포인터
        int right = nums.length - 1;    // 오른쪽 포인터
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[] {left, right};
            } else if (sum < target) {
                left++;     // 합이 목표 값보다 작으면 왼쪽 포인터를 오른쪽으로 이동
            } else {
                right--;    // 합이 목표 값도가 크면 오른쪽 포인터를 왼쪽으로 이동
            }
        }
        return new int[] {};    // 조건을 만족하는 쌍이 없는 경우
    }
}
```
<br>

#### 🔥코드 설명   

✅ **_포인터 초기화_** :
* left 포인터는 배열의 시작(0번 인덱스)에 위치
* right 포인터는 배열의 끝(마지막 인덱스)에 위치

✅ **_반복문_** :
* while (left < right) 조건 하에서 반복
* 포인터가 교차하거나 만나면 종료

✅ **_현재 합 계산_** :
* nums[left] + nums[right]을 계산하여 sum에 저장

✅ **_조건 확인 및 포인터 이동_** :
* sum이 target과 같으면 현재 포인터들이 가리키는 인덱스를 반환
* sum이 target보다 작으면 left 포인터를 오른쪽으로 이동
* sum이 target보다 크면 right 포인터를 왼쪽으로 이동

✅ **_결과 반환_** :
* 반복문이 끝날 때까지 조건을 만족하는 쌍을 찾지 못하면 빈 배열을 반환