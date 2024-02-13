n = int(input("Enter the size of the array: "))
list1 = []
print("Enter ",n," numbers: ")
for i in range(n):
    temp = int(input())
    list1.append(temp)

dupList = []
nonDupList = []
for i in list1:
    if(list1.count(i)>1):
        dupList.append(i)
    if( list1.count(i) == 1):
        nonDupList.append(i)


print("Duplicate element is: ",list(set(dupList)))
print("Non duplicates elements are: ",nonDupList)