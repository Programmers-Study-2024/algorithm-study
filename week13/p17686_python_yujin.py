# [3차] 파일명 정렬

def solution(files):
    answer = []
    
    for f in files:
        head,number,tail='','',''
        
        number_check = False
        for i in range(len(f)):
            if  '0' <= f[i] <= '9':  
                number += f[i]
                number_check = True
            elif not number_check: 
                head += f[i]
            else:              
                tail = f[i:]
                break
        answer.append((head, number, tail))
        
    answer.sort(key=lambda x: (x[0].lower(), int(x[1])))
    return [''.join(i) for i in answer]
