def swap_case(s):
    stringList = []
    for ch in s:
        if ch.isupper() == True:
            stringList.append(ch.lower())
        elif ch.islower() == True:
            stringList.append(ch.upper())
        else:
            stringList.append(ch)
    
    t = ''.join(stringList)
    return t
            
if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
