#include <iostream>
#include <bits/stdc++.h>

using namespace std;

/*
==== Cascade Builder Pattern ====

Story:
    Amazon requires an Address validation system.
    Address have certain attributes (street, zipcode, state).
    Clients here are Order dispatch team, cart team.
    Different clients have different validated attribute requirements.

        Requirements:
        - point of failure should be handled
        - relation between entity can be taken care off
        - Clients code should not be dirty
        - Different clients should have different requirements

Build up a complete system for Amazon clone matching the above requirements.

*/

class Address{
    string street, zipcode, state;

    Address(string street, string zipcode, string state){
        this->street = street;
        this->zipcode = zipcode;
        this->state = state;
        //cout<<"outer constructor is called"<<endl;
    }

    public:

        void showInfo(){
            cout<<"Full address is: "<<street<<", "<<state<<", "<<zipcode<<endl;
        }
        string getZipcode(){
            return zipcode;
        }
        string getState(){
            return state;
        }
        string getStreet(){
            return street;
        }
        class Builder{
            string street, zipcode, state;


            public:
                Builder setStreet(string street){
                    this->street = street;
                    return *this;
                }
                Builder setZipcode(string zipcode){
                    this->zipcode = zipcode;
                    return *this;
                }
                Builder setState(string state){
                    this->state = state;
                    return *this;
                }

                Address build(){
                    Address addr(this->street, this->zipcode, this->state);
                    return addr;
                }
        };
};
// ==== Singleton Pattern  ====

class ResourceInitializer{
    private:
        static ResourceInitializer* r;

        unordered_set<string> zipCodeSet, streetSet, stateSet;

        ResourceInitializer(){
            //in-memory zipcode
            zipCodeSet.insert("221010");
            zipCodeSet.insert("231302");

            //in-memory street
            streetSet.insert("purani haweli");
            streetSet.insert("bada pool ke samane");

            //in-memory state
            stateSet.insert("UP");
            stateSet.insert("MP");
        }

    public:
        static ResourceInitializer getInitializer(){
            if(r == NULL)
                r = new ResourceInitializer();
            return *r;
        }

        unordered_set<string> getZipcodeSet(){
            return zipCodeSet;
        }
        unordered_set<string> getStreetSet(){
            return streetSet;
        }
        unordered_set<string> getStateSet(){
            return stateSet;
        }
};

ResourceInitializer* ResourceInitializer:: r = NULL;



//  ==== Code Against Interface ====
class Validation{
    public:
        virtual bool validate(Address addr) = 0;
};

//Validation for street
class StreetValidation: public Validation{
    public:
        bool validate(Address addr){
            ResourceInitializer r = ResourceInitializer::getInitializer();
            unordered_set<string> streetSet = r.getStreetSet();
            if(streetSet.find(addr.getStreet()) != streetSet.end())
                return true;

            return false;
        }

};

//Validation for zipcode
class ZipcodeValidation: public Validation{
    public:
        bool validate(Address addr){
            ResourceInitializer r = ResourceInitializer::getInitializer();
            unordered_set<string> zipcodeSet = r.getZipcodeSet();
            if(zipcodeSet.find(addr.getZipcode()) != zipcodeSet.end())
                return true;

            return false;
        }

};

//Validation for state
class StateValidation: public Validation{
    public:
        bool validate(Address addr){
            ResourceInitializer r = ResourceInitializer::getInitializer();
            unordered_set<string> stateSet = r.getStateSet();
            if(stateSet.find(addr.getState()) != stateSet.end())
                return true;

            return false;
        }
};

class MasterValidator{
    private:
        vector<Validation* > listOfValidators;

    public:
        MasterValidator(vector<Validation*> l){
            this->listOfValidators = l;
        }

        bool validate(Address addr){
            for(int i=0; i<listOfValidators.size(); i++){
                if(!listOfValidators[i]->validate(addr))
                    return false;

                return true;
            }
        }

};

class ValidatorCascadeFactory{
    private:
        static ValidatorCascadeFactory* ri;

        unordered_map<string, MasterValidator*> clientMap;

        ValidatorCascadeFactory(){

            //heavy operation
            clientMap["cart"] = new MasterValidator({new ZipcodeValidation()});
            clientMap["dispatch"] = new MasterValidator({new StateValidation(), new StreetValidation()});

        }
    public:

        static ValidatorCascadeFactory getInstance(){
            if(ri == NULL)
                ri = new ValidatorCascadeFactory();

            return *ri;
        }

        MasterValidator getValidation(string clientKey){
            return *(clientMap[clientKey]);
        }


};

ValidatorCascadeFactory* ValidatorCascadeFactory:: ri = NULL;


//Clients console
int main()
{
    // Address of customer
    Address::Builder obj;

    Address addr = obj.setState("WB").setStreet("purano haweli").setZipcode("221010").build();
    addr.showInfo();

    //Client: Order dispatch team
    bool isValid = ValidatorCascadeFactory::getInstance().getValidation("dispatch").validate(addr);
    cout<<isValid<<endl;

    //Client: Cart team
    isValid = ValidatorCascadeFactory::getInstance().getValidation("cart").validate(addr);

    cout<<isValid<<endl;



    return 0;
}
