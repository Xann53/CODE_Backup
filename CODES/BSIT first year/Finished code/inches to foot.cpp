/*
Name: Xannetz V. Suficiencia
Course: BSIT-1
EDP Code: 77925
*/
#include <iostream>

using namespace std;
int main()
{

	int inches, foot, x_inches;
	
	cout<<"Enter the number of inches: ";
	cin>>inches;
	cout<<endl;
	
	if(inches >= 12 && inches % 12 == 0)
	{
		foot = inches / 12;
		
		cout<<inches<<" inches is equals to "<<foot<<" feet";
	}
	else if(inches >= 12 && inches % 12 != 0)
	{
		foot = inches / 12;
		x_inches = inches % 12;
		
		cout<<inches<<" inches is equals to "<<foot<<" feet and "<<x_inches<<" inches";
	}
	else
	{
		cout<<inches<<" inches is equals to does not reach a foot.";
	}
	
	return 0;

}

