#include <iostream>
#include <bits/stdc++.h>

using namespace std;


class ResourceInitializer{
    private:
        unordered_set<string> zipCoder;
        static ResourceInitializer* ri;

        ResourceInitializer(){
        //heavy operation
            zipCoder.insert("221010");
            zipCoder.insert("234522");
            zipCoder.insert("110011");
            cout<<" constructor called"<<endl;
        }

    public:

        unordered_set<string> getZipCoder(){
            return zipCoder;
        }

        static ResourceInitializer getInitializer(){
            if(!ri)
                ri =  new ResourceInitializer();
            return *ri;
        }
};

ResourceInitializer* ResourceInitializer:: ri = NULL;

class ZipValidator{

    public:
        static bool validate(string pincode){
            ResourceInitializer r = ResourceInitializer::getInitializer();
            unordered_set<string> zipCoder = r.getZipCoder();

            if(zipCoder.find(pincode) != zipCoder.end())
                return true;
            return false;
        }




};

int main()
{
    cout << "Hello world!" << endl;

    //Client code...
    string pincode="221010";

    bool isValid = ZipValidator::validate(pincode);
    if(isValid)
        cout<<pincode<<" is valid zipcode"<<endl;
    else
        cout<<pincode<<" is an invalid zipcode"<<endl;

    pincode = "342333";

    isValid = ZipValidator::validate(pincode);
    if(isValid)
        cout<<pincode<<" is valid zipcode"<<endl;
    else
        cout<<pincode<<" is an invalid zipcode"<<endl;

    return 0;
}
