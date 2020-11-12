#pragma once

#include <Bird.h>
#include<iostream>

using namespace std;

class Eagle : public Bird
{
    public:
        Eagle(string, int, int p = -1);

        void flyHigh();
};

