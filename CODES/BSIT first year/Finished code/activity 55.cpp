#include<iostream>
using namespace std;
int main()
{

	double angle;
	char redo;
	
	retry:
	cout<<"Enter an angle (0, 48.3, 90, 179.8, 180, 186, 270, 300, 360): ";
	cin>>angle;
	
	if(angle == 48.3 || angle == 179.8 || angle == 186 || angle == 300)
	{
		if(angle == 48.3)
		{
			cout<<"\n\n		You have entered the First quadrant";
			cout<<"\n		Located between 0 degrees to 90 degrees";
			cout<<"\n		With the coordinates of ( + ; + )";
			cout<<endl;
			
			goto try_again;
		}
		else if(angle == 179.8)
		{
			cout<<"\n\n		You have entered the Second quadrant";
			cout<<"\n		Located between 90 degrees to 180 degrees";
			cout<<"\n		With the coordinates of ( - ; + )";
			cout<<endl;
			
			goto try_again;
		}
		else if(angle == 186)
		{
			cout<<"\n\n		You have entered the Third quadrant";
			cout<<"\n		Located between 180 degrees to 270 degrees";
			cout<<"\n		With the coordinates of ( - ; - )";
			cout<<endl;
			
			goto try_again;
		}
		else if(angle == 300)
		{
			cout<<"\n\n		You have entered the Fourth quadrant";
			cout<<"\n		Located between 270 degrees to 360 degrees";
			cout<<"\n		With the coordinates of ( + ; - )";
			cout<<endl;
			
			goto try_again;
		}
	}
	else if(angle == 0 || angle == 90 || angle == 180 || angle == 270 || angle == 360)
	{
		if(angle == 0 || angle == 360)
		{
			cout<<"\n\n	This is not in a quadrant but lies on the positive x - axis";
			cout<<endl;
			
			goto try_again;
		}
		else if(angle == 90)
		{
			cout<<"\n\n	This is not in a quadrant but lies on the positive y - axis";
			cout<<endl;
			
			goto try_again;
		}
		else if(angle == 180)
		{
			cout<<"\n\n	This is not in a quadrant but lies on the negative x - axis";
			cout<<endl;
			
			goto try_again;
		}
		else if(angle == 270)
		{
			cout<<"\n\n	This is not in a quadrant but lies on the negative y - axis";
			cout<<endl;
			
			goto try_again;
		}
	}
	else
	{
		cout<<"\n\nInvalid input";
		
		try_again:
		
		cout<<"\n\nDo you want to retry? (y)yes or (n)no\t";
		cin>>redo;
		cout<<"\n\n"<<endl;
		
		if(redo == 'y' || redo == 'Y')
		{
			goto retry;
		}
		else
		{
			goto end;
		}
	}
	end:
	
	return 0;

}

