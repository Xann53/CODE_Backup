#include<iostream>
using namespace std;
int main()
{

	int num;
	char let;
	float dec;
	
	cout<<"Please enter a character from a to z: ";
	cin>>let;
	cout<<"\n\nPlease enter a number: ";
	cin>>num;
	cout<<"\n\nPlease enter a decimal number: ";
	cin>>dec;
	cout<<"\n\n"<<endl;
	
	cout<<"You have entered the following:\n\n";
	cout<<"The letter "<<let;
	cout<<"\nThe number "<<num;
	cout<<"\nAnd lastly "<<dec<<"\n\n\n";
	
	return 0;

}

