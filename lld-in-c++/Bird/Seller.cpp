#include "Seller.h"
#include "Bird.h"


using namespace std;


void Seller::setBirdPrice(Bird bird)
{
    if(bird.getName() == "Eagle")
        bird.setPrice(120);
    else
        bird.setPrice(240);
}
