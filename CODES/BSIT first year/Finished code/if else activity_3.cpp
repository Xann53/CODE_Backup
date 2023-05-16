#include<iostream>

using namespace std;
int main()
{

	int numYears;
	
	cout<<"How many years has the money been left in the bank: ";
	cin>>numYears;
	cout<<endl;
	
	if(numYears > 5)
	{
		cout<<"You get an interest rate of 4.5%\n\n";
	}
	else
	{
		cout<<"You get an interest rate of 3.0%\n\n";
	}
	
	return 0;

}

