# 택배상자

def solution(order):
    answer = 0
    stack=[]
    i=0
    
    for box in range(1,len(order)+1) :
        stack.append(box)
        #print(stack)
        while len(stack)>0 and stack[-1]==order[i] :
            #print(order[i])
            answer+=1
            i+=1
            stack.pop()
    return answer
