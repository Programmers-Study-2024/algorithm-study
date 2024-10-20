# [1차] 비밀지도

def solution(n, arr1, arr2):
    answer = []
    arr3=[0]*len(arr1)
    
    for i in range(len(arr1)):
        k=arr1[i]|arr2[i]
        arr3[i]=format(k,'b').zfill(n)
    
    for arr in arr3:
        tmp=''
        for i in arr:
            if i=='1': 
                tmp+='#'
            else :
                tmp+=' '
        answer.append(tmp)
        
    return answer
