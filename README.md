★ 立ち上げ方法
➀ Docker
docker compose up -d

➁ Spring Bootを立ち上げる前に、以下4行を実行する
$env:DB_NAME="educational_app"
$env:DB_USERNAME="postgres"
$env:DB_PASSWORD="password"
$env:DB_PORT="5433"

➂ Spring Boot
.\gradlew.bat bootRun

★ 停止方法
➀ Spring Boot
Ctrl + C

➁ Docker
docker compose down

★ ログインURL
http://localhost:8080/

★PostgreSQLの中に入る
docker exec -it educational-postgres psql -U postgres -d educational_app

★テーブル一覧を見る
\dt

★lessonテーブルの構造を見る
\d lesson

★psqlから抜ける
\q
