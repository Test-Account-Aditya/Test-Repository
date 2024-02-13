paren = input("Enter Parenthesis For Checking: ")
cnt = 0
flag = False
for i in paren:
    if(i == "("):
        cnt += 1
    if(i == ")"):
        cnt -= 1
    if(i == "{"):
        cnt += 1
    if(i == "}"):
        cnt -= 1
    if(i == "["):
        cnt += 1
    if(i == "]"):
        cnt -= 1
    else:
        continue
        
if( cnt == 0):
    print("Matching")
    
else:
    print("Not Matching")
         