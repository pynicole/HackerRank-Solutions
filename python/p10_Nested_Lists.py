if __name__ == '__main__':
    records=[]
    scores=[]
    for _ in range(int(input())):
        name = input()
        score = float(input())
        records.append([name, score])
        scores.append(score)
    
    # Sort records
    sortedRecords = sorted(records)
    #print(sortedRecords)
    # Remove duplicatees from scores
    removeDupScores = list(set(scores))
    # Sort scores
    sortedScores = sorted(removeDupScores)
    secLowGrade = sortedScores[1]
    #print(secLowGrade)
    

    for i in range(len(sortedRecords)):
        if sortedRecords[i][1] == secLowGrade:
            print(sortedRecords[i][0])
    
