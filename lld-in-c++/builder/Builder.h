#ifndef BUILDER_H
#define BUILDER_H
#include <iostream>
#include "Bird.h"


using namespace std;

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

#endif // BUILDER_H
