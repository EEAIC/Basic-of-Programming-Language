#include <iostream>

using namespace std;

int n;
void set();
namespace Gcon {
	int n;
	void set();
}
namespace google {
	int n;
	void set();
}

int main() {
	::set();
	Gcon::set();
	google::set();

	cout << ::n << endl;
	cout << Gcon::n << endl;
	cout << google::n << endl;
}

void set() {
	n = 10;
}

void Gcon::set() {
		n = 20;
}

void google::set() {
	n = 30;
}