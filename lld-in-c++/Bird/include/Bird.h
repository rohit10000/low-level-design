#pragma once

#include <bits/stdc++.h>

using namespace std;

class Bird
{
    private:
        string name;
        int weight;
        int price;

    public:
        Bird(string, int, int);

        string getName();
        int getWeight();

        int getPrice(){
            return this->price;
        }
        void setPrice(int p){
            this->price = p;
        }

        void flapWing();
        void takeOff();
        void info();


};
