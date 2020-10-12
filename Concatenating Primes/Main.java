def prime(n):
    flag=0
    for i in range(2,int(n//2)+1):
        if n%i==0:
                  flag=flag+1
                  break  
        
    if flag==0:
        return 1
    else:
        return 0

n=int(input())
primes=[]
for i in range(2,n+1):
      if(prime(i)==1):
            primes.append(i)            
second=[]
count=0
for i in primes:
      for j in primes:
        product=str(i)+str(j)
        product=int(product)
        if prime(product)==1 and product not in second:
              second.append(product)
              count=count+1
print(count)              