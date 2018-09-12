from UnexpectedRSPValue import UnexpectedRSPValue

value = '가'
try:
    if value not in ['가위', '바위', '보']:
        raise UnexpectedRSPValue("가위바위보 중에 하나의 값이어야 합니다")
except UnexpectedRSPValue:
    print("에러가 발생했습니다.")
