#include <iostream>
#include <conio.h>
#include <string>

using namespace std;
struct item          //Here is where our main variables are stored
{
	char name[100];
	char supplier[100];
	int code[100];
	int amount[100];
	float price[100];
};
		
int main()
{
	
	int i=0;      //Variable that is used for inputs
	int z, n;     //Varuables that are used as counters
	int j=1;
	float m;
	char c;
	item sari_sari;   //Used to identify the struct item within the main()
	
	while(i != 5)
	{
		system("cls");
		cout<<"\n  GOLDEN SARI-SARI STORE"<<endl;    //The main menu and the possible choices
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
				case 1:    //Here is where items are added
					{
						system("cls");
						cout<<"Note: Please use underscore [ _ ] for space\n\n";
						cout<<"\nEnter the name of the item\t: ";
	  					cin>>sari_sari.name;
						cout<<"Enter the name of the supplier\t: ";
	  					cin>>sari_sari.supplier;
						cout<<"Enter the item code\t\t: ";
						cin>>sari_sari.code[z];
						cout<<"Enter the item amount\t\t: ";
						cin>>sari_sari.amount[z];
						cout<<"Enter the price of the item\t: ";
						cin>>sari_sari.price[z];
						
						z++;
						cout<<endl;
						break;
					}
	    		case 2:    //Here is where items are deleted
	    			{
	    				system("cls");
						cout<<"\nPlease enter the item code:";
						cin>>n;
						for(j=0;j<z;j++)
						{
							if(sari_sari.code[j]==n)
							{
								sari_sari.name[j]=0;
								sari_sari.supplier[j]=0;
								sari_sari.code[j]=0;
								sari_sari.amount[j]=0;
								sari_sari.price[j]=0;
								cout<<"\nThe item is deleted from the list.";
								getch();
								break;
							}
						}
						break;
					}
	    		case 3:    //Here is where items are updated
	    			{
	    				system("cls");
						cout<<"\nPlease enter the item code: ";
						cin>>n;
						for(j=0;j<z;j++)
						{
							if(sari_sari.code[j]==n)
							{
								cout<<"\nEnter new price: ";
								cin>> m;
								sari_sari.price[j]=m;
								cout<<"\nEnter new amount: ";
								cin>> m;
								sari_sari.amount[j]=m;
								cout<<"\nItem updated successfully.\n";
								getch();
								break;
							}
						}
					}
	    			
	    		case 4:    //Here is where items are displayed
	    			{
	    				system("cls");
						for(n=0;n<z;n++)
						{
							cout<<"  Item name is    : "<<sari_sari.name;
	    					cout<<"\n  Item supplier   : "<<sari_sari.supplier;
	    					cout<<"\n  Item code is    : "<<sari_sari.code[n];
	    					cout<<"\n  Item amount is  : "<<sari_sari.amount[n];
	    					cout<<"\n  Item price is   : "<<"P "<<sari_sari.price[n]<<"\n\n"<<endl;
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
