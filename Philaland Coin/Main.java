test_case=int(input())
for i in range(test_case):
  total=int(input())
  count=0
  while(total!=0):
    total=total>>1
    count=count+1
  print(count)  
    