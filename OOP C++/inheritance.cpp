

#include <bits/stdc++.h>
using namespace std;
//t
//y
class AbsEmployee{

    virtual void askPromotion()=0;


};
class employee:AbsEmployee{ ///superclass
public:
    string name;
    string company;
    int age;

public:
    void askPromotion(){

        if(age>40)
            cout << name <<" gets promotion" << endl;
        else
            cout <<"Sorry!!"<< name << ", you aren't allowed for promotion." <<endl;


    }
    employee(string Name, string Company,int Age){
        ///constructor=method name same as class name
        name=Name;
        company=Company;
        age=Age;
    }

};
class Developer:employee{///subclass
    string favLanguage;

public:
    Developer(string Name, string Company,int Age, string Language )
    :employee(Name,Company,Age){

        favLanguage=Language;

    }
    void ans(){
        cout << name << "'s favorite language is " << favLanguage;


    }


};

int main(){

     Developer d=Developer("Rabbi Hasan","zoom.com",22,"c++");
     d.ans();

return 0;
}
