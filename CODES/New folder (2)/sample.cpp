#include <iostream>

using namespace std;

const int NUM_STUDS = 5;

bool passing [NUM_STUDS];
bool failing [NUM_STUDS];
void Initialize();
void SetPassing(int index,const int score);
void SetFailing(int index,const int score);


int main()
{
	int index;
	int grade;
	int score [NUM_STUDS];

	cout << "Please enter 5 test scores on a grading scale of 0-100 points. "<< endl;
	cout << "I will tell you if the test scores are passing or failing." << endl  <<endl; 


	for (grade =0; grade <NUM_STUDS; grade++)
{
	cin >> score[grade];


if ( score[grade] < 0 )		// Check if score is too low to be a valid score:
{
	cout << "You entered " << score[grade] << endl;
	cout << "It must be between 0-100." << endl;
	grade--;
} 


if ( score[grade] > 100 )	// Check if score is too high to be a valid score:
{
	cout << "You entered " << score[grade] << endl;
	cout << "It must be between 0-100." << endl;
	grade--;
} 
}
	Initialize();			//function call
	for (index=0;index<NUM_STUDS;index++)
{
	SetPassing(index,score[index]);
	SetFailing(index,score[index]);
	cout<<"Score "<<score[index]<<endl;			//Printed to screen
	cout<<"Pass  "<<(passing[index]==false ? "No" : "Yes")<<endl;
	cout<<"Fail  "<<(failing[index]==false ? "No" : "Yes")<<endl<<endl;
	
}

return 0;

} 

void Initialize()		//void statements

{
	int index;

	for(index=0; index<NUM_STUDS;index++)
	failing[index]=false;
}

void SetPassing(int index,const int score)

{
	if (score>=60)
	passing[index]=true;
}

void SetFailing(int index,const int score)

{
	if (score<60)
	failing[index]=true;
}

