# 개인정보 수집 유효기간

def solution(today, terms, privacies):
    answer = []
    
    term={} # 약관 : 유효기간
    today=list(map(int,today.split(".")))
    
    for i in terms:
        a,b=i.split(" ")
        term[a]=int(b)
    
    for i in range(len(privacies)):
        a,rule=privacies[i].split(" ")
        y,m,d=map(int,a.split("."))
        
        #print(rule,y,m,d)
        
        for key,value in term.items():
            if key==rule :
                m+=value
                if m>12 :
                    y+= (m - 1) // 12 
                    m=(m - 1) % 12 + 1 
                    
        print(today)
        print(rule,y,m,d)
        
        if y < today[0] :
            answer.append(i+1)
        if y == today[0] and m < today[1] :
            answer.append(i+1)
        if  y == today[0] and m == today[1] and d <= today[2] :
            answer.append(i+1)
        
            
    return answer
