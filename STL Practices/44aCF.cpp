
#include<bits/stdc++.h>
using namespace std;

int main(){

    int n;
    cin>>n;

    vector<pair<string,string>>v(n);

    for(int i=0;i<n;i++){
        cin>>  v[i].first >> v[i].second;
    }
    ///cout << v[1].first;
    sort(v.begin(),v.end());
     //for(int i=0;i<n;i++){
     //   cout << v[i].first << " " << v[i].second <<endl;
     //}

     int  sz=unique(v.begin(),v.end())-v.begin();

     cout << sz <<endl;




return 0;
}
