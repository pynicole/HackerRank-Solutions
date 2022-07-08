if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    
    #arr2=[-10,0,10]
    removeDup = list(set(arr))
    #print(removeDup)
    sortedArr = sorted(removeDup)
    print(sortedArr[-2])
