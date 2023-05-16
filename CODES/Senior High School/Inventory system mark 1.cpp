#include<iostream>
#include<string.h>
#include<conio.h>

using namespace std;

struct inventory
{
	char name[100];
	char supplier[100];
	double amount, cost, copies;
};

class Store
{
	public:

	int numItem;
	inventory database[1000];

	Store()
	{
		numItem = 0;
	}
	void insertItem(char itemName[], char itemSupplier[], double itemAmount, double itemCost);
	void updateItem(char itemName[], char itemSupplier[], double itemAmount, double itemCost);
	void deleteItem(char itemName[], char itemSupplier[]);
	inventory *searchi(char itemName[], char itemSupplier[]);
};

void Store::insertItem(char itemName[], char itemSupplier[], double itemAmount, double itemCost)
{
	strcpy(database[numItem].name, itemName);
	strcpy(database[numItem].supplier, itemSupplier);
	database[numItem].amount = itemAmount;
	database[numItem].cost = itemCost;
	cout << "\nITEM ADDED SUCCESFULLY\n\n\n";
	numItem++;
};

void Store::updateItem(char itemName[], char itemSupplier[], double itemAmount, double itemCost)
{
 inventory *item = searchi(itemName, itemSupplier);
 if (item == NULL)
 {
  cout << "\n\t\t ITEM NOT FOUND\n";
  return;
  item->copies += amount   ;
  item->cost += cost;
 }
}

void Store::deleteItem(char itemName[], char itemSupplier[])
{
	int i = 0;
	while (i < numItem)
	{
		if ((strcmp(itemName, database[i].name) == 0) && (database[i].supplier == itemSupplier))
		{
			database[i].copies--;
			cout<< "\nITEM DELETED SUCCESFULLY\n\n\n";
			return;
		}

		i++;
	}
	cout << "\nITEM NOT FOUND\n\n\n";
};

int main()
{

	Store sto;
	char name[100];
	char supplier[100];
	double amount, cost;
	int choice;

	cout<<"Would you like to:\n\n"<<endl;
	cout<<"Check Inventory\t\t[1]\nAdd Iventory\t\t[2]\nUpdate Inventory\t[3]\nDelete Item\t\t[4]\nExit\t\t\t[0]\n\n\tInput:\t";
	cin>>choice;
	cout<<endl;

	while(choice != 0)
	{
		if(choice == 1)
		{

		}
		else if(choice == 2)
		{
			cout<<"Enter Item Name:\t";
			cin.getline(name, 80);
			cout<<"Enter Supplier:\t\t";
			cin.getline(supplier, 80);
			cout<<"Enter number of Item:\t";
			cin>>amount;
			cout<<"Enter Item Cost:\t";
			cin>>cost;
			cout<<"\n"<<endl;

			sto.insertItem(name, supplier, amount, cost);
		}
		else if(choice == 3)
		{
            cout << "\n\t\t\t ENTER DETAILS FOR UPDATE : ";
            cin.getline(name, 80);
            cout << "\n\t\t\t ENTER NAME OF ITEM : ";
            cin.getline(name, 80);
            cout << "\n\t\t\t ENTER PRODUCT ID : ";
            cin.getline(supplier, 80);
            cout << "\n\t\t\t ENTER TOTAL NEW ENTRY : ";
            cin >> copies;
            cout << "\n\t\t\t ENTER NEW PRICE : ";
            cin >> cost;
            sto.updateItem(name, product_id, copies, unit_price);
		}
		else if(choice == 4)
		{
			cout<<"Enter Item Name:\t";
			cin.getline(name, 80);
			cout<<"Enter Item Supplier:\t";
			cin.getline(supplier, 80);
			sto.deleteItem(name, supplier);
		}
		else
		{
			cout<<"\n\tINVALID INPUT. PLEASE ENTER ANOTHER NUMBER\n\n"<<endl;
		}

		cout<<"Would you like to:\n\n"<<endl;
		cout<<"Check Inventory\t\t[1]\nAdd Iventory\t\t[2]\nUpdate Inventory\t[3]\nDelete Item\t\t[4]\nExit\t\t\t[0]\n\n\tInput:\t";
		cin>>choice;
		cout<<endl;
	}
	if(choice == 0)
	{
		cout<<"\n\tTHANK YOU AND GOODBYE :D"<<endl;
	}

	return 0;

}

