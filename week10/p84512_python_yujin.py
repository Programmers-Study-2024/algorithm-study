# 모음사전

answer = 0
cnt= -1
def solution(word):
    words='AEIOU'
    
    def dfs(tmp):
        global answer,cnt
        if len(tmp) <= 5 :
            cnt+=1
            if tmp==word :
                answer=cnt
                #print(tmp,answer)
                return
        else : 
            return 
        
        for i in range(5):
            dfs(tmp+words[i])
        
    dfs('')    
    return answer
