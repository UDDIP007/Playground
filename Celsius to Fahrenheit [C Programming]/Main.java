#include <stdio.h>
float fahrenheit(float celsius);
float kelvin(float celsius);
int main()
{
    float celsius;
    scanf("%f",&celsius);
    printf("temperature in Fahrenheit %f", fahrenheit(celsius));
    printf("\ntemperature in Kelvin %f", kelvin(celsius));
    return 0;
}
float fahrenheit(float celsius)
{
	//type your code here
  float fah;
  fah=(celsius/5*9)+32;
  return fah; 
}
float kelvin(float celsius)
{
	//type your code here
  float fah;
  fah=celsius+273.15;
  return fah; 
} 
  
  
  

