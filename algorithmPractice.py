
def string_splosion(st):

    finalS = ""
    for i in range(len(st)):
        for k in range(i+1):
            finalS = finalS + st[k]
    return finalS

def sleepin(weekday, vacation):

    if (not weekday):
        return True
    else:
        if (vacation):
            return True
        
    return False

def main():

    #everything here is the definition of the main method

    print(string_splosion("penguin"))

    '''print("Hello World")


    print(sleepin(False, False))
    print(sleepin(True, False))
    print(sleepin(False, True))'''



if __name__ == "__main__":
    main()
