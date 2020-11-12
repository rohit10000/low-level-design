#include "Eagle.h"


Eagle::Eagle(string s, int w, int p):Bird(s, w, p)
{
    cout<<"Eagle constructor is called here"<<endl;
}

void Eagle::flyHigh(){
    cout<<"Bird "<<getName()<<" flies at high height"<<endl;
}
