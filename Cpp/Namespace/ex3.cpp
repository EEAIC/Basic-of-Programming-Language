#include <iostream>

int n;
void set() {
	n = 10;
}

namespace Gcon{
	int n;
	void set() {
		n = 20;
	}

	namespace google {
		int n;
		void set() {
			n = 30;
		}
	}
}

int main() {
	using namespace std;
	using namespace Gcon;

	::set();
	Gcon::set();
	google::set();

	cout << ::n << endl;
	cout << Gcon::n << endl;
	cout << Gcon::google::n << endl;
}