#include <iostream>
#include <conio.h>
#include <windows.h>
using namespace std;

void userlogin(){
 string user;
 int count=0,ch;
 string passwd="";
 cout<<"\n\t\t\t    >>> WELCOME <<<"<<endl;
 cout<<"\t\t\t >>> Please Login <<<"<<endl;
 wrong: //jump back from line 32
 cout<<"\t User Name: ";
 cin>>user;
 cout<<"\t Password: " ;
 while(ch=getch()) //assign Ascii value to ch
 { 
  if(ch == 13){ //check ch after press RETURN key;
   if((passwd == "pappy")&&(user=="ramsy")){
   cout<<endl<<endl <<"======================================" <<endl;
   cout<<"\t Hello " <<user <<endl;
   
			   			system("color 2f");
						system("color 0e");
						char a = 177, b = 219;
						cout << "\n\n\n\t\t\t\t\tLoading....";
						cout << "\n\n\n";
						cout << "\t\t\t\t\t";
						for(int i=0;i<=25;i++)
						cout << a;
						Sleep(150);
						cout << "\r";
						cout << "\t\t\t\t\t";
						for(int i=0;i<=25;i++)
						{
						cout << b;
						Sleep(200);
						}
						system("pause>0");
   
   break;
   }
   //system("cls");
   cout<<"\n Wrong User Name or Password input again! \n\n";
   passwd = "";
   count += 1;
   if(count == 3){
    cout<<"You have entered wrong 3 times system will shutdown";
    cout<<" in 3 seconds good bye!";
   //system("shutdown -s -t 03");//this will shutdown your PC;
   }
   goto wrong;
  }
  else if(ch==8){ //check ch after press BACKSPACE key; 
   if(passwd.length()>0){//set condition blocking error while input
    cout<<"\b \b";//remove Mask * on screen;
    passwd.erase(passwd.length()-1); //erase String length
   }
  }
  else{
  cout<<"*";
  passwd += ch; //the input password was assigned to variable passwd.
  }
 }
}
 int main(){
 userlogin();
 return 0;
}

