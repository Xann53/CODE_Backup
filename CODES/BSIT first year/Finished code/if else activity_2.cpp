#include<iostream>

using namespace std;
int main()
{

	float grade;
	
	cout<<"Enter grade:\t";
	cin>>grade;
	cout<<endl;
	
	if(grade >= 70)
	{
		cout<<"A passing grade\n\n";
	}
	else
	{
		cout<<"A failing grade\n\n";
	}
	
	return 0;

}

