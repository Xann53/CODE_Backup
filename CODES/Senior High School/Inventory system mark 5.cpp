#include <iostream>
#include <conio.h>
#include <string.h>
#include <dos.h>
#include <vector>

using namespace std;

struct articles
    {
    char name[20];
    char manufacturer[15];
    double price;
    char available;
    };

    int main()
    {
    int choice;

    do
    {
    cout << ("\n ##################################################");
    cout << ("\n # Menu                                           #");
    cout << ("\n # 1.Enter new article                            #");
    cout << ("\n # 2.List of manufacturers of articles            #");
    cout << ("\n # 3.Sort articles by name                        #");
    cout << ("\n # 4.Display the current content of the list      #");
    cout << ("\n # 5. End of program                              #");
    cout << ("\n ##################################################") << endl;
	cin >> choice;

switch (choice)
{

    case 1:
        articles newart;
        cout << ("Enter a name: ");
        cin >> (newart.name);
        cout << ("Enter a manufacturer: ");
        cin >> (newart.manufacturer);
        cout << ("Enter a price: ");
        cin >> (newart.price);
        cout << ("Enter if its available (y/n): ");
        cin >> (newart.available);
        cout << ("The new article you've created is the following: \n");
        cout << newart.name << endl;
        cout << newart.manufacturer << endl;
        cout << newart.price << endl;
        cout << newart.available << endl;
        break;

 case 2:
    //code
    break;
case 3:
    //code
    break;
case 4:
    //code
    //extra information about the mode and the controller
    break;
case 5:
    cout << "End of Program.\n";
    break;


 default:
        cout << "Not a Valid Choice. \n"
            << "Choose again.\n";
        break;
    }




}while (choice != 5);
return 0;
}
