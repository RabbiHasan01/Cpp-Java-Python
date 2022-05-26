
#include <bits/stdc++.h>
using namespace std;
//t
//y
class AbsEmployee{

    virtual void askPromotion()=0;


};
class employee:AbsEmployee{
private:
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

int main(){

    //type   variable
    employee employee1=employee("Rabbi Hasan","alibaba.com",21);
   // employee1.name="Rabbi Hasan";
    //employee1.company="ABC.com";
    //employee1.age=21;

    employee1.askPromotion();
    employee employee2=employee("Murad Hasan","aoz.org",44);
    employee2.askPromotion();

return 0;
}
