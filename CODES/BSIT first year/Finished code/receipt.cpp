#include <iostream>
#include <iomanip>
using namespace std;
int main()
{

	int tv_s, vcr_s, rc_s, cdp_s, tr_s; // s - means "sold"
	float tv_c, vcr_c, rc_c, cdp_c, tr_c; // c - means "coast"
	float subtotal, total;
	
	cout<<"\n\n    How many TVs were Sold?\t\t\t";
	cin>>tv_s;
	cout<<"\n    How many VCRs were Sold?\t\t\t";
	cin>>vcr_s;
	cout<<"\n    How many Remote Controllers were Sold?\t";
	cin>>rc_s;
	cout<<"\n    How many CDs were Sold?\t\t\t";
	cin>>cdp_s;
	cout<<"\n    How many Tape Recorders were Sold?\t\t";
	cin>>tr_s;
	
	tv_c = tv_s * 400.00;
	vcr_c = vcr_s * 220.00;
	rc_c = rc_s * 35.20;
	cdp_c = cdp_s * 300.00;
	tr_c = tr_s * 150.00;
	subtotal = tv_c + vcr_c + rc_c + cdp_c + tr_c;
	total = (subtotal * 0.0825) + subtotal;
	
	system("cls");
	cout<<"\n\n   _______________________________________________________________________\n"<<endl;
	cout<<setw(10)<<"QTY"<<setw(20)<<"DESCRIPTION"<<setw(20)<<"UNIT PRICE"<<setw(20)<<"TOTAL PRICE"<<endl;
	cout<<setw(10)<<"---"<<setw(20)<<"-----------"<<setw(20)<<"----------"<<setw(20)<<"-----------"<<"\n"<<endl;
	cout<<setw(10)<<tv_s<<setw(11)<<"TV"<<setw(25)<<"400.00"<<setw(24)<<setprecision(2)<<fixed<<tv_c<<endl;
	cout<<setw(10)<<vcr_s<<setw(12)<<"VCR"<<setw(24)<<"220.00"<<setw(24)<<setprecision(2)<<fixed<<vcr_c<<endl;
	cout<<setw(10)<<rc_s<<setw(21)<<"REMOTE CTRLR"<<setw(14)<<"35.20"<<setw(25)<<setprecision(2)<<fixed<<rc_c<<endl;
	cout<<setw(10)<<cdp_s<<setw(18)<<"CD PLAYER"<<setw(18)<<"300.00"<<setw(24)<<setprecision(2)<<fixed<<cdp_c<<endl;
	cout<<setw(10)<<tr_s<<setw(22)<<"TAPE RECORDER"<<setw(14)<<"150.00"<<setw(24)<<setprecision(2)<<fixed<<tr_c<<endl;
	cout<<setw(70)<<"-----------"<<"\n"<<endl;
	cout<<setw(48)<<"SUBTOTAL"<<setw(22)<<setprecision(2)<<fixed<<subtotal<<endl;
	cout<<setw(43)<<"TAX"<<setw(27)<<"8.25%"<<endl;
	cout<<setw(45)<<"TOTAL"<<setw(25)<<setprecision(2)<<fixed<<total<<endl;
	cout<<"\n   _______________________________________________________________________\n\n"<<endl;
	
	return 0;

}

