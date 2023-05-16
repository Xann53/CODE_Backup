#include<iostream>
#include<iomanip>

using namespace std;

void calculate(int hour_in, int minute_in, int hour_out, int minute_out, char vehicle, int total_hours, int total_minutes, int rounded_hours);
int main()
{

	int hour_in, minute_in, hour_out, minute_out, total_hours, total_minutes, rounded_hours;
	char vehicle_type;
	
	cout<<"Enter vehicle type: ";
	cin>>vehicle_type;
	cout<<"Hour entered: ";
	cin>>hour_in;
	cout<<"Minute entered: ";
	cin>>minute_in;
	cout<<"Hour exited: ";
	cin>>hour_out;
	cout<<"Minute exited: ";
	cin>>minute_out;
	
	if(vehicle_type=='c'||vehicle_type=='C'||vehicle_type=='b'||vehicle_type=='B'||vehicle_type=='t'||vehicle_type=='T')
	{
		total_hours = hour_out - hour_in;
		total_minutes = minute_out - minute_in;
		rounded_hours = total_hours;
				
		if(total_minutes > 29)
		{
			rounded_hours = rounded_hours + 1;
		}
		
		calculate(hour_in, minute_in, hour_out, minute_out, vehicle_type, total_hours, total_minutes, rounded_hours);
	}
	else
	{
		cout<<"\nInvalid vehicle type input";
	}

}
void calculate(int hour_in, int minute_in, int hour_out, int minute_out, char vehicle, int total_hours, int total_minutes, int rounded_hours)
{
	double total_costs;
	
	if(hour_in <= 24 && minute_in <= 59 && hour_out <= 24 && minute_out <= 59 && hour_out >= hour_in)
	{
		if(vehicle == 'c' || vehicle == 'C')
		{
			if(minute_out >= minute_in)
			{
				total_costs = (rounded_hours - 3) * 1.50;
			}
			else if(minute_out < minute_in)
			{
				total_costs = (rounded_hours - 3) * 1.50;
			}
		}
		else if(vehicle == 'b' || vehicle == 'B')
		{
			if(minute_out >= minute_in)
			{
				total_costs = ((rounded_hours - 1) * 3.70) + 2.00;
			}
			else if(minute_out < minute_in)
			{
				total_costs = ((rounded_hours - 1) * 3.70) + 2.00;
			}
		}
		else if(vehicle == 't' || vehicle == 'T')
		{
			if(minute_out >= minute_in)
			{
				total_costs = ((rounded_hours - 2) * 2.30) + 2.00;
			}
			else if(minute_out < minute_in)
			{
				total_costs = ((rounded_hours - 2) * 2.30) + 2.00;
			}
		}
	cout<<"\nType of vehicle: "<<vehicle;
	cout<<"\nTime in:       "<<setw(2)<<setfill('0')<<hour_in<<":"<<setw(2)<<setfill('0')<<minute_in;
	cout<<"\nTime out:      "<<setw(2)<<setfill('0')<<hour_out<<":"<<setw(2)<<setfill('0')<<minute_out;
	cout<<"\nPARKING TIME:  "<<setw(2)<<setfill('0')<<total_hours<<":"<<setw(2)<<setfill('0')<<total_minutes;
	cout<<"\nROUNDED TOTAL: "<<rounded_hours<<" hours";
	cout<<"\nTOTAL CHARGE:  $"<<setprecision(2)<<fixed<<total_costs;
	}
	else
	{
		cout<<"\nInvalid time input";
	}
}

