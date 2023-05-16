#include<iostream>
#include<string.h>
#include<conio.h>

using namespace std;

struct inventory
{
 float unitPrice;
 int copies, product_id;
 char name[30];
 char supplier[30];
};
class Store
{
public:
 int numItem;
 inventory database[100];

 Store()
 {
  numItem = 0;
 }
 void insertItem(char itemName[], char supplier[], int pid, int c, float p);
 void deleteItem(char itemName[], int pid);
 inventory *searchi(char itemName[], int pid);
 void updateItem(char itemName[], int pid,int total,float price,int c,float p);
};


void Store::insertItem(char itemName[], char supplier[], int pid, int c, float p)
{
 strcpy(database[numItem].name, itemName);
 strcpy(database[numItem].supplier, supplier);
 database[numItem].product_id = pid;
 database[numItem].copies = c;
 database[numItem].unitPrice = p;
 cout << "\n ITEM INSERTED SUCCESFULLY\n";
 numItem++;

}

void Store::deleteItem(char itemName[], int pid)
{
 int i;
 for (i = 0; i < numItem; i++)
 {
  if ((strcmp(itemName, database[i].name) == 0) && (database[i].product_id == pid))
  {
   database[i].copies--;
   cout<< "\n ITEM DELETED SUCCESFULLY\n";
   return;

  }
 }
 cout << "\n  ITEM NOT FOUND\n";
}

inventory *Store::searchi(char itemName[], int pid)
{
 int i;
 for (i = 0; i < numItem; i++)
 {
  if ((strcmp(itemName, database[i].name) == 0) && (database[i].product_id == pid))
   return &database[i];
 }
 return NULL;
}

void Store::updateItem(char itemName[], int pid, int total, float price, int c, float p)
{
 inventory *item = searchi(itemName, pid);
 if (item == NULL)
 {
  cout << "\n  ITEM NOT FOUND\n";
  return;
  item->copies += total;
  item->unitPrice += price;
 }
 else
 {
   database[numItem].copies = c;
   database[numItem].unitPrice = p;
 }
}

int main()
{
 Store sto;
 char name[30], supplier[30];
 int product_id, copies, unit_price,option;
 int c;
 float p;

 do
 {
  cout << "\n\n GOLDEN SARI SARI STORE";
  cout << "\n MENU";
  cout << "\n    1 FOR INSERT";
  cout << "\n    2 FOR DELETE";
  cout << "\n    3 FOR SEARCH";
  cout << "\n    4 FOR UPDATE";
  cout << "\n    5 FOR EXIT";
  cout << "\n  ENTER YOUR CHOICE : ";
  cin >> option;
  switch (option)
  {
  case 1: cin.getline(name, 80);
    cout << "\n ENTER NAME OF ITEM : ";
    cin.getline(name, 80);
    cout << "\n SUPPLIER (person or company): ";
    cin.getline(supplier, 80);
    cout << "\n ENTER PRODUCT ID : ";
    cin >> product_id;
    cout << "\n NUMBER OF ITEMS : ";
    cin >> copies;
    cout << "\n UNIT PRICE PER ITEM : ";
    cin >> unit_price;
    sto.insertItem(name, supplier, product_id, copies, unit_price);
    break;
  case 2: cin.getline(name, 80);
    cout << "\n ENTER NAME OF ITEM : ";
    cin.getline(name, 80);
    cout << "\n ENTER PRODUCT ID : ";
    cin >> product_id;
    sto.deleteItem(name, product_id);
  case 3: cin.getline(name, 80);
    cout << "\n ENTER NAME OF ITEM : ";
    cin.getline(name, 80);
    cout << "\n ENTER PRODUCT ID : ";
    cin >> product_id;
    inventory *test;
    test = sto.searchi(name, product_id);
    if (test != NULL)
    {
     cout << "\n  SEARCHING RESULT";
     cout << "\n   ITEM FOUND" << "\n NAME OF THE ITEM:" << test->name << "\n SUPPLIER NAME :"
      << test->supplier << "\n PRODUCT ID:" << test->product_id
      << "\n NUMBER OF COPIES AVAILABLE:" << test->copies
      << "\n UNIT PRICES PER ITEM:" << test->unitPrice;
    }
    else
     cout << "\n ITEM NOT FOUND";
    break;
  case 4: cout <<"\n  ENTER DETAILS FOR UPDATE\n";
    cin.getline(name, 80);
    cout << "\n ENTER NAME OF ITEM : ";
    cin.getline(name, 80);
    cout << "\n ENTER PRODUCT ID : ";
    cin >> product_id;
    cout << "\n ENTER TOTAL NEW ENTRY : ";
    cin >> copies;
    cout << "\n ENTER NEW PRICE : ";
    cin >> unit_price;
    sto.updateItem(name, product_id, copies, unit_price, c, p);
    break;
  }
 } while (option != 5);
 return 0;
}

