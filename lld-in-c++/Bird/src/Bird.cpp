#include "Bird.h"

using namespace std;

Bird::Bird(string name, int weight, int price){
    //ctor
    this->name = name;
    this->weight = weight;
    this->price = price;
    cout<<"Bird base class constructor is called"<<endl;
}

string Bird::getName(){
    return this->name;
}
int Bird::getWeight(){
    return this->weight;
}

void Bird::flapWing(){
    cout<<"Bird flap its wings"<<endl;
}
 void Bird::takeOff(){
    cout<<"Bird takes off"<<endl;
}
void Bird::info(){
    cout<<"Name: "<<this->name<<", Weight: "<<this->weight<<endl;
}
