#include <iostream>
#include <stdlib.h>
#include <iomanip>
#include <conio.h>

using namespace std;

class item{
    private:
        int z;
        int code[20];
        double price[20];

    public:
        void add();
        void delete_();
        void view();
        void initial(){z = 0;}
};

void item :: add(){
    system("cls");

    cout << "Enter the item code        : ";
    cin >> code[z];
    cout << "Enter the price of the item: ";
    cin >> price[z];
    z++;
}

//this part is broken and needs work!
void item :: delete_(){
    int i, j;
    system("cls");

    cout << "Enter the item code of the item you want to delete: ";
    cin >> i;

    for(j = 0; j < z; j++){
        if(code [j] == i){
            price[j] = 0;
            cout<<"\nThe item is deleted from the list.";
            break;
        }
    }
}


void item :: view(){
    int i, j = 1;
    system("cls");

    cout << "These are the available items " << endl;
    cout << "=============================";

    for(i = 0; i < z; i++){
        cout << "\n  Item code is    : " << code[i];
        cout << "\n  Item price is   : " << "Php " << price[i] << endl << endl;
        j++;
    }
}

int main(){

    string userPassword;
    int loginAttempt = 0;


    while(loginAttempt < 5){

        cout << "Please enter your user password: ";
        cin >> userPassword;
        system("cls");
        if (userPassword == "sesame"){

            cout << "Your password is Approved!";
            getch();
            break;

        }else{

            cout << "Invalid Password! Please try again.\n";
            loginAttempt++;
            cout << "\nLogin Attempt (" << loginAttempt << "/5)\n";
        }
    }

    if(loginAttempt == 5){
        system("cls");
   		cout << "You have reached the maximum number of tries! \nThe program will now terminate!"<< endl;

        return 0;
    }

    int i;

    cout << "\nWelcome to our Inventory System!\n";

    item bookStore;
    bookStore.initial();

    while(1){

        cout << "\nInventory system prototype!\n";
        cout << "\n1: Add a new item.";
        cout << "\n2: Delete an item.";
        cout << "\n3: Display all items.";
        cout << "\n0: Exit" << endl;
        cout << "\n\n Choose a number: ";
        cin >> i;

    switch(i){
        case 1: bookStore.add(); break;

        case 2: bookStore.delete_(); break;

        case 3: bookStore.view(); break;

        case 0: cout << "\nGoodbye!!!";
            break;
        default: cout << "\nInvalid input!"; break;

    }

    if(i==0)
    break;

}


    return 0;
}

