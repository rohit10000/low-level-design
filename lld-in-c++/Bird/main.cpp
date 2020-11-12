#include <iostream>
#include "Bird.h"
#include "Eagle.h"
#include "Hen.h"
#include "Seller.h"

using namespace std;

int main()
{
    cout << "Hello world!" << endl;

    Eagle eagle("Eagle", 2);
    eagle.flyHigh();

    cout<<eagle.getPrice()<<endl;


    Seller::setBirdPrice(eagle);
    cout<<eagle.getPrice()<<endl;

    return 0;
}
