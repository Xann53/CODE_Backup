#include<iostream>
using namespace std;

double convert(int inches);
int main()
{

	int inches;
	double ans;
	
	cout<<"\n   Enter inches: ";
	cin>>inches;
	cout<<endl;
	
	ans = convert(inches);
	
	cout<<"   "<<inches<<" inch/es equals "<<ans<<" centimeters\n\n\n\n";
	
	return 0;

}
double convert(int input)
{

	double centimeters;
	
	centimeters = input * 2.54;
	return centimeters;

}

