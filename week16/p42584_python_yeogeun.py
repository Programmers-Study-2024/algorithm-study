# 주식가격

def solution(prices):
    answer = [0]*len(prices)
    stack = [] # 인덱스
    
    # 주식 가격 떨어진 기간 구하기
    for idx,price in enumerate(prices):
        while stack and prices[stack[-1]] > price:
            j = stack.pop()
            answer[j] = idx-j
        stack.append(idx)
    
    while stack:
        j = stack.pop()
        answer[j] = len(prices)-1-j
    return answer
