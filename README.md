### GDGoc fall study ( spring full stack project ) 

---

자바 기반 풀스택 개발자 양성과정의 개인 프로젝트.

- **프로젝트 기간**: 2025.10.4 ~ 2026.1.3  
- **개발자**: 주보경 (개인프로젝트)
- **수업 자료**: 인프런 

## 목차
1. [프로젝트 개요](#1-프로젝트-개요)
2. [프로젝트 구성](#2-프로젝트-구성)
3. [프로젝트 수행과정 및 결과](#3-프로젝트-수행과정-및-결과)
4. [프로젝트 후기](#4-프로젝트-후기)


## 1. 프로젝트 개요

### 프로젝트 필요성
- 기본적인 게시판 CRUD 구현
- 스프링 시큐리티를 통한 인증 및 인가 과정 구현
- XSS 공격 방지, CSRF 방지 등 기본적인 보안 처리 해결방법 제시


### 구현 기능
- Spring Security 구현
- API 설계
- DB 설계
- 프로젝트 환경 구성
- 게시판(CRUD) 개발
- 로그인/로그아웃 및 회원가입 기능 구현


## 2. 프로젝트 구성

### 기술 스택

| 구분 | 기술 |
|---|---|
| OS | Windows |
| Server | Amazon AWS |
| Database | MySQL |
| Testing | Swagger |
| Frontend | HTML5, CSS3, JavaScript |
| Backend | Spring Boot (v3.3.3), Java (OpenJDK-23) |
| IDE | Intellij, MySQL Workbench |
| Collaboration | GitHub, Notion |


## API 명세서

| Method | Endpoint | 설명 |
|---|---|---|
| DELETE | /menu/delete/{idx} | 메뉴 삭제 |
| GET | /menu/{idx} | 메뉴 상세 조회 |
| GET | /menu/all | 전체 메뉴 조회 |
| POST | /menu/add | 메뉴 추가 |
| PUT | /menu/update/{idx} | 메뉴 수정 |
| PUT | /menu/count/{idx} | 조회수 증가 |


## 3. 프로젝트 수행과정 및 결과
- 수행과정: 
- 결과: 


## 4. 프로젝트 후기
- 후기: 기본적인 spring boot에서의 코드 흐름 (mapper, service, controller)을 정확하게 코드로 쳐보면서 점검할 수 있는 아주 좋은 프로젝트였다. 뿐만아니라 실제 db까지 설계해 보고 회원가입 과정을 살펴보았고, swagger 문서의 설정 과정을 알 수 있었으며 배포하는 과정에서 AWS를 처음 접해보는 좋은 경험이었다.











