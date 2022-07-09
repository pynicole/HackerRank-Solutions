def mutate_string(string, position, character):
    count = 0
    t=[]
    
    for ch in string:

        if count==position:
            t.append(character)
            count+=1
        else:
            t.append(ch)
            count+=1
            
    m = ''.join(t)
    return m

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
