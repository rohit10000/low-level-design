#include "Bird.h"

Bird::Bird(string name, string gender, string color)
{
    this->name = name;
    this->gender = gender;
    this->color = color;
}

void Bird::showInfo(){
    cout<<"Name: "<<this->name<<", gender: "<<this->gender<<" and color: "<<this->color<<endl;
}
