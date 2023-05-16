#include<iostream>

using namespace std;
int main()
{

	int num1, num2;
	
	cout<<"Please Enter a Number:\t\t";
	cin>>num1;
	cout<<"\nPlease Enter another Number:\t";
	cin>>num2;
	cout<<"\n"<<endl;
	
	if(num1 > num2)
	{
		cout<<"The first number is greater.\n\n";
	}
	else if(num1 < num2)
	{
		cout<<"The second number is greater.\n\n";
	}
	else 
	{
		cout<<"There is no greater number.\n\n";
	}
	
	return 0;

}

