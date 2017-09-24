#include <iostream>

using namespace std;

class String {
public:
	String() {
		cout << "String() 생성자 호출" << endl;
		strData = NULL;
		len = 0;
	}
	String(const char *str) {
		cout << "String(const char*) 생성자 호출" << endl;
		len = strlen(str);
		strData = new char[len + 1]; // 맨 끝에 NULL문자
		cout << "strData 할당 : " << (void*)strData << endl;
		strcpy(strData, str); // 깊은 복사
		
	}
	String(const String &rhs) {
		cout << "String(String &rhs) 생성자 호출" << endl;
		strData = new char[rhs.len + 1]; // 맨 끝에 NULL문자
		cout << "strData 할당 : " << (void*)strData << endl;
		strcpy(strData, rhs.strData); // 깊은 복사
		len = rhs.len; // 깊은 복사
	}
	~String() {
		cout << "~String() 소멸자 호출" << endl;
		delete[] strData;
		cout << "strData 해제됨 : " << (void*)strData << endl;
		strData = NULL;
	}
	String &operator=(const String &rhs) {
		if (this != &rhs) {
			delete[] strData;
			strData = new char[rhs.len + 1]; // 맨 끝에 NULL문자
			cout << "strData 할당 : " << (void*)strData << endl;
			strcpy(strData, rhs.strData); // 깊은 복사
			len = rhs.len; // 깊은 복사
		}
		return *this;
	}

	char *GetStrData() const {
		return strData;
		
	}

	int GetLen() const {
		return len;
	}
private:
	char *strData;
	int len;
};

int main() {
	String s1("안녕");
	String s2(s1); // 복사 생성자
	String s3("Hello");
	s3.operator=(s3);

	cout << s1.GetStrData() << endl;
	cout << s2.GetStrData() << endl;
	cout << s3.GetStrData() << endl;
}