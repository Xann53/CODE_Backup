#include<iostream>
#include<iomanip>
using namespace std;
int main()
{

	int score[3];
	float average;
 
	cout<<"Enter first test score (between 0 and 100):\t";
	cin>>score[0];
	cout<<"Enter second test score (between 0 and 100):\t";
	cin>>score[1];
	cout<<"Enter third test score (between 0 and 100):\t";
	cin>>score[2];
	
	if(score[0]>=0 && score[0]<=100 && score[1]>=0 && score[1]<=100 && score[2]>=0 && score[2]<=100)
	{
		average = (score[0] + score[1] + score[2]) / 3;
		
		if(average >= 90)
		{
			cout<<"\n\nYou got an A\n\n\n";
		}
		else if(average >= 70 && average < 90)
		{
			if(score[2] > 90)
			{
				cout<<"\n\nYou got an A\n\n\n";
			}
			else 
			{
				cout<<"\n\nYou got an B\n\n\n";
			}
		}
		else if(average >= 50 && average < 70)
		{
			average = (score[1] + score[2]) / 2;
			
			if(average > 70)
			{
				cout<<"\n\nYou got an C\n\n\n";
			}
			else 
			{
				cout<<"\n\nYou got an D\n\n\n";
			}
		}
		else 
		{
			cout<<"\n\nYou got an F\n\n\n";
		}
	}
	else 
	{
		cout<<"\n\nONE OR MORE OF THE INPUT/S ARE INVALID!\n\n\n";
	}
	
	return 0;

}

