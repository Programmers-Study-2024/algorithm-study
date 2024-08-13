# 연속 부분 수열 합의 개수

def solution(elements):
    answer = set()
    
    for i in range(len(elements)):
        sum=0
        for j in range(i, i+len(elements)):
            idx = j % len(elements);
            sum += elements[idx];
            answer.add(sum);
            
    #print(answer)
    return len(answer)
