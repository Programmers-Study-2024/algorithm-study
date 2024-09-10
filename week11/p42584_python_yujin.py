# 주식가격

def solution(prices):
    answer = []
    
    for i in range (len(prices)) :
        n=0
        for j in range (i+1,len(prices)) :
            n+=1
            if (prices[i] > prices[j]) : break
        answer.append(n)
    return answer
