# 여행경로

def solution(tickets):
    visited = [False] * len(tickets)
    
    tickets.sort(key=lambda x: (x[0], x[1]))
    
    def dfs(airport, path):
        if len(path) == len(tickets) + 1:
            return path 
        
        for idx, ticket in enumerate(tickets):
            if ticket[0] == airport and not visited[idx]:
                visited[idx] = True
                result = dfs(ticket[1], path + [ticket[1]]) 
                if result:  
                    return result
                visited[idx] = False
    
    return dfs("ICN", ["ICN"])
