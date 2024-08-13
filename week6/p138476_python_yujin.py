# 귤 고르기

def solution(k, tangerine):
    answer = 0
    
    Tcount = {}
    # 딕셔너리로 저장
    for i in tangerine :
        if i in Tcount :
            Tcount[i]+=1
        else : 
            Tcount[i]=1
            
    Tcount= sorted(Tcount.items(), key= lambda x : x[1])
    #print(Tcount)
    
    while k>0 :
        # 개수 많은거 꺼내기
        k-=Tcount.pop()[1]
        answer +=1
        
    return answer
