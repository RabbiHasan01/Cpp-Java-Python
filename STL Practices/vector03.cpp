
#include <bits/stdc++.h>
using namespace std;

int main(){

    int n,a;

    cin>>n;

    vector<int> v;

    for(int i=0;i<n;i++){
        cin>> a;
        v.push_back(a);
    }

    for (int i = 0; i < v.size(); i++)
    {
        /* code */
        cout<< v[i] << " ";
    }
    cout << endl;

    return 0;

}
