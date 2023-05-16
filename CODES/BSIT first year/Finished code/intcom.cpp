#include<iostream>
#include<iomanip>
using namespace std;
int main()
{

	float r, s;
	
	cin>>r;
	
	r = r * r;
	s = 12.56 * r;
	
	cout<<setprecision(2)<<fixed<<s;
	
	return 0;

}

