# 연속 부분 수열 합의 개수(O)

def solution(elements):
    combi = []
    new = elements*2
    
    # 모든 가능한 조합들
    for i in range(1,len(elements)+1): # 길이 1~5까지
        for j in range(len(elements)):
            combi.append(sum(new[j:j+i]))

    # 중복합 제거
    answer = len(set(combi))
    return answer
