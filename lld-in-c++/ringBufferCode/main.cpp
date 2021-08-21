#include <iostream>
#include <string>
#include "ring.h"

using namespace std;

int main() {
	ring<string> buffer(3);
	buffer.add("one");
	buffer.add("two");
	buffer.add("three");
	buffer.add("four");


	for (ring<string>::iterator it = buffer.begin(); it != buffer.end(); it++) {
		cout << *it << endl;
	}
	cout << endl;

	for (string item : buffer) {
		cout << item << endl;
	}


	return 0;
}