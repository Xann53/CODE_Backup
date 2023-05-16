#include<iostream>
#include<iomanip>

using namespace std;

void car(int hour_ent, int minutes_ent, int hour_ext, int minutes_ext, int *parktime_hr, int *parktime_min, int *rounded, double *total);
void bus(int hour_ent, int minutes_ent, int hour_ext, int minutes_ext, int *parktime_hr, int *parktime_min, int *rounded, double *total);
void truck(int hour_ent, int minutes_ent, int hour_ext, int minutes_ext, int *parktime_hr, int *parktime_min, int *rounded, double *total);
int main()
{

	char vehicle, choice;
	int ent_hr, ent_min, ext_hr, ext_min, pt_h, pt_m, rounded;
	double total;
	
	start:
	system("Cls");
	cout<<"\n\tPARKING LOT CHARGES\n";
	cout<<"\nType of vehicle (C for car, B for bus, T for truck): ";
	cin>>vehicle;
	cout<<"\nReminder: Use Military Time.\n";
	cout<<"\nHour vehicle entered lot   (0-24): ";
	cin>>ent_hr;
	cout<<"Minute vehicle entered lot (0-59): ";
	cin>>ent_min;
	cout<<"Hour vehicle left lot      (0-24): ";
	cin>>ext_hr;
	cout<<"Minute vehicle left lot    (0-59): ";
	cin>>ext_min;
	
	if(ent_hr <= 24 && ent_min <= 59 && ext_hr <= 24 && ext_min <= 59)
	{
		if(vehicle == 'c' || vehicle == 'C')
		{
			car(ent_hr, ent_min, ext_hr, ext_min, &pt_h, &pt_m, &rounded, &total);
			if(total < 0)
			{
				total = 0;
			}
		}
		else if(vehicle == 'b' || vehicle == 'B')
		{
			bus(ent_hr, ent_min, ext_hr, ext_min, &pt_h, &pt_m, &rounded, &total);
			if(total < 0)
			{
				total = 0;
			}
		}
		else if(vehicle == 't' || vehicle == 'T')
		{
			truck(ent_hr, ent_min, ext_hr, ext_min, &pt_h, &pt_m, &rounded, &total);
			if(total < 0)
			{
				total = 0;
			}
		}
		else
		{
			retry:
			system("Cls");
			cout<<"Wrong Input. Would you like to go back? ('y' for yes or 'n' for no)  ";
			cin>>choice;
			
			try_again:
			if(choice == 'y' || choice == 'Y')
			{
				goto start;
			}
			else
			{
				goto end;
			}
		}
	}
	else
	{
		goto retry;
	}
	if(ent_hr <= ext_hr)
	{
		system("Cls");
		cout<<"\n\tPARKING LOT CHARGES\n";
		cout<<"\nType of vehicle: "<<vehicle;
		cout<<"\nTIME IN:\t\t\t"<<setw(2)<<setfill('0')<<ent_hr<<":"<<setw(2)<<setfill('0')<<ent_min;
		cout<<"\nTIME OUT:\t\t\t"<<setw(2)<<setfill('0')<<ext_hr<<":"<<setw(2)<<setfill('0')<<ext_min;
		cout<<"\n\t\t\t\t-----";
		cout<<"\nPARKING TIME:\t\t\t"<<setw(2)<<setfill('0')<<pt_h<<":"<<setw(2)<<setfill('0')<<pt_m;
		cout<<"\nROUNDED TOTAL:\t\t\t"<<setw(2)<<setfill('0')<<rounded<<" hr/s";
		cout<<"\n\t\t\t\t-----";
		cout<<"\nTOTAL CHARGE:\t\t\t$"<<setprecision(2)<<fixed<<total;
		cout<<"\n\nWould you like to try again? ('y' for yes or 'n' for no)  ";
		cin>>choice;
		goto try_again;
	}
	else
	{
		cout<<"\n\nWould you like to try again? ('y' for yes or 'n' for no)  ";
		cin>>choice;
		goto try_again;
	}
	
	end:
	return 0;

}
void car(int hour_ent, int minutes_ent, int hour_ext, int minutes_ext, int *parktime_hr, int *parktime_min, int *rounded, double *total)
{
	if(hour_ext >= hour_ent && minutes_ext >= minutes_ent)
	{
		*parktime_hr = hour_ext - hour_ent;
		*parktime_min = minutes_ext - minutes_ent;
		if(*parktime_min > 29)
		{
			*rounded = *parktime_hr + 1;
		}
		else
		{
			*rounded = *parktime_hr;
		}
		*total = (*rounded - 3) * 1.50;
	}
	else if(hour_ext >= hour_ent && minutes_ext < minutes_ent)
	{
		*parktime_hr = (hour_ext - 1) - hour_ent;
		*parktime_min = 60 - (minutes_ent - minutes_ext);
		if(*parktime_min > 29)
		{
			*rounded = *parktime_hr + 1;
		}
		else
		{
			*rounded = *parktime_hr;
		}
		*total = (*rounded - 3) * 1.50;
	}
	else
	{
		system("Cls");
		cout<<"You have parked your vehicle in the parking lot overnight.\nYour vehicle has been towed away.";
	}
}
void bus(int hour_ent, int minutes_ent, int hour_ext, int minutes_ext, int *parktime_hr, int *parktime_min, int *rounded, double *total)
{
	if(hour_ext >= hour_ent && minutes_ext >= minutes_ent)
	{
		*parktime_hr = hour_ext - hour_ent;
		*parktime_min = minutes_ext - minutes_ent;
		if(*parktime_min > 29)
		{
			*rounded = *parktime_hr + 1;
		}
		else
		{
			*rounded = *parktime_hr;
		}
		*total = ((*rounded - 1) * 3.70) + 2.00;
	}
	else if(hour_ext >= hour_ent && minutes_ext < minutes_ent)
	{
		*parktime_hr = (hour_ext - 1) - hour_ent;
		*parktime_min = 60 - (minutes_ent - minutes_ext);
		if(*parktime_min > 29)
		{
			*rounded = *parktime_hr + 1;
		}
		else
		{
			*rounded = *parktime_hr;
		}
		*total = ((*rounded - 1) * 3.70) + 2.00;
	}
	else
	{
		system("Cls");
		cout<<"You have parked your vehicle in the parking lot overnight.\nYour vehicle has been towed away.";
	}
}
void truck(int hour_ent, int minutes_ent, int hour_ext, int minutes_ext, int *parktime_hr, int *parktime_min, int *rounded, double *total)
{
	if(hour_ext >= hour_ent && minutes_ext >= minutes_ent)
	{
		*parktime_hr = hour_ext - hour_ent;
		*parktime_min = minutes_ext - minutes_ent;
		if(*parktime_min > 29)
		{
			*rounded = *parktime_hr + 1;
		}
		else
		{
			*rounded = *parktime_hr;
		}
		*total = ((*rounded - 2) * 2.30) + 2.00;
	}
	else if(hour_ext >= hour_ent && minutes_ext < minutes_ent)
	{
		*parktime_hr = (hour_ext - 1) - hour_ent;
		*parktime_min = 60 - (minutes_ent - minutes_ext);
		if(*parktime_min > 29)
		{
			*rounded = *parktime_hr + 1;
		}
		else
		{
			*rounded = *parktime_hr;
		}
		*total = ((*rounded - 2) * 2.30) + 2.00;
	}
	else
	{
		system("Cls");
		cout<<"You have parked your vehicle in the parking lot overnight.\nYour vehicle has been towed away.";
	}
}

