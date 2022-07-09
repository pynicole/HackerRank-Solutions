if __name__ == '__main__':
    s = input()
    
    if(any(ch.isalnum() for ch in s)):
        print('True')
    else:
        print('False')
    if(any(ch.isalpha() for ch in s)):
        print('True')
    else:
        print('False')
    if(any(ch.isdigit() for ch in s)):
        print('True')
    else:
        print('False')
    if(any(ch.islower() for ch in s)):
        print('True')
    else:
        print('False')
    if(any(ch.isupper() for ch in s)):
        print('True')
    else:
        print('False')
