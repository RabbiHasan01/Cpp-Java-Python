
#include<bits/stdc++.h>
using namespace std;

int main(){

    pair <int ,int>p;

    p.first= 2;
    p.second=80;
    cout<< p.first << "  "<< p.second<<endl;

    pair <string , int >p2;

    p2.first="rabbi";
    p2.second=19701071;
    cout<< p2.first << "  "<< p2.second<<endl;

    pair <int,int> p3[]={{1,9},{2,8},{3,7}};
    for(int i=0;i<3;i++){
        cout << p3[i].first << " ";
    }
    cout <<endl;
    for(int i=0;i<3;i++){
        cout << p3[i].second << " ";

    }

    pair<int,int> p4;

    cout << "\ninput= ";

    for(int i=0;i<6;i++){
        cin>> p4.first>>p4.second;


    }




return 0;
}
