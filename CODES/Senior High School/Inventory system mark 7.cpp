#include<iostream>
#include<conio.h>
const int m=20;
  class dept
  {   int amount[m],pris[m],k,a,b,amount1;
      int code,code1,cod[m],s,last;
    public:
       float price,price1;
       dept(void);
       void sell(void);
       void total_items(void);
       void add_old(void);
       void add_new(void);
       void show(void);
     };
    dept:: dept(void)
    { s=0;a=10;b=40;last=5;amount[0]=0;
      for(int k=0;k<last;k++)
      { s=s+1;b=b+10;
      cod[k]=s;
      amount[k]=a;
      pris[k]=b;
      }
     }
   void dept::add_old(void)
    { 
	  cout<<"\nEnter item code:";
      cin>>code1;
      cout<<"\nEnter item price:";
      cin>>price1;
     for(k=0;k<last;k++)
       { if(code1==cod[k])
      { a=a+1;
        amount[k]=a;
        pris[k]=price1;
      }
       //    else
     //cout<<"\nSorry..This item is not available.\n";
       }
      }
   void dept::add_new(void)
   {    cout<<"\nEnter item code:";
    cin>>code1;
    cout<<"\nEnter amount of that item:";
    cin>>amount1;
    cout<<"\nEnter item price:";
    cin>>price1;

    cod[last]=code1;
    amount[last]=amount1;
    pris[last]=price1;
    last++;
     }
    void dept::show(void)
     { for(k=0;k<last;k++)
    {
      cout<<"\nCODE:"<<cod[k]<<"\t";
      cout<<"\nAMOUNT:"<<amount[k]<<"\t";
      cout<<"\nPRICE:"<<pris[k]<<endl;
      }
    }
  void dept::sell(void)
   {
    cout<<"\nEnter product code:\n";
    cin>>code;
    cout<<"\nEnter product price:\n";
    cin>>price;
    }
  void dept::total_items(void)
   {
     cout<<"\n\nITEM CODE:"<<code<<"\n\nITEM PRICE:"<<price;
   }
  int main()
  {
     dept d[10];
     static int j=0;
     int x,i=0,p,s=0;
    clrscr();
    do{
       cout<<"\nENTER YOUR CHOICE:\n";
       cout<<"\n1. Show all stored items:";
       cout<<"\n2. Add an old item:";
       cout<<"\n3. Add a new item:";
       cout<<"\n4. Sell an item:";
       cout<<"\n5. Total sold:";
       cout<<"\n6. Show total items sold:";
       cout<<"\n7. Quit";

      cin>>x;
    switch(x)
    {   case 1: d[i].show();
            break;
        case 2: d[i].add_old();
            d[i].show();
            break;
        case 3: d[i].add_new();
            d[i].show();
            break;
        case 4: d[i].sell();
            i++,j++;
            break;
        case 5:{ cout<<"Total Sold:";
             s=0;

             for(p=0;p<j;p++)
             { s=s+d[p].price;
             }
             cout<<s;
             cout<<"TK.\n";
             }
             break;
        case 6: for(i=0;i<j;i++)
              {  d[i].total_items();
               }
              break;
        case 7: break;
         }
         } while(x!=7);
          getch();
          return 0;
       }
