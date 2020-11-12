#include "Hen.h"

Hen:: Hen(string s, int w, int p=-1): Bird(s, w, p){
    cout<<"Hen object is created"<<endl;
}

void Hen::flyLow(){
    cout<<"Bird is "<<getName()<<" and it flies low."<<endl;
}
