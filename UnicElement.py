n = int(input("Enter the size of the array: "))
print("Enter ",n," elements: ")
list1 = []
for i in range(n):
    temp = int(input())
    list1.append(temp)
print("Your entered list is: ",list1)
print("Unic element list is: ",set(list1))