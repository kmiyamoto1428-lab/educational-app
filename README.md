★立ち上げ方法
docker compose up -d
.\gradlew.bat bootRun

★停止方法
Spring Boot
Ctrl + C

Docker
docker compose down

★ログインURL
http://localhost:8080/

★PostgreSQLの中に入る
docker exec -it educational-postgres psql -U postgres -d educational_app

★テーブル一覧を見る
\dt

★lessonテーブルの構造を見る
\d lesson

★psqlから抜ける
\q

