#include<iostream>
#include<iomanip>
using namespace std;

void ascending(int num1, int num2);
void descending(int num1, int num2);
int main()
{

	int num1, num2;
	
	cout<<"   Counting Loop\n"<<endl;
	cout<<"Enter a number: ";
	cin>>num1;
	cout<<"Enter another number: ";
	cin>>num2;
	
	if(num1 <= num2)
	{
		ascending(num1, num2);
	}
	else if(num1 >= num2)
	{
		descending(num1, num2);
	}
	
	return 0;

}
void ascending(int num1, int num2)
{
	while(num1 <= num2)
	{
		cout<<"\t"<<setw(5)<<num1;
		num1++;
	}
}
void descending(int num1, int num2)
{
	while(num1 >= num2)
	{
		cout<<"\t"<<setw(5)<<num1;
		num1--;
	}
}

