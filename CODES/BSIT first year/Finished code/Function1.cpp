#include<iostream>
using namespace std;

void convert(double inches);
int main()
{
	double ins;
	
	cout<<"Enter inches here:\t";
	cin>> ins;
	
	convert(ins);
	
	return 0;
}

void convert(double inches) // Could have the same variable name as in the main(), example: double ins, instead of double inches
{
	double centimeters;
	
	centimeters = inches * 2.54;
	cout<<"\n\n"<<inches<<" inches is equals to "<<centimeters<<" centimeters.\n\n\n\n";
	
	return;
}

//Example below
/*#include<iostream>
using namespace std;

double convert(double inches);
int main()
{
	double ins;
	
	cout<<"Enter inches here:\t";
	cin>> ins;
	
	cout<<convert(ins);
	
	return 0;
}

double convert(double inches)
{
	double centimeters;
	
	centimeters = inches * 2.54;
	cout<<"\n\n"<<inches<<" inches is equals to "<<centimeters<<" centimeters.\n\n\n\n";
	
	return centimeters;
}
*/

