if __name__ == '__main__':
    N = int(input())
    mylist=list()
    
    for _ in range(N):
        s = input().strip().split(" ")
        
        if s[0]=="insert":
            mylist.insert(int(s[1]),int(s[2]))
            
        if s[0]=="print":
            print(mylist)
            
        if s[0]=="remove":
            mylist.remove(int(s[1]))
            
        if s[0]=="append":
            mylist.append(int(s[1]))
            
        if s[0]=="sort":
            mylist.sort()
            
        if s[0]=="pop":
            mylist.pop()
            
        if s[0]=="reverse":
            mylist.reverse()
