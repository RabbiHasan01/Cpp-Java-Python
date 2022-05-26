

#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cout << "size= ";
    cin>> n;

    vector <int> v(n);
    cout <<  "input = ";

    for(int i=0;i<n;i++){
        cin>> v[i];
    }

    sort(v.begin(),v.end());///asc
   /// sort(v.rbegin(),v.rend());///desc

    cout << "sorted = ";

    for(int i=0;i<n;i++){
        cout << v[i]<<" ";
    }
    cout <<endl;

return 0;
}
