# 개인정보 수집 유효기간

def solution(today, terms, privacies):    
    answer = []
    year,month,day = int(today[:4]), int(today[5:7]), int(today[8:])
    dic = dict()
    for term in terms:
        dic[term[0]] = int(term[2:])
    
    # 개인정보 수집일자 + 유효기간 < today : 파기 answer
    for i in range(len(privacies)):
        data, case = privacies[i].split()
        p_year,p_month,p_day = int(data[:4]), int(data[5:7]), int(data[8:])
        p_month += dic[case]
        
        while p_month > 12:
            p_year += 1
            p_month -= 12
            
        if p_year > year :
            continue
        elif p_year == year:
            if p_month > month:
                continue
            elif p_month == month:
                if p_day > day:
                    continue
        answer.append(i+1)
        
    return answer
