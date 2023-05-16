#include<iostream>
using namespace std;
int main()
{

	int num1, num2, result;
	char operation;
	
	retry:
	system("cls");
	cout<<"Enter a number:\t\t";
	cin>>num1;
	cout<<"Enter another number:\t";
	cin>>num2;
	cout<<endl;
	
	cout<<"Choose an operation:\n";
	cout<<"A. Addition\n";
	cout<<"B. Subtraction\n";
	cout<<"C. Multiplication\n";
	cout<<"D. Division\n";
	cout<<"Enter the letter of your choice:\t";
	cin>>operation;
	cout<<endl;
	
	if(operation == 'a' || operation == 'A')
	{
		result = num1 + num2;
		goto result;
	}
	else if(operation == 'b' || operation == 'B')
	{
		result = num1 - num2;
		goto result;
	}
	else if(operation == 'c' || operation == 'C')
	{
		result = num1 * num2;
		goto result;
	}
	else if(operation == 'd' || operation == 'D')
	{
		result = num1 / num2;
		goto result;
	}
	else
	{
		cout<<"Invalid Input. ";
		goto option;
	}
	
	result:
	cout<<"Result is: "<<result<<"\n"<<endl;
	option:
	cout<<"Would you like to try again? (y)yes (n)no\n\t\t";
	cin>>operation;
	
	if(operation == 'y' || operation == 'Y')
	{
		goto retry;
	}
	else
	{
		goto exit;
	}
	
	exit:
	
	return 0;

}

