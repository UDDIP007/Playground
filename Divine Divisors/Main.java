value=int(input())

divisor=list()
for i in range(1,int(value**0.5)+1):
  if value%i==0:
    print(i,end=" ")
    if int(value/i)!=i:
      divisor.append(int(value/i))

divisor.sort()
print(*divisor,end=" ")
