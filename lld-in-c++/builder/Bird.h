#ifndef BIRD_H
#define BIRD_H
#include "Builder.h"

#include <iostream>

using namespace std;


class Bird
{
    private:
        string name, color, gender;
    public:
        Bird(string, string, string);

        void showInfo();

};

#endif // BIRD_H
