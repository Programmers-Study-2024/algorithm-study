# [3차] 파일명 정렬

def solution(files):
    answer = []
    idx = 0
    for f in files:
        # head / number / tail 구분
        f = f.lower()
        h = ""
        for i in range(len(f)): # 문자인 경우 h에 저장            
            if f[i].isdigit():
                f = f[i:] # h빼고 나머지
                break
            else:
                h += f[i]
        n = ""    
        for i in range(len(f)): # 숫자인 경우 n에 저장
            if not f[i].isdigit():
                f = f[i:] # n빼고 나머지
                break
            else:
                n += f[i]
        t = f # 남은 f는 tail
        answer.append([idx,h,n,t])
        idx += 1
        
    # header -> number -> tail 기준으로 정렬
    answer.sort(key = lambda x: (x[1],int(x[2]),x[0]))

    result = []
    for [a,b,c,d] in answer:
        result.append(files[a]) # 인덱스
                        
    return result
