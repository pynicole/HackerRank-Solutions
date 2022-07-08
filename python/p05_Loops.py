if __name__ == '__main__':
    n = int(input())
    
    numList = []
    if n > 0:
        while n > 0:
            n = n-1
            numList.insert(0,n)
     
    for x in numList:
        print(x*x)
