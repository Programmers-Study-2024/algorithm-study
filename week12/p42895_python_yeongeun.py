# n으로 표현

# n 숫자만을 이용한 사칙연산으로 number를 만들어야함
def solution(N, number):
    
    if number == 1:
        return 1
    
    # 1~8 n 사용
    dp = [set() for i in range(8)]
    for i in range(len(dp)):
        dp[i].add(int(str(N)*(i+1)))
        # n, nn, nnn, ...
    
    # n 2개 사용하는 것부터 시작
    # 55에다가 +5,-5,*5,//5 결과 dp에 추가
    for i in range(1,8):
        for j in range(i):
            for op1 in dp[j]:
                for op2 in dp[i-j-1]:
                    dp[i].add(op1+op2)
                    dp[i].add(op1-op2)
                    dp[i].add(op1*op2)
                    if op2 != 0:
                        dp[i].add(op1//op2)                    
        
        # 만든 집합에 number가 나오는지 확인 (처음나오면 바로 return)
        if number in dp[i]:
            return i+1

    return -1
