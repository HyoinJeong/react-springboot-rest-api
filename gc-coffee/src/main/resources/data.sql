-- 테스트 계정
-- TODO: 테스트용이지만 비밀번호가 노출된 데이터 세팅. 개선하는 것이 좋을 지 고민해 보자.

-- 123 게시글
insert into article (title, content,type, created_by, updated_by, created_at, updated_at) values
    ('Quisque ut erat.', 'hi','주문', 'Kamilah', 'Murial', '2021-05-30 23:53:46', '2021-03-10 08:48:50');