if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
        
        
    query_name = input()
    
    score=student_marks[query_name]
    total = 0
    count = 0
    for item in score:
        total = total + item
        count+=1
    average = total/count
    average_formated = "{:.2f}".format(average)
    print(average_formated)
