#include<iostream>
#include<conio.h>

using namespace std;
int main()
{
	int patty = 0,burgerpan = 0,cheese = 0,longhotdog = 0,longbread = 0;
	int ch;
	int burger = 28, cheeseburger = 38,footlong = 70;
	char choice,cho;
	int bp,p,c,lp,lh;
	char in;
	int total[10] = {0,0,0,0,0,0,0,0,0,0};
	int sr, sc, sf;
	int pi;
	int attempts = 3;
	
	
	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"---\t\t  BURGER JUNCTION INVENTORY SYSTEM \t\t ---"<<endl;	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	
	while(attempts > 0)
	{

	cout<<"ENTER YOUR PIN	:";
	cin>>pi;
	
	if(pi == 1234)
	{
		cout<<"YOU ENTER CORRECT PIN"<<endl;
		attempts = -1;
		cout<<endl;
	}
	
	else
	{
		system("CLS");
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"---\t\t  BURGER JUNCTION INVENTORY SYSTEM \t\t ---"<<endl;	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"INCORRECT PASSWORD"<<endl;
	attempts--;
	cout<<"YOU HAVE "<<attempts<<" REMAINING";
	cout<<endl;
	
	}
	if(attempts == 0)
	{
	cout<<"COME BACK AGAIN"<<endl;
	}
	if(attempts == -1)
	{
	
	system("CLS");
		
	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"---\t\t  BURGER JUNCTION INVENTORY SYSTEM \t\t ---"<<endl;	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	
		

	while(ch !=4)
	{
	
	cout<<"ENTER 1 TO ADD PRODUCTS"<<endl;
	cout<<"ENTER 2 TO SELL PRODUCTS"<<endl;
	cout<<"ENTER 3 TO VIEW AVAILABLE PRODUCTS"<<endl;
	cout<<"ENTER 4 GO EXIT"<<endl;

	
			
	cout<<"ENTER A SYMBOL   :";
	cin>>ch;
		
system("CLS");
	
	switch(ch)
	{
		case 1:
		cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"---\t\t  BURGER JUNCTION INVENTORY SYSTEM \t\t ---"<<endl;	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;

		cout<<"A or a to add patty	: "<<endl;
		cout<<"B or b to add burgerpan	: "<<endl;
		cout<<"C or c to add cheese	: "<<endl;
		cout<<"D or d to add longhotdog	:"<<endl;
		cout<<"E or e to add longbread :"<<endl<<endl;
		
		cout<<"ENTER YOUR CHOICE  :";
		cin>>choice;
		
		if(choice == 'A' || choice == 'a'){
	
		cout<<"HOW MANY PATTY YOU ADD?"<<endl<<endl;
		cin>>p;
		
		total[1] = patty + p;
		
		cout<<"YOU HAVE "<<total[1]<<" PATTY REMAINING"<<endl;
		
			}else if(choice == 'B' || choice == 'b'){
			cout<<"HOW MANY BURGERPAN YOU ADD?"<<endl;
			cin>>bp;
		
			total[2] = burgerpan + bp;
		
			cout<<"YOU HAVE "<<total[2]<<" BURGER PAN REMAINING"<<endl;
			
			}else if(choice == 'C' || choice == 'c'){
			cout<<"HOW MANY CHEESE YOU ADD?"<<endl;
			cin>>c;
		
			total[3]= cheese + c;
	
			cout<<"YOU HAVE  "<<total[3]<<"  CHEESE REMAINING"<<endl;
		}else if(choice == 'D' || choice == 'd')
		{
			cout<<"HOW MANY LONG HOTDOG YOU ADD";
			cin>>lh;
	
		total[4] = longhotdog + lh;
			
			cout<<"YOU HAVE  "<<total[4]<<"  LONG  HOTDOG REMAINING"<<endl;
		}else if(choice == 'E' || choice == 'e')
		{
			cout<<"HOW MANY LONG BREAD YOU ADD";
			cin>>lp;
	
		total[5] = longbread + lp;
			
			cout<<"YOU HAVE  "<<total[5]<<"  LONG BREAD REMAINING"<<endl;
		}
		else
		
		cout<<"YOU ENTER WRONG KEY"<<endl<<endl;	
		
		
		break;

system("CLS");




case 2:
cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"---\t\t  BURGER JUNCTION INVENTORY SYSTEM \t\t ---"<<endl;	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
		cout<<"R or r for REGULAR BURGER"<<endl;
		cout<<"E or e for CHEESE BURGER"<<endl;
		cout<<"F or f for FOOTLONG"<<endl<<endl;
		
		cout<<"ENTER YOUR CHOICE  :";
		cin>>cho;
		
	if(cho == 'R' || cho == 'r')
	{
		cout<<"HOW MANY REGULAR	BURGER YOU BUY	:";
		cin>>sr;
		
		total[1] = total[1] - sr;
		total[2] = total[2] - sr;
		total[6] = burger * sr;
		
		
		cout<<"YOU HAVE "<<total[1] <<" PATTY AND	"<<total[2]<<" BURGER PAN REMAINING"<<endl;		
	}else if(cho == 'E' || cho == 'e')
	{
		cout<<"HOW MANY CHEESE BURGER YOU BUY	:";
		cin>>sc;
		
		total[1] = total[1] - sc;
		total[2] = total[2] - sc;
		total[3] = total[3] - sc;
		total[7] = cheeseburger * sc;
		
		cout<<"YOU HAVE "<<total[1] <<"PATTY, "<<total[2]<<"BURGER PAN AND "<<total[3]<<" CHEESE REMAINING"<<endl;
	}if(cho == 'F' || cho == 'f')
	{
		cout<<"HOW MANY FOOTLONG YOU BUY	:";
		cin>>sf;
		
		total[4] = total[4] - sf;
		total[5] = total[5] - sf;
		total[8] = footlong * sf;
		
		cout<<"YOU HAVE "<<total[4] <<" LONG HOTDOG AND "<<total[5]<<" LONG PAN REMAINING"<<endl;
	
	}
	total[9] = total[6] + total[7] + total[8] + total[9];
	cout<<" YOU EARN "<<total[9]<<endl<<endl;
		break;
		
		system("CLS");
		case 3:
		cout<<"YOU HAVE "<<total[1] << " REMAINING PATTY"<<endl;
		cout<<"YOU HAVE "<<total[2] << " REMAINING LONG BURGER"<<endl;
		cout<<"YOU HAVE "<<total[3] << " REMAINING CHEESE"<<endl;
		cout<<"YOU HAVE "<<total[4] << " REMAINING LONG HOTDOG"<<endl;
		cout<<"YOU HAVE "<<total[5] << " REMAINING LONG PAN"<<endl;
		cout<<"\n";
		
		
		
		
		break;


system("CLS");
		
		case 4:
		cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl;
	cout<<"---\t\t  BURGER JUNCTION INVENTORY SYSTEM \t\t ---"<<endl;	
	cout<<"----------------------------------------------------"<<endl;
	cout<<"----------------------------------------------------"<<endl; 
		cout<<endl;
		cout<<"\t\t\t\t\t  THANK YOU"<<endl;
		
	system("CLS");
		
		break;

	}
	}
	}
	}
return 0;
}



