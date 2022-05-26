
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
    employee(string Name, string Company,int Age){
        ///constructor=method name same as class name
        name=Name;
        company=Company;
        age=Age;
        //myself();


    }



};

int main(){

    //type   variable
    employee employee1=employee("Rabbi Hasan","alibaba.com",21);
   // employee1.name="Rabbi Hasan";
    //employee1.company="ABC.com";
    //employee1.age=21;

    employee1.myself();
    employee employee2=employee("Murad Hasan","aoz.org",44);
    employee2.myself();

return 0;
}
