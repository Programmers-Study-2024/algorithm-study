# [1차] 프렌즈4블록

def solution(m, n, board):
    answer = 0
    B = [list(x) for x in board]
    D = set()
    
    while True :
        for i in range(m-1):
            for j in range(n-1):
                friend=B[i][j]
                if (friend==[]) : 
                    continue
                else : 
                    if (B[i][j+1] == friend and B[i+1][j] == friend and B[i+1][j+1] == friend) :
                        D.add((i,j))
                        D.add((i,j+1))
                        D.add((i+1,j))
                        D.add((i+1,j+1))
      
        if len(D) >0 :
            answer += len(D)
            for i,j in D :
                B[i][j] = []
            D = set()
        else :
            break
            
        while True :
            moved = True
            for i in range(m-1) :
                for j in range(n) :
                    if( B[i][j] and B[i+1][j] == [] ) :
                        B[i][j],B[i+1][j] = B[i+1][j],B[i][j]
                        moved = False
            if moved :
                break
        
    return answer
