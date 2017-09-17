#include <iostream>

using namespace std;

// 생성자: 맴버 변수 초기화

class Complex {
public:
	Complex() {
		real = 0;
		imag = 0;
	}
	Complex(double real_, double imag_) {
		real = real_;
		imag = imag_;
	}
	double GetReal() {
		return real;
	}
	void SetReal(double real_) {
		real = real_;
	}
	double GetImag() {
		return imag;
	}
	void SetImag(double imag_) {
		imag = imag_;
	}
private:
	double real;
	double imag;
};

int main() {
	Complex c1;
	Complex c2 = Complex(2, 3);
	Complex c3(2, 3);
	Complex c4 = { 2, 3 };
	Complex c5 = Complex{ 2, 3 };
	Complex c6{ 2, 3 };
	
	cout << "c1 = " << c1.GetReal() << ", " << c1.GetImag() << endl;
	cout << "c2 = " << c2.GetReal() << ", " << c2.GetImag() << endl;
	cout << "c3 = " << c3.GetReal() << ", " << c3.GetImag() << endl;
	cout << "c4 = " << c4.GetReal() << ", " << c4.GetImag() << endl;
	cout << "c5 = " << c5.GetReal() << ", " << c5.GetImag() << endl;
	cout << "c6 = " << c6.GetReal() << ", " << c6.GetImag() << endl;
}