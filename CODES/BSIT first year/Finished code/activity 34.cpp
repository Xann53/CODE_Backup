#include<iostream>
using namespace std;

void read(int num1, int num2, int num3);
void reverse(int rev1, int rev2, int rev3);
int main()
{

	int num1, num2, num3;
	
	cout<<"\n   Enter a number: ";
	cin>>num1;
	cout<<"\n   Enter a second number: ";
	cin>>num2;
	cout<<"\n   Enter a third number: ";
	cin>>num3;
	cout<<"\n"<<endl;
	
	read(num1, num2, num3);
	reverse(num1, num2, num3);

}
void read(int num1, int num2, int num3)
{

	cout<<"   In order:\n\n";
	cout<<"    "<<num1<<"\n";
	cout<<"    "<<num2<<"\n";
	cout<<"    "<<num3<<"\n";
	cout<<"\n"<<endl;

}
void reverse(int rev1, int rev2, int rev3)
{

	cout<<"   In reverse:\n\n";
	cout<<"    "<<rev3<<"\n";
	cout<<"    "<<rev2<<"\n";
	cout<<"    "<<rev1<<"\n";
	cout<<"\n"<<endl;

}

