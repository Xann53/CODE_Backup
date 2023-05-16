#include <iostream>
using namespace std;
int main()
{

	char status;
	
	retry:
	system("cls");
	cout<<"Please enter your status\n(if senior, press 's' or 'S'; if junior, press 'j' or 'J'):\t";
	cin>>status;
	
	if(status == 's' || status == 'S')
	{
		cout<<"\nYour salary is $800 a week.\n\n\n";
	}
	else if(status == 'j' || status == 'J')
	{
		cout<<"\nYour salary is $500 a week.\n\n\n";
	}
	else
	{
		cout<<"\nYour input is invalid. Would you like to try again? Yes(y) No(n)\n\t\t";
		cin>>status;
		
		if(status == 'y' || status == 'Y')
		{
			goto retry;
		}
		else
		{
			goto end;
		}
	}
	
	end:
	
	return 0;

}

