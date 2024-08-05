# PCCE 기출문제 10번 / 데이터 분석

def solution(data, ext, val_ext, sort_by):
    answer = []
        
    idx = ['code','date','maximum','remain']
    a = idx.index(ext) # ext의 인덱스
    b = idx.index(sort_by) # sort_by의 인덱스
    
    for i in range(len(data)):
        if data[i][a] < val_ext : # val_ext보다 작은 데이터만 뽑긷
            answer.append(data[i])
            
    answer.sort(key = lambda x:x[b]) # sort_by를 기준으로 정렬
    
    return answer
