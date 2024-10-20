# 완주하지 못한 선수

def solution(participant, completion):
    hashDict = {} # {hasp(p), p} 형태로 딕셔너리 저장
    sumHash = 0
    
    for p in participant:
        hashDict[hash(p)] = p
        sumHash += hash(p) # 마라톤 참여한 사람 더하기

    for c in completion:
        sumHash -= hash(c) # 완주한 사람 빼기

    return hashDict[sumHash]
