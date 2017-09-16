/*
3. 다음과 같은 함수 정의에서 컴파일 오류가 나는 이유를 찾아보세요.
*/

/*
void drawRectangle(int l, int r, int t, int b) {
}

void drawRectangle(int x = 0, int y = 0, int w, int h) {
}
*/

/*
답:
 디폴트 변수가 왼쪽부터 시작되었습니다.
 변수 개수가 같습니다.
*/