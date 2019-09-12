//============================================================================
// Name        : Rolling.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int min = 1, max = 6;
	string roll_again;
	cout << "Roll the dice? (Y/N)" << endl;

	cin >> roll_again;

	while(roll_again == "y") {
		cout << "Rolling the dices" << endl;
		cout << "The values are..." << endl;

		cout << rand() % max + min << endl;
		cout << rand() % max + min << endl;

		cout << "Would you like to roll again? (Y/N)" << endl;

		cin >> roll_again;

		if (roll_again == "n") {
			cout<< "Thanks for playing!" << endl;
		}

	}
}
