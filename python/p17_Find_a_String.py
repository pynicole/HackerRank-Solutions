def count_substring(string, sub_string):
    i = 0
    e = len(sub_string)
    count=0
    while e<=len(string):
        if(string[i:e]==sub_string):
            count+=1
            i+=1
            e+=1
            
        else:
            i+=1
            e+=1
        
    return count

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
