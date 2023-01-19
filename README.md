# Step1

## 기능 요구사항

- [x] 토큰 발급하는 API 생성
- [x] 내 정보 조회하기 API 생성
    - [x] 토큰을 이용하여 본인 정보 응답하기

## 프로그래밍 요구사항

- 인증 로직은 Controller에서 구현하기 보다는 재사용이 용이하도록 분리하여 구현하다.
    - 가능하면 Controller와 인증 로직을 분리한다.
- 토큰을 이용한 인증 프로세스에 대해 이해가 어려운 경우 페어와 함께 추가학습을 진행한다.

# Step2

## 기능 요구사항

- 예약하기, 예약취소 개선
    - 아래의 API 설계에 맞춰 API 스펙을 변경한다.
    - 비로그인 사용자는 예약이 불가능하다.
    - 자신의 예약이 아닌 경우 예약 취소가 불가능하다.

## 프로그래밍 요구사항

- `HandlerMethodArgumentResolver`를 활용한다.

## 기능 구현 사항

- [x] 예약 생성 API
- [x] 예약 취소 API

# step3

## 기능 요구사항

- 관리자 역할을 추가한다.
- 일반 멤버와 관리자 멤버를 구분한다.
- 관리자 기능을 보호한다.
- 관리자 관련 기능 API는 /admin 붙이고 interceptor로 검증한다.
- 관리자 관련 기능 API는 authorization 헤더를 이용하여 인증과 인가를 진행한다.
- 그 외 관리자 API는 자유롭게 설계하고 적용한다.

## 프로그래밍 요구사항

- 관리자를 등록하도록 하기 보다는 애플리케이션이 동작할 때 관리자는 추가될 수 있도록 한다

## 기능 구현 사항

- [ ] 애플리케이션 동작시 관리자 역할을 하는 멤버 추가
- [ ] 관리자 관련 기능 API에 /admin 설정
    - 테마 생성
    - 테마 삭제
    - 스케줄 생성
    - 스케줄 삭제
- [ ] 관리자 관련 API에 관리자 권한 부여