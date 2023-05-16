#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

string name[100];
string supplier[100];
int quantity[100];
float price[100];
int counting=0;

string copyname;
string copysupplier;
int copyquantity;
float copyprice;

int main()
{
	
	int i, n, x, z, j;
	float m;
		
	system("COLOR 0B");
	
	goto display;
	menu:
	cout<<"\n\n  GOLDEN SARI-SARI STORE"<<endl; 
    cout<<"\n1: Add a new item.";
    cout<<"\n2: Delete an item.";
    cout<<"\n3: Update an item.";
    cout<<"\n4: Exit.";
    cout<<"\n\n Choose a number: ";
    cin>>i;
    
    if(i==1)
    	{
    		system("cls");
			cout<<"Note: Please use underscore [ _ ] for space\n\n";
			cout<<"\nEnter the name of the item\t: ";
	  		cin>>name[counting];
			cout<<"Enter the name of the supplier\t: ";
	  		cin>>supplier[counting];
			cout<<"Enter the quantity\t\t: ";
			cin>>quantity[counting];
			cout<<"Enter the price of the item\t: ";
			cin>>price[counting];
			counting++;
			cout<<endl;
			goto display;
			
		}
	else if(i==2)
		{
			system("cls");
			cout<<"\nPlease enter item number:  ";
			cin>>x;
			x--;
			
			if(counting>0)
			{
				copyname= name[counting-1];
				copysupplier= supplier[counting-1];
				copyquantity= quantity[counting-1]*1;
				copyprice= price[counting-1]*1;
				
				name[x]= copyname;
				supplier[x]= copysupplier;
				quantity[x]= copyquantity*1;
				price[x]= copyprice*1;
				counting--;
				goto display;
			}
			else
			{
				name[x]=' ';
				supplier[x]=' ';
				quantity[x]=0;
				price[x]=0;
				counting--;
				goto display;
			}
			
		}
	else if(i==3)
		{
			cout<<"\n\nPlease enter item number:  ";
			cin>>x;
			x--;
			system("cls");
			cout<<" Which would you like to update?";
			cout<<"\n1: Quantity";
			cout<<"\n2: Price";
			cout<<"\n3: Both";
			cout<<"\n\n Choose a number: ";
			cin>>z;
			
			if(z==1)
				{
					cout<<"\n How would you like to update?";
					cout<<"\n1: Add";
					cout<<"\n2: Subtract";
					cout<<"\n3: Manual update";
					cout<<"\n\n Choose a number: ";
					cin>>j;
					
					switch(j)
					{
						case 1:
							system("cls");
							cout<<"Enter number to add to quantity: ";
							cin>>m;
							quantity[x]=quantity[x]+m;
							goto display;
							break;
						case 2:
							system("cls");
							cout<<"Enter number to subtract to quantity: ";
							cin>>m;
							quantity[x]=quantity[x]-m;
							goto display;
							break;
						case 3:
							system("cls");
							cout<<"Enter new item quantity: ";
							cin>>m;
							quantity[x]=m;
							goto display;
							break;
					}
				}
			else if(z==2)
				{
					cout<<"\n How would you like to update?";
					cout<<"\n1: Add";
					cout<<"\n2: Subtract";
					cout<<"\n3: Manual update";
					cout<<"\n\n Choose a number: ";
					cin>>j;
					
					switch(j)
					{
						case 1:
							system("cls");
							cout<<"Enter number to add to price: ";
							cin>>m;
							price[x]=price[x]+m;
							goto display;
							break;
						case 2:
							system("cls");
							cout<<"Enter number to subtract to price: ";
							cin>>m;
							price[x]=price[x]-m;
							goto display;
							break;
						case 3:
							system("cls");
							cout<<"Enter new item price: ";
							cin>>m;
							price[x]=m;
							goto display;
							break;
					}
				}
			else if(z==3)
				{
					cout<<"\n How would you like to update?";
					cout<<"\n1: Add";
					cout<<"\n2: Subtract";
					cout<<"\n3: Manual update";
					cout<<"\n\n Choose a number: ";
					cin>>j;
					
					switch(j)
					{
						case 1:
							system("cls");
							cout<<"Enter number to add to quantity: ";
							cin>>m;
							quantity[x]=quantity[x]+m;
							cout<<"Enter number to add to price: ";
							cin>>m;
							price[x]=price[x]+m;
							goto display;
							break;
						case 2:
							system("cls");
							cout<<"Enter number to subtract to quantity: ";
							cin>>m;
							quantity[x]=quantity[x]-m;
							cout<<"Enter number to subtract to price: ";
							cin>>m;
							price[x]=price[x]-m;
							goto display;
							break;
						case 3:
							system("cls");
							cout<<"Enter new item quantity: ";
							cin>>m;
							quantity[x]=m;
							cout<<"Enter new item price: ";
							cin>>m;
							price[x]=m;
							goto display;
							break;
					}
				}
		
		}
	else if(i>4)
		{
			goto display;
		}
	else if (i==4)
		{
			goto end;
		}
		
	display:
	system("cls");
	cout<<"======================================================================================================================================="<<endl;
	cout<<"|Item number|"<<setw(30)<<"|Item name|"<<setw(30)<<"|Item supplier|"<<setw(30)<<"|Item quantity|"<<setw(30)<<"|Item price|"<<endl;
	cout<<"======================================================================================================================================="<<endl;
	for(n=1;n<=counting;n++)
		{
			cout<<n<<"."<<setw(35)<<name[n-1]<<setw(30)<<supplier[n-1]<<setw(30)<<quantity[n-1]<<setw(30)<<"P "<<setprecision(2)<<fixed<<price[n-1]<<endl;
		}
	goto menu;
	
	end:
		system("cls");
		cout<<"Thank you. Goodbye.";
	
	return 0;
	
}

