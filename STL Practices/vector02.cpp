
#include <bits/stdc++.h>
using namespace std;

int main(){

    vector<int> v(10);///={3,6,8,9,0,2};  ///like, int a[]={2,3,4,5,0,8,9}?arr

    ///v.clear();
    ///v.resize(7);
    for(int i=0;i<v.size();i++){
        cin>> v[i];
    }

    cout << "Size= "<<v.size()<<endl;

    cout << "Vector: ";

    //v.resize(12);

    for(int a:v)
        cout<< a<< " ";
    cout <<endl;





return 0;
}
