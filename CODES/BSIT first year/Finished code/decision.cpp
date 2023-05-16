#include<iostream>
using namespace std;

void addition(double num1, double num2);
void subtraction(double num1, double num2);
void multiplication(double num1, double num2);
void division(double num1, double num2);
int main()
{

	double num1, num2;
	char choice;
	
	cout<<"    Simple Calculator\n"<<endl;
	cout<<" Enter a number:\t";
	cin>>num1;
	cout<<" Enter another number:\t";
	cin>>num2;
	cout<<endl;
	cout<<" a. Addition"<<endl;
	cout<<" b. Subtraction"<<endl;
	cout<<" c. Multiplication"<<endl;
	cout<<" d. Division\n"<<endl;
	cout<<" Enter the letter of your choice: ";
	redo:
	cin>>choice;
	
	if(choice == 'A'||choice == 'a')
	{
		addition(num1, num2);
	}
	else if(choice == 'B'||choice == 'b')
	{
		subtraction(num1, num2);
	}
	else if(choice == 'C'||choice == 'c')
	{
		multiplication(num1, num2);
	}
	else if(choice == 'D'||choice == 'd')
	{
		division(num1, num2);
	}
	else
	{
		cout<<"\n Input is invalid."<<endl;
		cout<<" Please reenter the letter of your choice: ";
		goto redo;
	}

}
void addition(double num1, double num2)
{
	cout<<"\n The sum of "<<num1<<" plus "<<num2<<" is "<<num1+num2<<"\n\n\n";
}
void subtraction(double num1, double num2)
{
	cout<<"\n The difference of "<<num1<<" minus "<<num2<<" is "<<num1-num2<<"\n\n\n";
}
void multiplication(double num1, double num2)
{
	cout<<"\n The product of "<<num1<<" times "<<num2<<" is "<<num1*num2<<"\n\n\n";
}
void division(double num1, double num2)
{
	cout<<"\n The quotient of "<<num1<<" divided by "<<num2<<" is "<<num1/num2<<"\n\n\n";
}

