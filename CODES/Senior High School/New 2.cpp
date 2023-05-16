#include <iostream>
#include <conio.h>
#include <string>

using namespace std;
int main()
{
	
	string name;
	string supplier;
	int code[100];
	int amount[100];
	float price[100];
	int i=0;
	int z, n;
	int j=1;
	float m;
	char c;
	
	while(i != 5)
	{
		system("cls");
		cout<<"\n   What do you want to do?"<<endl;
    	cout<<"\n1: Add a new item.";
    	cout<<"\n2: Delete an item.";
    	cout<<"\n3: Update an item.";
    	cout<<"\n4: Display all items.";
    	cout<<"\n5: Exit"<<endl;
    	cout<<"\n\n Choose a number: ";
    	cin>>i;
    	
    	if(i > 5)
		{
			system("cls");
			cout<<"\n\nInvalid output. Please enter any character to go back to menu"<<endl;
			cin>>c;
		}
    	else
    	{
	    	switch(i)
	    	{
				case 1:
					{
						system("cls");
						cout<<"\nEnter the name of the item\t: ";
	  					getline(cin, name);
						cout<<"Enter the name of the supplier\t: ";
	  					getline(cin, supplier);
						cout<<"Enter the item code\t\t: ";
						cin>>code[z];
						cout<<"Enter the item amount\t\t: ";
						cin>>amount[z];
						cout<<"Enter the price of the item\t: ";
						cin>>price[z];
						
						z++;
						cout<<endl;
						break;
					}
	    		case 2:
	    			{
	    				system("cls");
						cout<<"\nPlease enter the item code:";
						cin>>n;
						for(j=0;j<z;j++)
						{
							if(code[j]==n)
							{
								name[j]=0;
								supplier[j]=0;
								code[j]=0;
								amount[j]=0;
								price[j]=0;
								cout<<"\nThe item is deleted from the list.";
								getch();
								break;
							}
						}
						break;
					}
	    		case 3:
	    			{
	    				system("cls");
						cout<<"\nPlease enter the item code: ";
						cin>>n;
						for(j=0;j<z;j++)
						{
							if(code[j]==n)
							{
								cout<<"\nEnter new price: ";
								cin>> m;
								price[j]=m;
								cout<<"\nEnter new amount: ";
								cin>> m;
								amount[j]=m;
								cout<<"\nItem updated successfully.\n";
								getch();
								break;
							}
						}
					}
	    			
	    		case 4:
	    			{
	    				system("cls");
						for(n=0;n<z;n++)
						{
							cout<<j<<".Item name is    : "<<name;
	    					cout<<"\n  Item supplier   : "<<supplier;
	    					cout<<"\n  Item code is    : "<<code[n];
	    					cout<<"\n  Item amount is  : "<<amount[n];
	    					cout<<"\n  Item price is   : "<<"P "<<price[n]<<endl;
	    					j++;
	    				}
	    					cout<<"Input any letter to go back to menu: ";
	    					cin>>c;
					}
	    			break;
				}
			}
		}
	}
