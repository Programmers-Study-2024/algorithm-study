# 주식가격

def solution(prices):
    answer = [0]*len(prices)
    stack = [] # 인덱스 저장
    
    for idx,price in enumerate(prices):
        while stack and prices[stack[-1]] > price : # 가격 떨어짐 (이전값 < 현재값)
            j = stack.pop()
            answer[j] = idx-j # 가격 떨어지지 않은 기간(이전값과 현재값의 인덱스 차이)
        stack.append(idx)
        
    while stack: # 가격 안떨어진 인덱스
        j = stack.pop()
        answer[j] = len(prices)-1-j # 가격 떨어지지 않은 기간(전체-현재 인덱스-1) / 5-2-1=3
    
    return answer
