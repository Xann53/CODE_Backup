#include<iostream>
using namespace std;
int addition(int num1, int num2);
int subtraction(int num1, int num2);
int multiplication(int num1, int num2);
void division(int num1, int num2, int *quotient, int *remainder);
int main()
{

	int num1, num2, equation, ans, ans2, q, r;
	
	cout<<"\n   Enter a number: ";
	cin>>num1;
	cout<<"\n   Enter a second number: ";
	cin>>num2;
	cout<<"\n   Choose an equation: ";
	cout<<"\n   1. Addition";
	cout<<"\n   2. Subtraction";
	cout<<"\n   3. Multiplication";
	cout<<"\n   4. Division and Modulus\n\n      ";
	cin>>equation;
	
	if(equation == 1)
	{
		ans = addition(num1, num2);
		system("Cls");
		cout<<"\n   The sum is: "<<ans<<"\n\n\n";
	}
	else if(equation == 2)
	{
		ans = subtraction(num1, num2);
		system("Cls");
		cout<<"\n   The difference is: "<<ans<<"\n\n\n";
	}
	else if(equation == 3)
	{
		ans = multiplication(num1, num2);
		system("Cls");
		cout<<"\n   The product is: "<<ans<<"\n\n\n";
	}
	else if(equation == 4)
	{
		division(num1, num2, &q, &r);
		system("Cls");
		cout<<"\n   The quotient is: "<<q<<"\n";
		cout<<"\n   The remainder is: "<<r<<"\n\n\n";
	}
	
	return 0;

}
int addition(int num1, int num2)
{
	int ans;
	ans = num1 + num2;
	return ans;
}
int subtraction(int num1, int num2)
{
	int ans;
	ans = num1 - num2;
	return ans;
}
int multiplication(int num1, int num2)
{
	int ans;
	ans = num1 * num2;
	return ans;
}
void division(int num1, int num2, int *quotient, int *remainder)
{
	*quotient = num1 / num2;
	*remainder =num1 % num2;
}

