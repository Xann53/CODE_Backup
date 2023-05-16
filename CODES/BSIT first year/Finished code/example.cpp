#include<iostream>
using namespace std;

double convert(double inches);
int main()
{
	double ins, cen;
	
	cout<<"Enter inches here:\t";
	cin>> ins;
	
	cen = convert(ins);
	
	cout<<"\n\n"<<cen<<" centimeters.\n\n\n\n";
	
	return 0;
}

double convert(double inches)
{
	double centimeters;
	
	centimeters = inches * 2.54;
	
	return centimeters;
}

