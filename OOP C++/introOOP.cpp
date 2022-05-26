
#include <bits/stdc++.h>
using namespace std;
//t
//y
class employee{
public:
    string name;
    string company;
    int age;

    void myself(){
        cout << "Name =" << name <<endl;
        cout << "Company =" << company <<endl;
        cout << "Age =" << age <<endl;

    }



};

int main(){

    //type   variable
    employee employee1;
    employee1.name="Rabbi Hasan";
    employee1.company="ABC.com";
    employee1.age=21;

    employee1.myself();

return 0;
}
