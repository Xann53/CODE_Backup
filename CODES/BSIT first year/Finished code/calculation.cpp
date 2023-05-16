#include<iostream>
using namespace std;
int main()
{

	double inch, feet, centimeter, meter, millimeter, micrometer, yard, n_mile;
	
	cout<<"\n Enter inch: ";
	cin>>inch;
	
	feet = inch / 12;
	centimeter = inch * 2.54;
	meter = inch / 39.37;
	millimeter = inch * 25.4;
	micrometer = inch * 25400;
	yard = inch / 36;
	n_mile = inch / 72913;
	
	cout<<"\n\n\n "<<feet<<" feet"<<endl;
	cout<<"\n "<<centimeter<<" centimeters"<<endl;
	cout<<"\n "<<meter<<" meters"<<endl;
	cout<<"\n "<<millimeter<<" millimeters"<<endl;
	cout<<"\n "<<micrometer<<" micrometers"<<endl;
	cout<<"\n "<<yard<<" yards"<<endl;
	cout<<"\n "<<n_mile<<" nautical miles\n\n\n";
	
	return 0;

}

