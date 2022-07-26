def process_text(myArray)
    myString = ""
    myArray.map do |i|
        myString += i.to_s.strip + " "
    end
    return myString.strip     
end
