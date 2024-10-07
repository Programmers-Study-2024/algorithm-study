# 체육복

def solution(n, lost, reserve):
    answer = 0
    people=[1 for i in range(n)]
  
    # 도난,여벌
    for i in lost :
        people[i-1]-=1
    for i in reserve :
        people[i-1]+=1
    
    # 빌리기
    for i in range(len(people)):
        if people[i]==0:
            if i>0 and people[i-1]==2:
                people[i]=1
                people[i-1]=1
            elif i+1<n and people[i+1]==2:
                people[i]=1
                people[i+1]=1
    
    return n-people.count(0)
