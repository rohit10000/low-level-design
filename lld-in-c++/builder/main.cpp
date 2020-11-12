#include <iostream>

using namespace std;

class Bird
{
    private:
        string name, color, gender;
    public:
        Bird(string name, string gender, string color){
            this->name = name;
            this->gender = gender;
            this->color = color;
        }

        void showInfo(){
            cout<<"Name: "<<this->name<<", gender: "<<this->gender<<" and color: "<<this->color<<endl;
        }

};
class Builder
{
    private:
        string name, color, gender;

    public:
        Builder setName(string n){
            this->name = n;
            return *this;
        }
        Builder setColor(string c){
            this->color = c;
            return *this;
        }
        Builder setGender(string g){
            this->gender = g;
            return *this;
        }

        Bird build(){
            Bird bird(this->name, this->color, this->gender);
            return bird;
        }
};

int main()
{
    cout << "Hello world!" << endl;
    Builder builder;

    Bird obj = builder.setName("gauraiya").setGender("female").setColor("brown").build();

    obj.showInfo();

    return 0;
}
